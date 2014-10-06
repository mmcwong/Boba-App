package com.fgtpw.bobaapplication.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.fgtpw.bobaapplication.R;
import com.fgtpw.bobaapplication.new_run.EditRunFragment;

import data.Business;

public class SearchFragment extends Fragment {
    private LinearLayout linearLayout;

    public static SearchFragment newInstance() {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        linearLayout = (LinearLayout)inflater.inflate(R.layout.search, container,false);

        final SearchListView searchListView = (SearchListView)linearLayout.findViewById(R.id.search_list_view);

        searchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .add(R.id.container, EditRunFragment.newInstance(((Business) searchListView.getItemAtPosition(i))))
                        .addToBackStack(null)
                        .commit();
            }
        });

        SearchView searchView = (SearchView)linearLayout.findViewById(R.id.startrun_search);
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String search) {
                searchListView.fillData(search);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        return linearLayout;
    }
}
