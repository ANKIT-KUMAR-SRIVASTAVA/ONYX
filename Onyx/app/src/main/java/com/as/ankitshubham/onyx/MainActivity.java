package com.as.ankitshubham.onyx;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;
//import com.mxn.soul.flowingdrawer_core.FlowingView;
//import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity  {
    ImageView h1;
    RelativeLayout layout;
    int[] setimg={R.drawable.h1,R.drawable.h2,R.drawable.s1,R.drawable.s2,R.drawable.ho1,R.drawable.l1,R.drawable.h3,R.drawable.l2};
    int[] images = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8};

    private TextView tvDay, tvHour, tvMinute, tvSecond, tvEvent;
    private LinearLayout linearLayout1, linearLayout2;
    private Handler handler;
    private Runnable runnable;
    private ViewGroup mContentView;
    //private LeftDrawerLayout mLeftDrawerLayout;
     static private FlowingDrawer mDrawer;

    private ImageView mBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h1 = (ImageView) findViewById(R.id.imageView);
        layout=(RelativeLayout)findViewById(R.id.r);
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;
            @Override
            public void run() {
                h1.setImageResource(images[i]);
                layout.setBackgroundResource(setimg[i]);
                i++;
                if (i > images.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 1000);
            }
        };
        handler.postDelayed(runnable, 100);

        //setupToolbar();
        mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);
        mDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);
        //mDrawer.openMenu();
        setupToolbar();
        //setupFeed();
        setupMenu();



        /*LeftDrawerLayout = (LeftDrawerLayout) findViewById(R.id.id_drawerlayout);
        FragmentManager fm = getSupportFragmentManager();

        MyMenuFragment mMenuFragment = (MyMenuFragment) fm.findFragmentById(R.id.id_container_menu);
        FlowingView mFlowingView = (FlowingView) findViewById(R.id.sv);
        if (mMenuFragment == null) {
            fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment = new MyMenuFragment()).commit();
//            mLeftDrawerLayout.closeDrawer();
        }
       mLeftDrawerLayout.setFluidView(mFlowingView);
        mLeftDrawerLayout.setMenuFragment(mMenuFragment);*/
        initUI();
        countDownStart();

    }
    public void abc()
    {
        mDrawer.closeMenu();
    }
    @SuppressLint("SimpleDateFormat")
    private void initUI() {
        linearLayout1 = (LinearLayout) findViewById(R.id.ll1);
        linearLayout2 = (LinearLayout) findViewById(R.id.ll2);
        tvDay = (TextView) findViewById(R.id.txtTimerDay);
        tvHour = (TextView) findViewById(R.id.txtTimerHour);
        tvMinute = (TextView) findViewById(R.id.txtTimerMinute);
        tvSecond = (TextView) findViewById(R.id.txtTimerSecond);
        //tvEvent = (TextView) findViewById(R.id.tvevent);
    }

    // //////////////COUNT DOWN START/////////////////////////
    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2017-02-10");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        tvDay.setText("" + String.format("%02d", days));
                        tvHour.setText("" + String.format("%02d", hours));
                        tvMinute.setText("" + String.format("%02d", minutes));
                        tvSecond.setText("" + String.format("%02d", seconds));
                    } else {
                        linearLayout1.setVisibility(View.VISIBLE);
                        linearLayout2.setVisibility(View.GONE);
                        handler.removeCallbacks(runnable);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 0);
    }




    protected void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.toggleMenu();
            }
        });
    }
    private void setupMenu() {
        FragmentManager fm = getSupportFragmentManager();
        MyMenuFragment mMenuFragment = (MyMenuFragment) fm.findFragmentById(R.id.id_container_menu);
        if (mMenuFragment == null) {
            mMenuFragment = new MyMenuFragment();
            fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment).commit();
        }

//        mDrawer.setOnDrawerStateChangeListener(new ElasticDrawer.OnDrawerStateChangeListener() {
//            @Override
//            public void onDrawerStateChange(int oldState, int newState) {
//                if (newState == ElasticDrawer.STATE_CLOSED) {
//                    Log.i("MainActivity", "Drawer STATE_CLOSED");
//                }
//            }
//
//            @Override
//            public void onDrawerSlide(float openRatio, int offsetPixels) {
//                Log.i("MainActivity", "openRatio=" + openRatio + " ,offsetPixels=" + offsetPixels);
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isMenuVisible()) {
            mDrawer.closeMenu();
        } else {
            super.onBackPressed();
        }
    }
}
