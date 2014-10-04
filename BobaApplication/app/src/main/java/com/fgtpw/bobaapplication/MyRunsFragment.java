package com.fgtpw.bobaapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sfung on 10/3/14.
 */
public class MyRunsFragment extends Fragment {

    public static MyRunsFragment newInstance() {
        MyRunsFragment fragment = new MyRunsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.currentruns,container,false);

        return root;
    }
}
