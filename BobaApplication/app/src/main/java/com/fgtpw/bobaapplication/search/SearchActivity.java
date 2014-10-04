package com.fgtpw.bobaapplication.search;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.fgtpw.bobaapplication.R;

public class SearchActivity extends Activity {

    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        linearLayout = (LinearLayout)inflater.inflate(R.layout.search, null);

        final SearchListView searchListView = (SearchListView)linearLayout.findViewById(R.id.search_list_view);

        SearchView searchView = (SearchView)linearLayout.findViewById(R.id.startrun_search);
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
        setContentView(linearLayout);
    }
}
