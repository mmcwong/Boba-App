package com.fgtpw.bobaapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    // Declare Tab Variable
    ActionBar.Tab Tab1, Tab2, Tab3;
    MyRunsFragment myRunsFragment;
    CurrentRunsFragment currentRunsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRunsFragment = MyRunsFragment.newInstance();
        currentRunsFragment = CurrentRunsFragment.newInstance();

        mTitle = getTitle();

//        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
//            @Override
//            public void run() {
//                YelpAPI.run(new String[]{});
//            }
//        });

        ActionBar actionBar = getActionBar();

        // Hide Actionbar Icon
        actionBar.setDisplayShowHomeEnabled(false);

        // Hide Actionbar Title
        actionBar.setDisplayShowTitleEnabled(false);

        // Create Actionbar Tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Set Tab Icon and Titles
        Tab1 = actionBar.newTab().setText("Current Runs");
        Tab2 = actionBar.newTab().setText("My Runs");

        // Set Tab Listeners
        Tab1.setTabListener(new TabListener(currentRunsFragment));
        Tab2.setTabListener(new TabListener(myRunsFragment));

        // Add tabs to actionbar
        actionBar.addTab(Tab1);
        actionBar.addTab(Tab2);

    }
}
