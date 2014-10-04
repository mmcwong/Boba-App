package com.fgtpw.bobaapplication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sfung on 10/3/14.
 */
public class OrderDetailFragment extends Fragment {

    public static OrderDetailFragment newInstance() {
        OrderDetailFragment fragment = new OrderDetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  //      View root = inflater.inflate(R.layout.or, container, false);
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}
