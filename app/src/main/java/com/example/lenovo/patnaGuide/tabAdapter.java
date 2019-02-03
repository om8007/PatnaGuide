package com.example.lenovo.patnaGuide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

public class tabAdapter extends FragmentPagerAdapter {

        private Context myContext;
        int totalTabs;

        public tabAdapter(Context context, FragmentManager fm, int totalTabs) {
            super(fm);
            myContext = context;
            this.totalTabs = totalTabs;
        }

        // this is for fragment tabs
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    spotsFragment SpotsFragment = new spotsFragment();
                    return SpotsFragment;
                case 1:
                    restaurantsFragment RestroFrag = new restaurantsFragment();
                    return RestroFrag;
                case 2:
                    hotelsFragment HotelFrag = new hotelsFragment();
                    return HotelFrag;
                case 3:
                    eventsFragment EventsFrag = new eventsFragment();
                    return EventsFrag;
                default:
                    return null;
            }
        }
        // this counts total number of tabs
        @Override
        public int getCount() {
            return totalTabs;
        }
    }

