package com.example.bikearound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class PaymentActivity extends AppCompatActivity {

    private TextView dateText, timeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        dateText = (TextView) findViewById(R.id.date_text_id);
        timeText = (TextView) findViewById(R.id.time_text_id);

        long date = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
        String dateString = simpleDateFormat.format(date);
        dateText.setText(dateString);

        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("h:mm a");
        String timeString = simpleTimeFormat.format(date);
        timeText.setText(timeString);
    }
}
