package com.fgtpw.bobaapplication.search;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.widget.ListView;

import com.fgtpw.bobaapplication.R;

import java.util.List;

import data.Business;
import yelp.YelpAPI;

public class SearchListView extends ListView{

    public SearchListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void fillData(String search) {
        new SearchAsyncTask().execute(search);
    }

    class SearchAsyncTask extends AsyncTask<String, Void, List<Business>> {
        private ProgressDialog dialog;

        SearchAsyncTask() {
            dialog = new ProgressDialog(getContext());
        }
        @Override
        protected void onPreExecute() {
            dialog.setMessage("Loading...");
            dialog.show();
        }

        @Override
        protected List<Business> doInBackground(String... args) {
            List<Business> businessList = YelpAPI.run(args);
            return businessList;
        }

        @Override
        protected void onPostExecute(List<Business> businesses) {
            if(dialog.isShowing()) {
                dialog.dismiss();
            }
            SearchArrayAdapter adapter = new SearchArrayAdapter(getContext(),
                    R.layout.search_item_result, businesses);
            setAdapter(adapter);
        }
    }
}
