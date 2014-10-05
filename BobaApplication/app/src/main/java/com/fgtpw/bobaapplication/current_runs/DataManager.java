package com.fgtpw.bobaapplication.current_runs;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class DataManager {

    private RequestQueue requestQueue;
    public DataManager(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public void getCurrentRuns() {
        String url = "http://www.bobaapp.herokuapp.com/api/v1";
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("Mark Poulin", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("yo", "yo");
                Log.d("Mark Poulin", error.toString());
            }
        });

        requestQueue.add(request);
    }
}

