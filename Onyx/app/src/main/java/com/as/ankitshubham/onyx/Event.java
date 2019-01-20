package com.as.ankitshubham.onyx;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

//import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Event extends Fragment {
    ListView lv;
    Context context;
    View view;

    ArrayList prgmName;
    public static int[] prgmImages = {
            R.drawable.abhi,
            R.drawable.poem,
            R.drawable.spark,
            R.drawable.mono,
             R.drawable.harry,
            R.drawable.quiz,
    R.drawable.notes,
            R.drawable.paradocx};
    public static String[] prgmNameList = {"ABHIVYAKTI", "KAVI SAMMELAN", "MINDSPARK", "MONOLOGUE", "POTTER MANIA","QUIZ","NAUGHTY NOTES","TIME PARADOX"};


    public Event() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_event, container, false);
        context = getActivity();
        lv = (ListView) view.findViewById(R.id.listView);
        lv.setAdapter(new cushsam(((MainActivity)getActivity()), prgmNameList, prgmImages));
        return view;
    }

}
