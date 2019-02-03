package com.example.lenovo.patnaGuide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class hotelsFragment extends Fragment {


    public hotelsFragment() {
        // Required empty public constructor
    }

    @Override
    @NonNull
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hotels, container, false);
        attachAdapter(v);
        return v;
    }

    public void attachAdapter(View v) {
        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data
        items.add(new Item(getString(R.string.hotel_maurya_title),
                Float.parseFloat(getString(R.string.hotel_maurya_rating)),
                getString(R.string.hotel_maurya_location),
                1, 1, 1, 1, 1, 1));
        items.add(new Item(getString(R.string.hotel_chanakya_title),
                Float.parseFloat(getString(R.string.hotel_chanakya_rating)),
                getString(R.string.hotel_chanakya_location),
                1, 1, 0, 1, 0, 1));
        items.add(new Item(getString(R.string.hotel_patliputra_title),
                Float.parseFloat(getString(R.string.hotel_patliputra_rating)),
                getString(R.string.hotel_patliputra_location),
                1, 0, 1, 1, 1, 1));
        items.add(new Item(getString(R.string.hotel_avr_title),
                Float.parseFloat(getString(R.string.hotel_avr_rating)),
                getString(R.string.hotel_avr_location),
                1, 0, 1, 1, 1, 0));
        items.add(new Item(getString(R.string.hotel_amalfi_title),
                Float.parseFloat(getString(R.string.hotel_amalfi_rating)),
                getString(R.string.hotel_amalfi_location),
                1, 0, 1, 1, 0, 1));
        items.add(new Item(getString(R.string.hotel_lemontree_title),
                Float.parseFloat(getString(R.string.hotel_lemontree_rating)),
                getString(R.string.hotel_lemontree_location),
                1, 1, 0, 1, 1, 1));
        items.add(new Item(getString(R.string.hotel_panache_title),
                Float.parseFloat(getString(R.string.hotel_panache_rating)),
                getString(R.string.hotel_panache_location),
                1, 1, 1, 1, 1, 1));

        ListView hotelsList = v.findViewById(R.id.hotelsListView);
        ListAdapter HotelAdapter = new hotelAdapter(getActivity(), items);
        hotelsList.setAdapter(HotelAdapter);
    }
}

