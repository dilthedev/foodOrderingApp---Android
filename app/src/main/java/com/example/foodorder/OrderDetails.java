package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {


    TextView listView,priceView;
    String list_choice;
    Double price_rs, price_usd,round_usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        //getting the passed values from main activity
        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_rs = bundle.getDouble("price");

        //converting price into usd

        price_usd = price_rs/174.0;
        round_usd = Math.round(price_usd*100.0)/100.0;

        listView.setText(list_choice);
        priceView.setText("RS :"+price_rs.toString()+" || USD :"+round_usd.toString());




    }
}
