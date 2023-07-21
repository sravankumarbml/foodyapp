package com.example.foodyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class hotelviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelview);

        RelativeLayout hotelView=findViewById(R.id.Hotelfood1);
        hotelView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hotelviewActivity.this,ItemviewActivity.class));
            }
        });

        ImageView back=findViewById(R.id.icon1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hotelviewActivity.this,RestaurentsActivity.class));
            }
        });

        TextView placeOrder=findViewById(R.id.box3);
        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hotelviewActivity.this,OrderplacedActivity.class));
            }
        });
    }
}