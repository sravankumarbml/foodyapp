package com.example.foodyapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodyapplication.R;
import com.example.foodyapplication.models.PopularFoodsModel;

import java.util.ArrayList;

public class GroceryRecyclerAdapter extends RecyclerView.Adapter<GroceryRecyclerAdapter.holder> {

    ArrayList<PopularFoodsModel> data;

    public GroceryRecyclerAdapter(ArrayList<PopularFoodsModel> data){
        this.data=data;
    }


    @NonNull
    @Override
    public GroceryRecyclerAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.onetap,parent,false);
        return new GroceryRecyclerAdapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryRecyclerAdapter.holder holder, int position) {
        PopularFoodsModel currentItem=data.get(position);
        holder.img.setImageResource(currentItem.getImg());
        holder.name.setText(currentItem.getName());
        holder.price.setText(Float.toString(currentItem.getRate()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class holder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView price;

        TextView name;

        public holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.offerimage);
            price=(TextView)itemView.findViewById(R.id.groceryofferitemrate);
            name=(TextView) itemView.findViewById(R.id.groceryofferitemtext);
        }
    }
}
