package com.fgtpw.bobaapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

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
        TextView title = (TextView) root.findViewById(R.id.rest_menu_title);
        title.setText("Tearra");
        ExpandableListView listView = (ExpandableListView) root.findViewById(R.id.rest_menu_list);

        return root;
    }
}
