package com.fgtpw.bobaapplication.search;

import android.app.Activity;
import android.os.Bundle;

import com.fgtpw.bobaapplication.R;

public class SearchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.search);

    }
}
