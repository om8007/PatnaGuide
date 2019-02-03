package com.example.lenovo.patnaGuide;

import android.view.View;

import java.util.Date;

public class Item {
    private String itemTitle;
    private int itemImageResourceId;
    private String itemLocation;
    private float itemRating;
    private String itemSchedule;
    private String itemTaste;
    private String shortDescription;
    private int wifi;
    private int ac;
    private int roomservice;
    private int pool;
    private int livetv;
    private int parking;

    // constructor for spot
    public Item(String itemTitle, int itemImageResourceId, float itemRating,String itemLocation, String shortDescription) {
        this.itemTitle = itemTitle;
        this.itemImageResourceId = itemImageResourceId;
        this.itemRating =itemRating;
        this.itemLocation = itemLocation;
        this.shortDescription = shortDescription;
    }

    // constructor for restro
    public Item(String itemTitle,float itemRating, String itemTaste,String itemSchedule, String itemLocation) {
        this.itemTitle = itemTitle;
        this.itemRating = itemRating;
        this.itemTaste = itemTaste;
        this.itemSchedule = itemSchedule;
        this.itemLocation = itemLocation;
    }
    // constructor for hotel
    public Item(String itemTitle,float itemRating, String itemLocation,int wifi,int ac,int roomservice,int pool,int livetv,int parking) {
        this.itemTitle = itemTitle;
        this.itemRating = itemRating;
        this.itemLocation = itemLocation;
        this.wifi = wifi;
        this.ac = ac;
        this.roomservice = roomservice;
        this.pool = pool;
        this.livetv = livetv;
        this.parking = parking;
    }

    //constructor for events
    public Item(String itemTitle, int itemImageResourceId,String itemSchedule,String itemLocation) {
        this.itemTitle = itemTitle;
        this.itemImageResourceId = itemImageResourceId;
        this.itemSchedule = itemSchedule;
        this.itemLocation = itemLocation;
    }

    public String getTitle() {
        return itemTitle;
    }

    public int getImageResourceId() {
        return itemImageResourceId;
    }

    public String getLocation() {
        return itemLocation;
    }

    public float getItemRating() {
        return itemRating;
    }

    public String getItemSchedule() { return itemSchedule; }

    public String getShortDescription() { return  shortDescription; }

    public String getItemTaste() { return itemTaste; }

    public int hasWifi() {
        if(wifi==0)
            return View.GONE;
        else
            return View.VISIBLE;
        }
    public int hasAc() {
        if(ac==0)
            return View.GONE;
        else
            return View.VISIBLE;
    }
    public int hasRoomservice() {
        if(roomservice==0)
            return View.GONE;
        else
            return View.VISIBLE;
    }
    public int hasPool() {
        if(pool==0)
            return View.GONE;
        else
            return View.VISIBLE;
    }
    public int hasLivetv() {
        if(livetv==0)
            return View.GONE;
        else
            return View.VISIBLE;
    }
    public int hasParking() {
        if(parking==0)
            return View.GONE;
        else
            return View.VISIBLE;
    }


}
