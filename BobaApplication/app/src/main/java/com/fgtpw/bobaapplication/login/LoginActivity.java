package com.fgtpw.bobaapplication.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.fgtpw.bobaapplication.MainActivity;
import com.fgtpw.bobaapplication.R;
import com.fgtpw.bobaapplication.networking.DataManager;

import data.User;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        //createSomeFakeUsers();
    }

    private void createSomeFakeUsers() {
        DataManager dataManager = new DataManager(this);
        dataManager.createUser(new User("Michelle Wong", "911", "michelle_wong47@hotmail.com"));
        dataManager.createUser(new User("Mark Poulin", "911", "m@rcpoulin.com"));
    }
}
