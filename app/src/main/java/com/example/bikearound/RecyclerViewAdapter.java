package com.example.bikearound;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Bike> mData;

    public RecyclerViewAdapter(Context mContext, List<Bike> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflator = LayoutInflater.from(mContext);
        view = mInflator.inflate(R.layout.cardview_item_bike, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.img_bike_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.tv_bike_name.setText(mData.get(position).getBikeName());
        holder.tv_owner_name.setText(mData.get(position).getOwnerName());
        holder.tv_rating.setText(mData.get(position).getRating());

        // Set click listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Bike_Activity.class);

                // Pass data to the bike activity
                intent.putExtra("Name", mData.get(position).getBikeName());
                intent.putExtra("Type", mData.get(position).getBikeType());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());

                // Start the activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_bike_thumbnail;
        TextView tv_bike_name;
        TextView tv_owner_name;
        TextView tv_rating;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            img_bike_thumbnail = (ImageView) itemView.findViewById(R.id.bike_img_id);
            tv_bike_name = (TextView) itemView.findViewById(R.id.bike_name_id);
            tv_owner_name = (TextView) itemView.findViewById(R.id.owner_name_id);
            tv_rating = (TextView) itemView.findViewById(R.id.rating_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
