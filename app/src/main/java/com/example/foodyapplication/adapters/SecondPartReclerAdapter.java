package com.example.foodyapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodyapplication.R;
import com.example.foodyapplication.models.OffersModel;
import com.example.foodyapplication.models.PopularFoodsModel;

import java.util.ArrayList;

public class SecondPartReclerAdapter extends RecyclerView.Adapter<SecondPartReclerAdapter.holder1> {
    ArrayList<PopularFoodsModel> data;

    public SecondPartReclerAdapter(ArrayList<PopularFoodsModel> data){
        this.data=data;
    }

    @NonNull
    @Override
    public holder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.secondpart,parent,false);
        return new SecondPartReclerAdapter.holder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder1 holder, int position) {
        PopularFoodsModel currentItem=data.get(position);
        holder.img.setImageResource(currentItem.getImg());
       holder.name.setText(currentItem.getName());
       holder.rate.setText(Float.toString(currentItem.getRate()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class holder1 extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView rate;

        TextView name;

        public holder1(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.popularfoodimg);
            rate=(TextView)itemView.findViewById(R.id.popularfoodrating);
            name=(TextView) itemView.findViewById(R.id.popularfooditem);
        }
    }
}
