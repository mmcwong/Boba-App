package com.fgtpw.bobaapplication.networking;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import data.Order;
import data.Run;
import data.User;

public class DataManager {

    private static final String BASE = "https://www.bobaapp.herokuapp.com/api/v1";

    private RequestQueue requestQueue;
    public DataManager(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public void getCurrentRuns() {
        String url = BASE + "";
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

    public void createRun(Run run) {
        CreateRunRequest request = new CreateRunRequest(run, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);
    }

    public void addToRun(int runId, int userId, Order order) {
        AddOrderRequest request = new AddOrderRequest(runId, userId, order,
        new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);
    }

    public void createUser(User user) {
        CreateUserRequest request = new CreateUserRequest(user,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);
    }

    class CreateRunRequest extends BobaRequest {
        CreateRunRequest(Run run, Response.Listener<String> listener, Response.ErrorListener errorListener) {
            super(Method.POST, "", errorListener);
            put("id", run.runId + "");
            put("businessId", run.business.businessId);
            put("endTime", run.endTime.toString());
            put("host", run.host.userId + "");
        }
    }

    class AddOrderRequest extends BobaRequest {
        AddOrderRequest(int runId, int userId, Order order,
                        Response.Listener<String> listener, Response.ErrorListener errorListener) {
            super(Method.POST, "", errorListener);
            put("runId", runId + "");
            put("userId", userId + "");
            put("orderDescription", order.description);
            put("orderTime", order.time);
        }
    }

    class CreateUserRequest extends BobaRequest {
        CreateUserRequest(User user,
                        Response.Listener<String> listener, Response.ErrorListener errorListener) {
            super(Method.POST, "", errorListener);
            put("userId", user.userId + "");
            put("name", user.name);
            put("email", user.email);
            put("phone", user.phone);
        }
    }


}



