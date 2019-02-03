package com.example.lenovo.patnaGuide;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import java.util.ArrayList;

public class spotsAdapter extends ArrayAdapter<Item>{

    View listItemView;

    public spotsAdapter(Context context, ArrayList<Item> items)
    {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            listItemView = layoutInflater.inflate(R.layout.spots_row, parent, false);

        ImageView spotImage = listItemView.findViewById(R.id.spot_image);
        TextView spotTitle = listItemView.findViewById(R.id.spot_title);
        RatingBar spotStars = listItemView.findViewById(R.id.spot_stars);
        TextView spotRating = listItemView.findViewById(R.id.spot_rating);
        TextView spotLocation = listItemView.findViewById(R.id.spot_location);
        TextView spotInfo = listItemView.findViewById(R.id.spot_info);

        //Get the current item by position index
        Item currentItem = getItem(position);

         spotImage.setImageResource(currentItem.getImageResourceId());
         spotTitle.setText(currentItem.getTitle());
         spotStars.setRating(currentItem.getItemRating());
         spotRating.setText(Float.toString(currentItem.getItemRating()));
         spotLocation.setText(currentItem.getLocation());
         spotInfo.setText(currentItem.getShortDescription());

        return listItemView;
    }
}
