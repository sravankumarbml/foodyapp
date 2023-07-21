package com.example.foodyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.foodyapplication.adapters.RecyclerViewAdapter;
import com.example.foodyapplication.adapters.SecondPartReclerAdapter;
import com.example.foodyapplication.models.OffersModel;
import com.example.foodyapplication.models.PopularFoodsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rcv=(RecyclerView)findViewById(R.id.rclview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcv.setLayoutManager(linearLayoutManager);

        ArrayList<OffersModel> offers=new ArrayList<>();
        offers.add(new OffersModel(R.drawable.pic1,5.0f,230,"Paneer butter masala","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.chickenbiryani,4.9f,310,"Chicken Fry biryani","Sagar ratna","NV"));
        offers.add(new OffersModel(R.drawable.noodles,4.0f,210,"Chineese Noodles","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.eo1,5.0f,230,"Chicken Fry","Sagar ratna","NV"));
        offers.add(new OffersModel(R.drawable.eo2,4.8f,330,"Chenna Masala","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.eo3,4.5f,230,"Butter Naan's","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.pic1,5.0f,230,"Paneer butter masala","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.chickenbiryani,4.9f,310,"Chicken Fry biryani","Sagar ratna","NV"));
        offers.add(new OffersModel(R.drawable.noodles,4.0f,210,"Chineese Noodles","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.eo1,5.0f,230,"Chicken Fry","Sagar ratna","NV"));
        offers.add(new OffersModel(R.drawable.eo2,4.8f,330,"Chenna Masala","Sagar ratna","Veg"));
        offers.add(new OffersModel(R.drawable.eo3,4.5f,230,"Butter Naan's","Sagar ratna","Veg"));

        rcv.setAdapter(new RecyclerViewAdapter(this,offers));


        RecyclerView rcv1=(RecyclerView)findViewById(R.id.rclview1);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcv1.setLayoutManager(linearLayoutManager1);

        ArrayList<PopularFoodsModel> popularFoods=new ArrayList<>();
        popularFoods.add(new PopularFoodsModel(R.drawable.pf1,5.0f,"Misal Pav"));
        popularFoods.add(new PopularFoodsModel(R.drawable.pf2,4.6f,"Makki Di Roti"));
        popularFoods.add(new PopularFoodsModel(R.drawable.pf3,3.9f,"Rogan Josh"));
        popularFoods.add(new PopularFoodsModel(R.drawable.pf4,4.0f,"Papaya Khar"));
        popularFoods.add(new PopularFoodsModel(R.drawable.pf5,5.0f,"Dhokla"));

        rcv1.setAdapter(new SecondPartReclerAdapter(popularFoods));

        TextView ordersbutton=findViewById(R.id.ordersbutton);
        ordersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });

        TextView InstantButton=findViewById(R.id.Instantbutton);
        InstantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,InstantfoodActivity.class));
            }
        });

        TextView grocerybutton=findViewById(R.id.grocerybutton);
        grocerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GroceryActivity.class));
            }
        });

        TextView seeHotels=findViewById(R.id.seeHotels);
        seeHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RestaurentsActivity.class));
            }
        });

        TextView seeCategories=findViewById(R.id.seecaregories);
        seeCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CategoriesActivity.class));
            }
        });



    }
}