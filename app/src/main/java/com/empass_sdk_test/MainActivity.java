package com.empass_sdk_test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.mylibrary.LibActivity;


public class MainActivity extends Activity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
    }

    public void onClick(View view) {
        LibActivity.callLib(this);
    }

}
