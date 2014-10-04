package com.fgtpw.bobaapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

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
        View root = inflater.inflate(R.layout.myruns,container,false);
        Button create = (Button) root.findViewById(R.id.myruns_create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),StartRunActivity.class);
                startActivity(i);
            }
        });

        ListView list = (ListView) root.findViewById(R.id.currentruns_list);

        return root;
    }
}
