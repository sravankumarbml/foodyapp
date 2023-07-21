package com.example.foodyapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodyapplication.R;
import com.example.foodyapplication.models.CategoriesModel;
import com.example.foodyapplication.models.OffersModel;

import java.util.ArrayList;

public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoriesRecyclerAdapter.holder> {

    ArrayList<CategoriesModel> data;

    public CategoriesRecyclerAdapter(ArrayList<CategoriesModel> data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public CategoriesRecyclerAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.practice,parent,false);
        return new CategoriesRecyclerAdapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesRecyclerAdapter.holder holder, int position) {
        CategoriesModel currentItem=data.get(position);
        holder.img.setImageResource(currentItem.getImg());
        holder.tagName.setText(currentItem.getTagName());
        holder.name.setText(currentItem.getName());
        holder.price.setText(currentItem.getPrice());
        holder.rating.setText(Float.toString(currentItem.getRating()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class holder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView name;
        TextView tagName;
        TextView price;
        TextView rating;
        public holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.imageView);

            name=(TextView) itemView.findViewById(R.id.categorytext1);
            tagName=(TextView)itemView.findViewById(R.id.categorytext2);
            rating=(TextView) itemView.findViewById(R.id.popularfoodrating);
            price=(TextView)itemView.findViewById(R.id.popularfoodPrice);
        }
    }
}
