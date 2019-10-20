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
        bikeList.add(new Bike("Blue Proline BMX", "Herschel Boykin", "Rating: 4.8", "BMX", "Brand: Red Line\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "Configuration: Full Bicycle\n" +
                "\n" +
                "Model: Proline\n" +
                "\n" +
                "MPN: Does Not Apply\n" +
                "\n" +
                "Frame Material: Aluminum\n" +
                "\n" +
                "Color: White\n" +
                "\n" +
                "Number of Gears: 1\n", R.drawable.bmx1));
        bikeList.add(new Bike("Black Felt BMX", "Ernest Khatak", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.bmx2));



        bikeList.add(new Bike("Black Felt BMX", "Hien Salehi", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.rickshaw1));


        bikeList.add(new Bike("Black Felt BMX", "Ina Braymer", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.road1));


        bikeList.add(new Bike("Black Felt BMX", "Angelo Shivley", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.road2));


        bikeList.add(new Bike("Black Felt BMX", "Raeann Kull", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.road3));


        bikeList.add(new Bike("Black Felt BMX", "Rayford Bate", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.tandem1));


        bikeList.add(new Bike("Black Felt BMX", "Karyn Mackstutis", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.trailer1));


        bikeList.add(new Bike("Black Felt BMX", "Wilfredo Gossin", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.trike1));


        bikeList.add(new Bike("Black Felt BMX", "Doretta Maestre", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.trike2));


        // Duplicate population
        bikeList.add(new Bike("Blue Proline BMX", "Herschel Boykin", "Rating: 4.8", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.bmx1));


        bikeList.add(new Bike("Black Felt BMX", "Ernest Khatak", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.bmx2));


        bikeList.add(new Bike("Black Felt BMX", "Hien Salehi", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.rickshaw1));


        bikeList.add(new Bike("Black Felt BMX", "Ina Braymer", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.road1));


        bikeList.add(new Bike("Black Felt BMX", "Angelo Shivley", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.road2));


        bikeList.add(new Bike("Black Felt BMX", "Raeann Kull", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.road3));


        bikeList.add(new Bike("Black Felt BMX", "Rayford Bate", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.tandem1));


        bikeList.add(new Bike("Black Felt BMX", "Karyn Mackstutis", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.trailer1));


        bikeList.add(new Bike("Black Felt BMX", "Wilfredo Gossin", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.trike1));


        bikeList.add(new Bike("Black Felt BMX", "Doretta Maestre", "Rating: 4.6", "BMX", "Brand: Felt" +
                "\n" +
                "Manufacturer Color: Flat Black\n" +
                "\n" +
                "Frame Material: 100% Hi-Tensile Steel\n" +
                "\n" +
                "Color: Black\n" +
                "\n" +
                "Modified Item: No\n" +
                "\n" +
                "Features: Adjustable Seat, Reflectors\n" +
                "\n" +
                "Model: Base 20\n" +
                "\n" +
                "Wheel Size: 20\"\n" +
                "\n" +
                "BMX Bar Number of Gears: 1\n" +
                "\n" +
                "Frame Size: 9 Inch Seatpost tube, 18.5 in TT, 14.25 CS\n" +
                "\n" +
                "Type: BMX Bike\n" +
                "\n" +
                "Brake Type: BMX Gyro\n" +
                "\n", R.drawable.trike2));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, bikeList);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);
    }
}
