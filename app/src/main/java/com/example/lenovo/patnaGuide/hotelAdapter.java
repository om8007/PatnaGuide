package com.example.lenovo.patnaGuide;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class hotelAdapter extends ArrayAdapter<Item> {

    public hotelAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    View listItemView;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            listItemView = layoutInflater.inflate(R.layout.hotel_row, parent, false);

        TextView hotelTitle = listItemView.findViewById(R.id.hotel_title);
        TextView hotelLocation = listItemView.findViewById(R.id.hotel_location);
        RatingBar hotelStars = listItemView.findViewById(R.id.hotel_star);
        TextView hotelRating = listItemView.findViewById(R.id.hotel_rating);
        ImageView imgWifi = listItemView.findViewById(R.id.hotel_facility_wifi);
        ImageView imgAc = listItemView.findViewById(R.id.hotel_facility_ac);
        ImageView imgRoomservice = listItemView.findViewById(R.id.hotel_facility_roomservice);
        ImageView imgPool = listItemView.findViewById(R.id.hotel_facility_pool);
        ImageView imgLivetv = listItemView.findViewById(R.id.hotel_facility_livetv);
        ImageView imgParking = listItemView.findViewById(R.id.hotel_facility_parking);

        //Get the current item by position index+
        Item currentItem = getItem(position);

        hotelTitle.setText(currentItem.getTitle());
        hotelStars.setRating(currentItem.getItemRating());
        hotelRating.setText(Float.toString(currentItem.getItemRating()));
        hotelLocation.setText(currentItem.getLocation());
        imgWifi.setVisibility(currentItem.hasWifi());
        imgAc.setVisibility(currentItem.hasAc());
        imgRoomservice.setVisibility(currentItem.hasRoomservice());
        imgPool.setVisibility(currentItem.hasPool());
        imgLivetv.setVisibility(currentItem.hasLivetv());
        imgParking.setVisibility(currentItem.hasParking());

        return listItemView;
    }

}
