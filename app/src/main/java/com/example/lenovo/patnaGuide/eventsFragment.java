package com.example.lenovo.patnaGuide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class eventsFragment extends Fragment {
    private GridLayoutManager gridManager;


    public eventsFragment(){
        // public constructor
    }

    @Override
    @NonNull
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_events, container, false);
        attachAdapter(v);
        return v;
    }

    public void attachAdapter(View v) {
        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data
        items.add(new Item(getString(R.string.event_donation_title),
                R.drawable.donation,
                getString(R.string.event_donation_schedule),
                getString(R.string.event_donation_location)));
        items.add(new Item(getString(R.string.event_hungama_title),
                R.drawable.hungama,
                getString(R.string.event_hungama_schedule),
                getString(R.string.event_hungama_location)));
        items.add(new Item(getString(R.string.event_ideathon_title),
                R.drawable.ideathon,
                getString(R.string.event_ideathon_schedule),
                getString(R.string.event_ideathon_location)));
        items.add(new Item(getString(R.string.event_bookfair_title),
                R.drawable.bookfair,
                getString(R.string.event_bookfair_schedule),
                getString(R.string.event_bookfair_location)));
        items.add(new Item(getString(R.string.event_jalexpo_title),
                R.drawable.jalexpo,
                getString(R.string.event_jalexpo_schedule),
                getString(R.string.event_jalexpo_location)));


        gridManager = new GridLayoutManager(getContext(), 1);
        RecyclerView rView = v.findViewById(R.id.events_recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(gridManager);

        eventsAdapter rcAdapter = new eventsAdapter(getActivity(), items);
        rView.setAdapter(rcAdapter);
    }
}
