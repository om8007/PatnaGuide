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

public class restroAdapter extends ArrayAdapter<Item>{

    View listItemView;

    public restroAdapter(Context context, ArrayList<Item> items)
    {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            listItemView = layoutInflater.inflate(R.layout.restro_row, parent, false);

        TextView restroTitle = listItemView.findViewById(R.id.restro_title);
        TextView restroLocation = listItemView.findViewById(R.id.restro_location);
        RatingBar restroStars = listItemView.findViewById(R.id.restro_stars);
        TextView restroRating = listItemView.findViewById(R.id.restro_rating);
        TextView restroTaste = listItemView.findViewById(R.id.restro_taste);
        TextView restroTiming = listItemView.findViewById(R.id.restro_timing);

        //Get the current item by position index
        Item currentItem = getItem(position);

         restroTitle.setText(currentItem.getTitle());
         restroStars.setRating(currentItem.getItemRating());
         restroRating.setText(Float.toString(currentItem.getItemRating()));
         restroLocation.setText(currentItem.getLocation());
         restroTaste.setText(currentItem.getItemTaste());
         restroTiming.setText(currentItem.getItemSchedule());

        return listItemView;
    }
}
