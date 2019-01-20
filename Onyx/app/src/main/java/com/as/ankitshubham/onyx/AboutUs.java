package com.as.ankitshubham.onyx;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUs extends Fragment {
        View view;
        TextView tv;
    public AboutUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_about_us, container, false);
        tv=(TextView)view.findViewById(R.id.textView23);
        tv.setText("Onyx 2017\n\n"+"Onyx has returned, like the dream of spring after the harsh winds of winter. A fest for those of us who have heeded the irresistible call of fiction, A voice that asks us to dissolve away in a world displaced from reality and yet at times more real than reality itself. A reminiscence of our sundry affairs with fiction, all our ballets in Russian ballrooms, our spirited discourses in British saloons, and the hundreds of lives we’ve lead in books and written pages. Onyx is a motley group of quasi adults composing Paeans and Dithyrambs, enthralling the masses at the stroke of their pens. \n\n"+"The girl in the big glasses, hunched over her book, the eccentric guy who enjoys delivering effusive rhetoric, the poets with their midnight ephemeral epiphanies, the candid and cheeky writers, the demiurges of fantastical lands; The Lingo Freaks.\n\n"+"Hope to see you all there.\n" +
                "\nHere’s to the ones who dream, foolish as they may seem. Here’s to the hearts that ache. Here’s to the mess we make.");
        return view;
    }

}
