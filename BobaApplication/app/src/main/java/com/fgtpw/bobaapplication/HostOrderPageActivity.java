package com.fgtpw.bobaapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.view.View;
import android.widget.Button;

/**
 * Created by sfung on 10/3/14.
 */
public class HostOrderPageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders);
        Button people = (Button) findViewById(R.id.hostorder_people);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HostOrderPageActivity.this, PeopleActivity.class);
                startActivity(i);
            }
        });
        Button order = (Button) findViewById(R.id.hostorder_order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HostOrderPageActivity.this, RestaurantMenuActivity.class);
                startActivity(i);
            }
        });
    }
}
