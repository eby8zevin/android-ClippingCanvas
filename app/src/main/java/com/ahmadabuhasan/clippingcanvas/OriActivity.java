package com.ahmadabuhasan.clippingcanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Created by Ahmad Abu Hasan on 16/10/2020.
 */

public class OriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ClippedOri(this));
        setTitle("Original Clipping");
    }
}