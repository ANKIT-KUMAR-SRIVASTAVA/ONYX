package com.as.ankitshubham.onyx;


import android.content.Intent;
//import android.app.Fragment;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.v4.app.Fragment;

public class Team extends Fragment{
    public static Team newInstance() {
        return new Team();
    }

    View view1;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
        //setContentView(R.layout.activity_my_main);
        view1 = inflater.inflate(R.layout.fragment_team, container, false);
        view1.setBackgroundColor(Color.BLACK);
        //b1=(ImageButton) view1.findViewById(R.id.imageButton1);
        b2=(ImageButton) view1.findViewById(R.id.imageButton2);
        b3=(ImageButton) view1.findViewById(R.id.imageButton3);
        b4=(ImageButton) view1.findViewById(R.id.imageButton4);
        b5=(ImageButton) view1.findViewById(R.id.imageButton6);
        b6=(ImageButton) view1.findViewById(R.id.imageButton5);
        b7=(ImageButton) view1.findViewById(R.id.imageButton70);
        b8=(ImageButton) view1.findViewById(R.id.imageButton8);
        b9=(ImageButton) view1.findViewById(R.id.imageButton9);
        b10=(ImageButton) view1.findViewById(R.id.imageButton10);
        b11=(ImageButton) view1.findViewById(R.id.imageButton11);
       // b12=(ImageButton) view1.findViewById(R.id.imageButton12);
        t1=(TextView)view1.findViewById(R.id.textView4);
        t2=(TextView)view1.findViewById(R.id.textView6);
        t3=(TextView)view1.findViewById(R.id.textView8);
        t4=(TextView)view1.findViewById(R.id.textView12);
        t5=(TextView)view1.findViewById(R.id.textView10);
        t6=(TextView)view1.findViewById(R.id.textView140);
        t7=(TextView)view1.findViewById(R.id.textView16);
        t8=(TextView)view1.findViewById(R.id.textView18);
        t9=(TextView)view1.findViewById(R.id.textView20);
        t10=(TextView)view1.findViewById(R.id.textView22);
        //t10=(TextView)view1.findViewById(R.id.textView20);
        //t11=(TextView)view1.findViewById(R.id.textView22);
        //t12=(TextView)view1.findViewById(R.id.textView24);

        /*t1.setVisibility(View.GONE);
        t2.setVisibility(View.GONE);
        t4.setVisibility(View.GONE);
        t5.setVisibility(View.GONE);
        t6.setVisibility(View.GONE);
        t9.setVisibility(View.GONE);*/
//        t12.setVisibility(View.GONE);

//        b1.setBackgroundColor(Color.TRANSPARENT);
        b2.setBackgroundColor(Color.TRANSPARENT);
        b3.setBackgroundColor(Color.TRANSPARENT);
        b4.setBackgroundColor(Color.TRANSPARENT);
        b5.setBackgroundColor(Color.TRANSPARENT);
        b6.setBackgroundColor(Color.TRANSPARENT);
        b7.setBackgroundColor(Color.TRANSPARENT);
        b8.setBackgroundColor(Color.TRANSPARENT);
        b9.setBackgroundColor(Color.TRANSPARENT);
        b10.setBackgroundColor(Color.TRANSPARENT);
        b11.setBackgroundColor(Color.TRANSPARENT);
//        b12.setBackgroundColor(Color.TRANSPARENT);
       /* b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
        b5.setVisibility(View.GONE);
        b6.setVisibility(View.GONE);
        b9.setVisibility(View.GONE);*/
   //     b12.setVisibility(View.GONE);

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8527787397";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8287683957";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8588931236";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8802807358";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8909337749";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "9810555053";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "7017998924";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "9717931350";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "8130363979";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "9650078975";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8527787397";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8287683957";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8588931236";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8802807358";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2 = "tel:" + "8909337749";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "9810555053";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "7017998924";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "9717931350";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        t9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "8130363979";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });

        t10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String mydata2="tel:"+ "9650078975";
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
                startActivity(myActivity2);

            }
        });
        //b1=(ImageButton) view1.findViewById(R.id.imageButton);//
        return view1;
    }
}