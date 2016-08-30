package com.example.itachi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hi man!!", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "itachi is back!!", Toast.LENGTH_LONG).show();
    }
}
