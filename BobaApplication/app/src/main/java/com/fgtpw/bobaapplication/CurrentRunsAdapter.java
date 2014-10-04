package com.fgtpw.bobaapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by sfung on 10/4/14.
 */
public class CurrentRunsAdapter extends BaseAdapter {
    List<String> data;
    Context context;
    public CurrentRunsAdapter(List<String> d , Context c) {
        data = d;
        context = c;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater.from(context).inflate(R.layout.runitem,null);
        }

        return null;
    }
}
