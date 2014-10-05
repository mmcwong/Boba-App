package com.fgtpw.bobaapplication.run;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.fgtpw.bobaapplication.R;

public class RunDetailFragment extends Fragment {

    public static RunDetailFragment getNewInstance() {
        Bundle args = new Bundle();
        RunDetailFragment runDetailFragment = new RunDetailFragment();
        runDetailFragment.setArguments(args);
        return runDetailFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout)inflater.inflate(R.layout.run_details, container, false);
        return linearLayout;
    }
}
