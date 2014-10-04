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
public class RestaurantMenuFragment extends Fragment {

    public static RestaurantMenuFragment newInstance() {
        RestaurantMenuFragment fragment = new RestaurantMenuFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
              View root = inflater.inflate(R.layout.ordermenu, container, false);
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}
