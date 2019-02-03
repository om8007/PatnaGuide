package com.example.lenovo.patnaGuide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class restaurantsFragment extends Fragment {

    // GridView gridView;

    public restaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_restaurants, container, false);
        attchAdapter(v);
        return v;  //inflater.inflate(R.layout.artist_fragment, container, false);
    }

    public void attchAdapter(View v) {

        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data
        items.add(new Item(getString(R.string.bbq_nation_title),
                Float.parseFloat(getString(R.string.bbq_nation_rating)),
                getString(R.string.bbq_nation_taste),
                getString(R.string.bbq_nation_schedule),
                getString(R.string.bbq_nation_location)));
        items.add(new Item(getString(R.string.bolly_treats_title),
                Float.parseFloat(getString(R.string.bolly_treats_rating)),
                getString(R.string.bolly_treats_taste),
                getString(R.string.bolly_treats_schedule),
                getString(R.string.bolly_treats_location)));
        items.add(new Item(getString(R.string.swaaddesh_title),
                Float.parseFloat(getString(R.string.swaaddesh_rating)),
                getString(R.string.swaaddesh_taste),
                getString(R.string.swaaddesh_schedule),
                getString(R.string.swaaddesh_location)));
        items.add(new Item(getString(R.string.seventeen_deg_title),
                Float.parseFloat(getString(R.string.seventeen_deg_rating)),
                getString(R.string.seventeen_deg_taste),
                getString(R.string.seventeen_deg_schedule),
                getString(R.string.seventeen_deg_location)));
        items.add(new Item(getString(R.string.kd_elevens_title),
                Float.parseFloat(getString(R.string.kd_elevens_rating)),
                getString(R.string.kd_elevens_taste),
                getString(R.string.kd_elevens_schedule),
                getString(R.string.kd_elevens_location)));
        items.add(new Item(getString(R.string.patna_rasoi_title),
                Float.parseFloat(getString(R.string.patna_rasoi_rating)),
                getString(R.string.patna_rasoi_taste),
                getString(R.string.patna_rasoi_schedule),
                getString(R.string.patna_rasoi_location)));
        items.add(new Item(getString(R.string.basant_vihar_title),
                Float.parseFloat(getString(R.string.basant_vihar_rating)),
                getString(R.string.basant_vihar_taste),
                getString(R.string.basant_vihar_schedule),
                getString(R.string.basant_vihar_location)));

        ListView restroList = (ListView) v.findViewById(R.id.restroListView);
        ListAdapter restroAdapter = new restroAdapter(getActivity(), items);
        restroList.setAdapter(restroAdapter);

    }

}

