package com.as.ankitshubham.onyx;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Schedule extends Fragment {
    private static int NUM_PAGES = 2;
    ViewPager viewPager;
    private PagerAdapter mPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_schedule, container, false);
        viewPager= (ViewPager) rootView.findViewById(R.id.schedulepager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
        viewPager
                .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int pos) {

                    }
                });

        return rootView;
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            Fragment frag = null;
            if (position ==0)
                frag= new ScheduleSlideFragmentA();

            else
                frag = new ScheduleSlideFragmentB();

            return frag ;
        }
        @Override
        public int getCount() {
            return NUM_PAGES;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return "DAY " + (position + 1);
        }
    }


}

