package com.example.vincent.noodleking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

//    private Button buttonGo;
//    private TextView textViewMap;
//
//    Spinner spinnerDistance = (Spinner) findViewById(R.id.spinnerDistance);
//
//
//    ArrayAdapter<CharSequence> distanceList = ArrayAdapter.createFromResource(MenuActivity.this,
//            R.array.distance,
//            android.R.layout.simple_spinner_dropdown_item);
//    {spinnerDistance.setAdapter(distanceList);
//
//        Spinner spinner = (Spinner) findViewById(R.id.spinnerPrice);
//        ArrayAdapter<CharSequence> priceList = ArrayAdapter.createFromResource(MenuActivity.this,
//                R.array.price,
//                android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(priceList);
//
//
//        //buttonGo = (Button) findViewById(R.id);
//
//        textViewMap = (TextView) findViewById(R.id.TextViewMap);
//
//        buttonGo.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Intent intent = new Intent(getBaseContext(), MapsActivity.class);
//                //vincent 20180513
//
//                //startActivity(intent);
//                //MapsActivity mapsActivity = new MapsActivity(map);
//                //MapsActivity spinnerDistance = (MapsActivity) findViewById(R.id.map);
//                //textViewMap.setText("~Map~");
//            }
//        });
//    }
}
