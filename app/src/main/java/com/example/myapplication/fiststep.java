package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fiststep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiststep);
    }
    public void onClick1(View view) {
        Intent intent= new Intent(fiststep.this, firstdisp.class);
        startActivity(intent);
    }
}