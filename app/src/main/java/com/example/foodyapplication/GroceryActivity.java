package com.example.foodyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.foodyapplication.adapters.GroceryRecyclerAdapter;
import com.example.foodyapplication.adapters.SecondPartReclerAdapter;
import com.example.foodyapplication.models.PopularFoodsModel;

import java.util.ArrayList;

public class GroceryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);

        RecyclerView rcv1=(RecyclerView)findViewById(R.id.grocery_rcv);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcv1.setLayoutManager(linearLayoutManager1);

        ArrayList<PopularFoodsModel> offerItems=new ArrayList<>();
        offerItems.add(new PopularFoodsModel(R.drawable.tc1,170f,"Ketchup"));
        offerItems.add(new PopularFoodsModel(R.drawable.tc2,140f,"Dairy milk"));
        offerItems.add(new PopularFoodsModel(R.drawable.tc3,210f,"Ariel"));
        offerItems.add(new PopularFoodsModel(R.drawable.tc1,170f,"Ketchup"));
        offerItems.add(new PopularFoodsModel(R.drawable.tc2,140f,"Dairy milk"));
        offerItems.add(new PopularFoodsModel(R.drawable.tc3,210f,"Ariel"));


        rcv1.setAdapter(new GroceryRecyclerAdapter(offerItems));

        TextView ordersbutton=findViewById(R.id.ordersbutton);
        ordersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GroceryActivity.this,MainActivity.class));
            }
        });

        TextView InstantButton=findViewById(R.id.Instantbutton);
        InstantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GroceryActivity.this,InstantfoodActivity.class));
            }
        });

        TextView grocerybutton=findViewById(R.id.grocerybutton);
        grocerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GroceryActivity.this,GroceryActivity.class));
            }
        });

        TextView seeCategories=findViewById(R.id.seegroceries);
        seeCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GroceryActivity.this,CategoriesActivity.class));
            }
        });
    }
}