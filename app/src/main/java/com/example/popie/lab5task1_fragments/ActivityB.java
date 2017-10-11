package com.example.popie.lab5task1_fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.popie.lab5task1_fragments.Fragment.SampleFragment;

public class ActivityB extends AppCompatActivity implements SampleFragment.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent intent = getIntent();
    }

    @Override
    public void supplyData(String data) {
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
    }
}
