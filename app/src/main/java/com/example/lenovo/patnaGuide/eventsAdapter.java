package com.example.lenovo.patnaGuide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class eventsAdapter extends RecyclerView.Adapter<eventsAdapter.RecyclerViewHolders> {

    private List<Item> itemList;
    private Context context;

    public eventsAdapter(Context context, List<Item> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    class RecyclerViewHolders extends RecyclerView.ViewHolder {
        public TextView eventName;
        public ImageView eventImage;
        public TextView eventSchedule;
        public TextView eventLocation;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            eventName = (TextView) itemView.findViewById(R.id.event_name);
            eventImage = (ImageView) itemView.findViewById(R.id.event_image);
            eventSchedule = (TextView) itemView.findViewById(R.id.event_schedule);
            eventLocation = (TextView) itemView.findViewById(R.id.event_location);
        }
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.eventName.setText(itemList.get(position).getTitle());
        holder.eventImage.setImageResource(itemList.get(position).getImageResourceId());
        holder.eventSchedule.setText(itemList.get(position).getItemSchedule());
        holder.eventLocation.setText(itemList.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
