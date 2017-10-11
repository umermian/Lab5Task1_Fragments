package com.example.popie.lab5task1_fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.popie.lab5task1_fragments.Fragment.SampleFragment;

public class ActivityA extends AppCompatActivity implements View.OnClickListener, SampleFragment.Communicator {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.goToB);
        button.setOnClickListener(this);
    }

    @Override
    public void supplyData(String data) {
        textView.setText(data);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
}
