package com.example.foodyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodyapplication.adapters.CategoriesRecyclerAdapter;
import com.example.foodyapplication.adapters.SecondPartReclerAdapter;
import com.example.foodyapplication.models.CategoriesModel;
import com.example.foodyapplication.models.PopularFoodsModel;

import java.util.ArrayList;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        RecyclerView rcv1=(RecyclerView)findViewById(R.id.categories_rcv);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        rcv1.setLayoutManager(linearLayoutManager1);

        ArrayList<CategoriesModel> categoryFoods=new ArrayList<>();
        categoryFoods.add(new CategoriesModel(R.drawable.ct1,"Urad dall","Priya's company","200",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct2,"Raw Peanuts","Priya's company","180",4.8f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct3,"Rajma","Priya's company","250",4.7f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct4,"Red Gram","Priya's company","210",3.9f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct5,"Moong dall","priya's company","230",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct1,"Urad dall","Priya's company","200",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct2,"Raw Peanuts","Priya's company","180",4.8f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct3,"Rajma","Priya's company","250",4.7f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct4,"Red Gram","Priya's company","210",3.9f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct5,"Moong dall","priya's company","230",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct1,"Urad dall","Priya's company","200",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct2,"Raw Peanuts","Priya's company","180",4.8f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct3,"Rajma","Priya's company","250",4.7f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct4,"Red Gram","Priya's company","210",3.9f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct5,"Moong dall","priya's company","230",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct1,"Urad dall","Priya's company","200",5.0f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct2,"Raw Peanuts","Priya's company","180",4.8f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct3,"Rajma","Priya's company","250",4.7f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct4,"Red Gram","Priya's company","210",3.9f));
        categoryFoods.add(new CategoriesModel(R.drawable.ct5,"Moong dall","priya's company","230",5.0f));
        rcv1.setAdapter(new CategoriesRecyclerAdapter(categoryFoods));

        ImageView back=findViewById(R.id.icon1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoriesActivity.this,MainActivity.class));
            }
        });
    }
}