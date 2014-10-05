package com.fgtpw.bobaapplication.current_runs;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fgtpw.bobaapplication.HostOrderPageFragment;
import com.fgtpw.bobaapplication.R;

import java.util.List;

import data.Run;

public class CurrentRunsAdapter extends BaseAdapter {
    List<String> data;
    Context context;
    FragmentManager fragmentManager;
    public CurrentRunsAdapter(List<String> d , Context c, FragmentManager manager) {
        data = d;
        context = c;
        fragmentManager = manager;
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
            view  = LayoutInflater.from(context).inflate(R.layout.currentrunitem,null);
            ImageView face = (ImageView) view.findViewById(R.id.currentrunitem_face);
            TextView runname = (TextView) view.findViewById(R.id.run_name);
            TextView restname = (TextView) view.findViewById(R.id.restaurant_name);
            TextView exptime = (TextView) view.findViewById(R.id.expiration_time);

        }
        ImageView face = (ImageView) view.findViewById(R.id.currentrunitem_face);
        TextView runname = (TextView) view.findViewById(R.id.run_name);
        TextView restname = (TextView) view.findViewById(R.id.restaurant_name);
        TextView exptime = (TextView) view.findViewById(R.id.expiration_time);

        runname.setText("Boba");
        restname.setText("Tearra");
        exptime.setText("30 min left");

        face.setImageResource(R.drawable.stanley);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .add(R.id.container, HostOrderPageFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}
