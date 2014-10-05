package com.fgtpw.bobaapplication.my_runs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.fgtpw.bobaapplication.R;
import com.fgtpw.bobaapplication.search.SearchFragment;

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
        View root = inflater.inflate(R.layout.myruns, container, false);
        Button create = (Button) root.findViewById(R.id.myruns_create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .add(R.id.container, SearchFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
            }
        });

        ListView list = (ListView) root.findViewById(R.id.currentruns_list);

        return root;
    }
}
