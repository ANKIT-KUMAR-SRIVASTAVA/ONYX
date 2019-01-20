package com.as.ankitshubham.onyx;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

//import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;
//import com.mxn.soul.flowingdrawer_core.MenuFragment;


public class MyMenuFragment extends Fragment {
    public NavigationView vNavigation;
   // private LeftDrawerLayout mLeftDrawerLayout;
    public FlowingDrawer mDrawer;
    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_menu, container,
                false);
        //setupHeader();
       // view1 = view;
        vNavigation = (NavigationView) view.findViewById(R.id.vNavigation);
        //mLeftDrawerLayout = (LeftDrawerLayout) view.findViewById(R.id.id_drawerlayout);
        //mDrawer = (FlowingDrawer) view.findViewById(R.id.drawerlayout);
        vNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                Intent i;
                mDrawer = (FlowingDrawer) view.findViewById(R.id.menulayout);
                //Fragment fragment=null;
                //Log.w("ON CLICK", "Working");
                //mLeftDrawerLayout.closeDrawer();
                switch (id) {
                    case R.id.menu_aboutus:
                        //i = new Intent(getActivity(), AboutUs.class);
                        //startActivity(i);
                        //getActivity().finish();
                         Fragment fragment = new AboutUs();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.r, fragment);
                        getActivity().getSupportFragmentManager().popBackStack();
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                        break;

                    case R.id.menu_event:
                        //i = new Intent(getActivity(), Event.class);
                        //startActivity(i);
                        //getActivity().finish();
                         Fragment fragment1  = new Event();
                        FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        fragmentTransaction1.replace(R.id.r, fragment1);
                        getActivity().getSupportFragmentManager().popBackStack();
                        fragmentTransaction1.addToBackStack(null);
                        fragmentTransaction1.commit();
                        //mDrawer.closeMenu();
                        break;

                    case R.id.menu_schedule:
                        //i = new Intent(getActivity(), Scheduleac.class);
                        //startActivity(i);
                        // getActivity().finish();
                       Fragment fragment2 = new Schedule();
                        FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                        fragmentTransaction2.replace(R.id.r, fragment2);
                        getActivity().getSupportFragmentManager().popBackStack();
                      fragmentTransaction2.addToBackStack(null);
                        fragmentTransaction2.commit();
                        break;

                    case R.id.menu_register:
                        /*i = new Intent(getActivity(), Register.class);
                        startActivity(i);
                        getActivity().finish();*/
                        Fragment fragment3 = new Register();
                        FragmentManager fragmentManager3 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
                        fragmentTransaction3.replace(R.id.r, fragment3);
                        getActivity().getSupportFragmentManager().popBackStack();
                        fragmentTransaction3.addToBackStack(null);
                        fragmentTransaction3.commit();
                        break;
                    case R.id.menu_team:
                        Fragment fragment4 = new Team();
                        FragmentManager fragmentManager4 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
                        fragmentTransaction4.replace(R.id.r, fragment4);
                        getActivity().getSupportFragmentManager().popBackStack();
                        fragmentTransaction4.addToBackStack(null);
                        fragmentTransaction4.commit();
                        break;

                    case R.id.menu_developer:
                       // i=new Intent(getActivity(), FriendsActivity.class);
                       // startActivity(i);
                        //getActivity().finish();
                        Fragment fragment5 = new Developer();
                        FragmentManager fragmentManager5 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction5 = fragmentManager5.beginTransaction();
                        fragmentTransaction5.replace(R.id.r, fragment5);
                        getActivity().getSupportFragmentManager().popBackStack();
                        fragmentTransaction5.addToBackStack(null);
                        fragmentTransaction5.commit();
                        break;

                    case R.id.menu_facebook:
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.facebook.com/onyxgalgotiaslitfest"));
                        startActivity(intent);
                        break;

                    case R.id.menu_instagram:
                        Intent intent1 = new Intent();
                        intent1.setAction(Intent.ACTION_VIEW);
                        intent1.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent1.setData(Uri.parse("https://www.instagram.com/onyxgalgotiaslitfest"));
                        startActivity(intent1);
                        break;
                }

                new MainActivity().abc();
               // mDrawer.closeMenu();
//                mDrawer.closeMenu();

                // mLeftDrawerLayout.closeDrawer();

                return true;
            }
        });


    return  view;
    }



    /*private void setupHeader() {
        int avatarSize = getResources().getDimensionPixelSize(R.dimen.global_menu_avatar_size);
        String profilePhoto = getResources().getString(R.string.user_profile_photo);
        Picasso.with(getActivity())
                .load(profilePhoto)
                .placeholder(R.drawable.img_circle_placeholder)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new CircleTransformation())
                .into(ivMenuUserProfilePhoto);
    }*/

    /*public void onOpenMenu(){
        Toast.makeText(getActivity(),"onOpenMenu",Toast.LENGTH_SHORT).show();
    }
    public void onCloseMenu(){
        Toast.makeText(getActivity(),"onCloseMenu",Toast.LENGTH_SHORT).show();
    }*/
}
