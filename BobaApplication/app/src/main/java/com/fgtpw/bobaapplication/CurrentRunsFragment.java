package com.fgtpw.bobaapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

/**
 * Created by sfung on 10/3/14.
 */
public class CurrentRunsFragment extends Fragment {

    public static CurrentRunsFragment newInstance() {
        CurrentRunsFragment fragment = new CurrentRunsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.currentruns, container, false);
        ListView list = (ListView) root.findViewById(R.id.currentruns_list);
        ArrayList<String> data = new ArrayList<String>();
        data.add("Boba");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");
        data.add("Chicken");


        list.setAdapter(new CurrentRunsAdapter(data, getActivity(),getFragmentManager()));
        return root;
    }
}
