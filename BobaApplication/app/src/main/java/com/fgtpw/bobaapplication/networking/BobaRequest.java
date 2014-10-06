package com.fgtpw.bobaapplication.networking;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

public abstract class BobaRequest extends Request<String>{

    private Map<String, String> mParams;

    public BobaRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
        mParams = new HashMap<String, String>();
    }

    protected void put(String key, String value) {
        mParams.put(key, value);
    }
    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(String response) {

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return mParams;
    }
}


