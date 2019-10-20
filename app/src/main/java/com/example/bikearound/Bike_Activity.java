package com.example.bikearound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bike_Activity extends AppCompatActivity {

    private TextView tvname, tvtype, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_);

        tvname = (TextView) findViewById(R.id.txtName);
        tvtype = (TextView) findViewById(R.id.txtType);
        tvdescription = (TextView) findViewById(R.id.txtDescription);
        img = (ImageView) findViewById(R.id.bikethumbnail);

        // Receive data
        Intent intent = getIntent();
        String name = intent.getExtras().getString("Name");
        String description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        // Setting values
        tvname.setText(name);
        tvdescription.setText(description);
        img.setImageResource(image);
    }
}
