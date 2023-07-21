package com.example.foodyapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodyapplication.ItemviewActivity;
import com.example.foodyapplication.MainActivity;
import com.example.foodyapplication.R;
import com.example.foodyapplication.models.OffersModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.holder> {

    ArrayList<OffersModel> data;
    Context context;

    public RecyclerViewAdapter(Context context, ArrayList<OffersModel> data)
    {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_row,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position)
    {
        OffersModel currentItem=data.get(position);
        holder.img.setImageResource(currentItem.getImg());
        holder.foodType.setText(currentItem.getFoodType());
        holder.name.setText(currentItem.getName());
        holder.rate.setText(Float.toString(currentItem.getRate()));
        holder.hotelName.setText(currentItem.getHotelName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ItemviewActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class holder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView rate;
        TextView price;
        TextView name;
        TextView hotelName;
        TextView foodType;
        public holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.offerimage);
            rate=(TextView)itemView.findViewById(R.id.offerrating);
            name=(TextView) itemView.findViewById(R.id.offeritem);
            hotelName=(TextView)itemView.findViewById(R.id.offerhotel);
            foodType=(TextView) itemView.findViewById(R.id.offertype);
            price=(TextView)itemView.findViewById(R.id.offepricebefore);
        }
    }

}
