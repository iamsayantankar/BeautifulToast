package com.thebengalstudio.beautifultoast_lib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.thebengalstudio.beautifultoast.BeautifulToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BeautifulToast.makeText(MainActivity.this,"Internal server error...", Toast.LENGTH_LONG,R.style.toaststyle_error).show();

    }
}