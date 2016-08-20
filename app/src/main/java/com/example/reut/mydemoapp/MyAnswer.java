package com.example.reut.mydemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyAnswer extends AppCompatActivity {

    Intent intent = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      /*  fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        Intent currIntent = getIntent();
        String msg = getResources().getString(R.string.hello) + " " + currIntent.getStringExtra(MyActivity.MSG_1);
        TextView tv = new TextView(this);
        tv.setTextSize(40);
        tv.setText(msg);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.content);
        rl.addView(tv);
    }

}
