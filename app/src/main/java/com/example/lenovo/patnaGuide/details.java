package com.example.lenovo.patnaGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class details extends AppCompatActivity {
    String songPlaying;
    String artistPlaying;

    public details() {
        //no arg constructor
    }
/*
    public void startplayer(String songPlaying,String artistPlaying)
    {
        this.songPlaying = songPlaying;
        this.artistPlaying = artistPlaying;
    } */



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setElevation(0);
        setContentView(R.layout.details_page);


    }

}
