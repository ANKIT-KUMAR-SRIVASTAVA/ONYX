package com.as.ankitshubham.onyx;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by arpit on 11/01/2016.
 */
public class ScheduleSlideFragmentB extends Fragment {
    ListView list;
    String[] EventName={"Time Paradox", "Monolouge", "Mindspark","Closing Ceremony"};
    String[] EventVenue={"Seminar Hall","Auditorium","Seminar Hall", "Auditorium"};
    String[] EventTime={"12:00-13:00", "13:00-14:00", "14:00-15:30", "16:00-15:00"};

//   String[] EventName=getActivity().getResources().getStringArray(R.array.schedule_event_name_day2);
//    String[] EventVenue=getActivity().getResources().getStringArray(R.array.venue_day2);

// /    String[] EventTime=getActivity().getResources().getStringArray(R.array.time_day2);

    public ScheduleSlideFragmentB() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.list_view_layout, container, false);
        list= (ListView) rootView.findViewById(R.id.listview_day2);
        imagecustom adap= new imagecustom(getActivity(),EventName,EventVenue,EventTime);
        list.setAdapter(adap);

     return rootView;
    }
}

