package com.example.bikearound;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.plaid.link.Plaid;
import com.plaid.linkbase.models.LinkCancellation;
import com.plaid.linkbase.models.LinkConfiguration;
import com.plaid.linkbase.models.LinkConnection;
import com.plaid.linkbase.models.LinkConnectionMetadata;
import com.plaid.linkbase.models.PlaidApiError;
import com.plaid.linkbase.models.PlaidProduct;
import com.plaid.link.Plaid;

import org.w3c.dom.Text;

import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class PaymentActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    private static final int LINK_REQUEST_CODE = 1;

    private TextView dateText, timeText, rateTypeText, flatFeeText, rateChargeText, totalCostText;
    private EditText durationEditText;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
    private SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("h:mm a");

    private static final int DEFAULT_DURATION = 1;
    private static final int FLAT_FEE = 5;
    private static final int HOURLY_RATE = 20;
    private static final int DAILY_RATE = 45;
    private static final int WEEKLY_RATE = 100;
    private int rate, duration, rateCharge, totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        dateText = (TextView) findViewById(R.id.date_text_id);
        timeText = (TextView) findViewById(R.id.time_text_id);
        rateTypeText = (TextView) findViewById(R.id.rate_type_text_id);
        flatFeeText = (TextView) findViewById(R.id.flat_fee_text_id);
        rateChargeText = (TextView) findViewById(R.id.rate_charge_text_id);
        totalCostText = (TextView) findViewById(R.id.total_text_id) ;
        durationEditText = (EditText) findViewById(R.id.duration_edit_text_id);

        // Calculate fees
        rate = HOURLY_RATE;
        duration = DEFAULT_DURATION;
        rateCharge = rate * duration;
        rateChargeText.setText(String.format(Locale.US, "%d.00", rateCharge));
        totalCost = FLAT_FEE + rateCharge;
        totalCostText.setText(String.format(Locale.US, "$%d.00", totalCost));

        // Get current time
        long date = System.currentTimeMillis();

        String dateString = simpleDateFormat.format(date);
        dateText.setText(dateString);

        String timeString = simpleTimeFormat.format(date);
        timeText.setText(timeString);
    }

    public void dateOnClick(View v) {
        showDatePickerDialog();
    }

    public void timeOnClick(View v) {
        showTimePickerDialog();
    }

    public void payButton(View v) {
        Plaid.create(this.getApplication());
        ArrayList<PlaidProduct> products = new ArrayList<>();
        products.add(PlaidProduct.TRANSACTIONS);
        Plaid.openLink(
                PaymentActivity.this,
                new LinkConfiguration.Builder("Test App", products).build(),
                LINK_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(
            int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LINK_REQUEST_CODE && data != null) {
            if (resultCode == Plaid.RESULT_SUCCESS) {
                Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
            } else if (resultCode == Plaid.RESULT_CANCELLED) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else if (resultCode == Plaid.RESULT_EXIT) {
                Toast.makeText(this, "Exited", Toast.LENGTH_LONG).show();
            } else if (resultCode == Plaid.RESULT_EXCEPTION) {
                Toast.makeText(this, "Exception occurred", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        // TODO implement onDateSet()
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.HOUR_OF_DAY),
                Calendar.getInstance().get(Calendar.MINUTE),
                false);
        timePickerDialog.show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // TODO
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.option1_radio_id:
                if (checked) {
                    rateTypeText.setText(R.string.hours);
                    rate = HOURLY_RATE;
                    if (!(durationEditText.getText().toString().equals("") & (durationEditText.getText().toString() != null))) {
                        duration = Integer.parseInt(durationEditText.getText().toString());
                    }
                    else {
                        duration = DEFAULT_DURATION;
                    }
                    rateCharge = rate * duration;
                    rateChargeText.setText(String.format(Locale.US, "%d.00", rateCharge));
                    totalCost = FLAT_FEE + rateCharge;
                    totalCostText.setText(String.format(Locale.US, "$%d.00", totalCost));
                }
                break;
            case R.id.option2_radio_id:
                if (checked) {
                    rateTypeText.setText(R.string.days);
                    rate = DAILY_RATE;
                    if (!(durationEditText.getText().toString().equals("") & (durationEditText.getText().toString() != null))) {
                        duration = Integer.parseInt(durationEditText.getText().toString());
                    }
                    else {
                        duration = DEFAULT_DURATION;
                    }
                    rateCharge = rate * duration;
                    rateChargeText.setText(String.format(Locale.US, "%d.00", rateCharge));
                    totalCost = FLAT_FEE + rateCharge;
                    totalCostText.setText(String.format(Locale.US, "$%d.00", totalCost));
                }
                break;
            case R.id.option3_radio_id:
                if (checked) {
                    rateTypeText.setText(R.string.weeks);
                    rate = WEEKLY_RATE;
                    if (!(durationEditText.getText().toString().equals("") & (durationEditText.getText().toString() != null))) {
                        duration = Integer.parseInt(durationEditText.getText().toString());
                    }
                    else {
                        duration = DEFAULT_DURATION;
                    }
                    rateCharge = rate * duration;
                    rateChargeText.setText(String.format(Locale.US, "%d.00", rateCharge));
                    totalCost = FLAT_FEE + rateCharge;
                    totalCostText.setText(String.format(Locale.US, "$%d.00", totalCost));
                }
                break;
        }
    }
}
