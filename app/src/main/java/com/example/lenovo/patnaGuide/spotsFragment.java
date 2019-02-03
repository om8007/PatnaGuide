package com.example.lenovo.patnaGuide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class spotsFragment extends Fragment {

    public spotsFragment() {
        // Required empty public constructor
    }

    @Override
    @NonNull
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_spots, container, false);
        attachAdapter(v);
        return v;
    }

    public void attachAdapter(View v) {
        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data
        items.add(new Item(getString(R.string.bihar_museum_title),
                R.drawable.bihar_museum,
                Float.parseFloat(getString(R.string.bihar_museum_rating)),
                getString(R.string.bihar_museum_location),
                getString(R.string.bihar_museum_shortDesc)));

        items.add(new Item(getString(R.string.gol_ghar_title),
                R.drawable.gol_ghar,
                Float.parseFloat(getString(R.string.gol_ghar_rating)),
                getString(R.string.gol_ghar_location),
                getString(R.string.gol_ghar_shortDesc)));

        items.add(new Item(getString(R.string.sanjay_gandhi_udyan_title),
                R.drawable.sanjay_gandhi_udyan,
                Float.parseFloat(getString(R.string.sanjay_gandhi_udyan_rating)),
                getString(R.string.sanjay_gandhi_udyan_location),
                getString(R.string.sanjay_gandhi_udyan_shortDesc)));

        items.add(new Item(getString(R.string.takht_patna_sahib_title),
                R.drawable.patna_sahib,
                Float.parseFloat(getString(R.string.takht_patna_sahib_rating)),
                getString(R.string.takht_patna_sahib_location),
                getString(R.string.takht_patna_sahib_shortDesc)));

        items.add(new Item(getString(R.string.science_center_title),
                R.drawable.science_center,
                Float.parseFloat(getString(R.string.science_center_rating)),
                getString(R.string.science_center_location),
                getString(R.string.science_center_shortDesc)));

        items.add(new Item(getString(R.string.patan_devi_title),
                R.drawable.patan_devi,
                Float.parseFloat(getString(R.string.patan_devi_rating)),
                getString(R.string.patan_devi_location),
                getString(R.string.patan_devi_shortDesc)));

        items.add(new Item(getString(R.string.buddha_smriti_park_title),
                R.drawable.buddha_smriti,
                Float.parseFloat(getString(R.string.buddha_smriti_park_rating)),
                getString(R.string.buddha_smriti_park_location),
                getString(R.string.buddha_smriti_park_shortDesc)));

        items.add(new Item(getString(R.string.funtasia_water_park_title),
                R.drawable.funtasia,
                Float.parseFloat(getString(R.string.funtasia_water_park_rating)),
                getString(R.string.funtasia_water_park_location),
                getString(R.string.funtasia_water_park_shortDesc)));

        items.add(new Item(getString(R.string.patna_museum_title),
                R.drawable.patna_museum,
                Float.parseFloat(getString(R.string.patna_museum_rating)),
                getString(R.string.patna_museum_location),
                getString(R.string.patna_museum_shortDesc)));

        items.add(new Item(getString(R.string.gandhi_sangrahalya_title),
                R.drawable.gandhi_museum,
                Float.parseFloat(getString(R.string.gandhi_sangrahalya_rating)),
                getString(R.string.gandhi_sangrahalya_location),
                getString(R.string.gandhi_sangrahalya_shortDesc)));


        ListView spotsList = v.findViewById(R.id.spotsListView);
        ListAdapter spotsAdapter = new spotsAdapter(getActivity(), items);
        spotsList.setAdapter(spotsAdapter);

    }

}
