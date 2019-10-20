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
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class PaymentActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    private static final int LINK_REQUEST_CODE = 1;
    private TextView contentTextView;

    private TextView dateText, timeText;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
    private SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("h:mm a");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        dateText = (TextView) findViewById(R.id.date_text_id);
        timeText = (TextView) findViewById(R.id.time_text_id);

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
}
