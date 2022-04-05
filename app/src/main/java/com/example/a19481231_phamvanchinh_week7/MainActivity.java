package com.example.a19481231_phamvanchinh_week7;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataUser dataUser = new DataUser(this, "userdb.sqlite",null,1);
        dataUser.addUser(new User(1,"Vu"));
    }
}