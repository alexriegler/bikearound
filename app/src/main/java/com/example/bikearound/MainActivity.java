package com.example.bikearound;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Bike> bikeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bikeList = new ArrayList<>();
        // TODO Add realistic test data
        bikeList.add(new Bike("Blue Proline BMX", "Herschel Boykin", "4.8", "BMX", "Description", R.drawable.bmx1));
        bikeList.add(new Bike("Black Felt BMX", "Ernest Khatak", "4.6", "BMX", "Description", R.drawable.bmx2));
        bikeList.add(new Bike("Black Felt BMX", "Hien Salehi", "4.6", "BMX", "Description", R.drawable.rickshaw1));
        bikeList.add(new Bike("Black Felt BMX", "Ina Braymer", "4.6", "BMX", "Description", R.drawable.road1));
        bikeList.add(new Bike("Black Felt BMX", "Angelo Shivley", "4.6", "BMX", "Description", R.drawable.road2));
        bikeList.add(new Bike("Black Felt BMX", "Raeann Kull", "4.6", "BMX", "Description", R.drawable.road3));
        bikeList.add(new Bike("Black Felt BMX", "Rayford Bate", "4.6", "BMX", "Description", R.drawable.tandem1));
        bikeList.add(new Bike("Black Felt BMX", "Karyn Mackstutis", "4.6", "BMX", "Description", R.drawable.trailer1));
        bikeList.add(new Bike("Black Felt BMX", "Wilfredo Gossin", "4.6", "BMX", "Description", R.drawable.trike1));
        bikeList.add(new Bike("Black Felt BMX", "Doretta Maestre", "4.6", "BMX", "Description", R.drawable.trike2));
        // Duplicate population
        bikeList.add(new Bike("Blue Proline BMX", "Herschel Boykin", "4.8", "BMX", "Description", R.drawable.bmx1));
        bikeList.add(new Bike("Black Felt BMX", "Ernest Khatak", "4.6", "BMX", "Description", R.drawable.bmx2));
        bikeList.add(new Bike("Black Felt BMX", "Hien Salehi", "4.6", "BMX", "Description", R.drawable.rickshaw1));
        bikeList.add(new Bike("Black Felt BMX", "Ina Braymer", "4.6", "BMX", "Description", R.drawable.road1));
        bikeList.add(new Bike("Black Felt BMX", "Angelo Shivley", "4.6", "BMX", "Description", R.drawable.road2));
        bikeList.add(new Bike("Black Felt BMX", "Raeann Kull", "4.6", "BMX", "Description", R.drawable.road3));
        bikeList.add(new Bike("Black Felt BMX", "Rayford Bate", "4.6", "BMX", "Description", R.drawable.tandem1));
        bikeList.add(new Bike("Black Felt BMX", "Karyn Mackstutis", "4.6", "BMX", "Description", R.drawable.trailer1));
        bikeList.add(new Bike("Black Felt BMX", "Wilfredo Gossin", "4.6", "BMX", "Description", R.drawable.trike1));
        bikeList.add(new Bike("Black Felt BMX", "Doretta Maestre", "4.6", "BMX", "Description", R.drawable.trike2));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, bikeList);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);
    }
}
