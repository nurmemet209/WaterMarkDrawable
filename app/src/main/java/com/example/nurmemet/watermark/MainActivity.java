package com.example.nurmemet.watermark;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.cn.watermark.WaterMarkDrawable;

public class MainActivity extends AppCompatActivity {

    ViewGroup mContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer= (ViewGroup) findViewById(R.id.activity_main);
        WaterMarkDrawable drawable=new WaterMarkDrawable("nurmemet9079",getResources().getColor(R.color.textgreen),30,getResources().getColor(R.color.text));
        mContainer.setBackground(drawable);

    }
}
