package com.fgtpw.bobaapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by sfung on 10/3/14.
 */
public class HostOrderPageFragment extends Fragment {

    public static HostOrderPageFragment newInstance() {
        HostOrderPageFragment fragment = new HostOrderPageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.host_orders,container, false);
        Button people = (Button) root.findViewById(R.id.hostorder_people);
        final FragmentManager fragmentManager = getFragmentManager();
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .add(R.id.container, PeopleFragment.newInstance())
                        .addToBackStack(null)
                        .commit();

            }
        });
        Button order = (Button) root.findViewById(R.id.hostorder_order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .add(R.id.container, RestaurantMenuFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return root;
    }
}
