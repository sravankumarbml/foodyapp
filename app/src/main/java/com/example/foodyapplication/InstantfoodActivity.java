package com.example.foodyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.foodyapplication.adapters.GroceryRecyclerAdapter;
import com.example.foodyapplication.models.PopularFoodsModel;

import java.util.ArrayList;

public class InstantfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instantfood);

        TextView ordersbutton=findViewById(R.id.ordersbutton);
        ordersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InstantfoodActivity.this,MainActivity.class));
            }
        });

        TextView InstantButton=findViewById(R.id.Instantbutton);
        InstantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InstantfoodActivity.this,InstantfoodActivity.class));
            }
        });

        TextView grocerybutton=findViewById(R.id.grocerybutton);
        grocerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InstantfoodActivity.this,GroceryActivity.class));
            }
        });

        RecyclerView rcv1=(RecyclerView)findViewById(R.id.bestCart_rcv);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcv1.setLayoutManager(linearLayoutManager1);

        ArrayList<PopularFoodsModel> offerItems=new ArrayList<>();
        offerItems.add(new PopularFoodsModel(R.drawable.bc1,450f,"Kaju Katli"));
        offerItems.add(new PopularFoodsModel(R.drawable.bc2,210f,"Cookies"));
        offerItems.add(new PopularFoodsModel(R.drawable.bc3,90f,"Bhel puri"));
        offerItems.add(new PopularFoodsModel(R.drawable.bc1,450f,"Kaju Katli"));
        offerItems.add(new PopularFoodsModel(R.drawable.bc2,210f,"Cookies"));
        offerItems.add(new PopularFoodsModel(R.drawable.bc3,90f,"Bhel puri"));


        rcv1.setAdapter(new GroceryRecyclerAdapter(offerItems));

        RelativeLayout instantFood=findViewById(R.id.instantfood1);
        instantFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InstantfoodActivity.this,ItemviewActivity.class));
            }
        });
    }
}