package com.as.ankitshubham.onyx;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by arpit on 11/01/2016.
 */
public class ScheduleSlideFragmentA extends Fragment {

    ListView list;
    String[] EventName={"Opening Ceremony","Kavi Sammelan", "Quiz", "Pottermania", "Abhivyakti", "Naughty Notes"};
    String[] EventVenue={"Auditorium", "Auditorium", "Seminar Hall", "Seminar Hall/College Ground", "Seminar Hall","Seminar Hall"};
    String[] EventTime={"10:00- 11:00", "11:00-12:00", "12:00-13:00", "13:00-15:00","14:00-15:30","15:30-16:30"};

    @Nullable
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.list_view_layout, container, false);
        // Using the layout of ScheduleSlideFragmentB to call a list and calling imagecustom row in an adapter
        // then putting above values in adapter
        list= (ListView) rootView.findViewById(R.id.listview_day2);
        imagecustom adap= new imagecustom(getActivity(),EventName,EventVenue,EventTime);
        list.setAdapter(adap);

        return rootView;
    }
}
