package com.fgtpw.bobaapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

/**
 * Created by sfung on 10/3/14.
 */
public class StartRunActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        SearchView search = (SearchView) findViewById(R.id.startrun_search);
        search.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO:api calls
            }
        });
    }
}
