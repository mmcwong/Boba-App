package com.fgtpw.bobaapplication.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fgtpw.bobaapplication.R;

import java.util.List;

import data.Business;

public class SearchArrayAdapter extends ArrayAdapter<Business>{

    private int layoutResource;

    public SearchArrayAdapter(Context context, int resource, List<Business> objects) {
        super(context, resource, objects);
        this.layoutResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        BusinessHolder holder = null;
        if(row == null) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            row = inflater.inflate(layoutResource, parent, false);

            holder = new BusinessHolder();
            holder.image = (ImageView)row.findViewById(R.id.store_image);
            holder.name = (TextView)row.findViewById(R.id.store_name);
            holder.phone = (TextView)row.findViewById(R.id.store_phone);
            holder.address = (TextView)row.findViewById(R.id.store_address);
            holder.rating = (ImageView)row.findViewById(R.id.store_rating);

            row.setTag(holder);
        } else {
            holder = (BusinessHolder)row.getTag();
        }

        Business business = getItem(position);
        holder.name.setText(business.name);
        holder.phone.setText(business.phone);
        holder.address.setText(business.address);
        holder.image.setImageBitmap(business.image);
        holder.rating.setImageBitmap(business.rating);
        return row;
    }

    private class BusinessHolder {
        TextView name;
        TextView phone;
        TextView address;
        ImageView image;
        ImageView rating;
    }
}
