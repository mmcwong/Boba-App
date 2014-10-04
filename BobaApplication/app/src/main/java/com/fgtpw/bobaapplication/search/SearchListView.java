package com.fgtpw.bobaapplication.search;

import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.widget.ListView;

import com.fgtpw.bobaapplication.BuildConfig;
import com.fgtpw.bobaapplication.R;

import java.util.List;

import data.Business;
import yelp.YelpAPI;

public class SearchListView extends ListView{

    public SearchListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        new AsyncTask<Void, Void, List<Business>>() {
            @Override
            protected List<Business> doInBackground(Void... voids) {
                List<Business> businessList = YelpAPI.run(new String[] {});
                return businessList;
            }

            @Override
            protected void onPostExecute(List<Business> businesses) {
                SearchArrayAdapter adapter = new SearchArrayAdapter(getContext(),
                        R.layout.search_item_result, businesses);
                setAdapter(adapter);
            }
        }.execute();
    }

}
