package com.example.cicct.luminous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ImageView mImgView;
    private ToggleButton mBtnSwitch;

    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        mBtnSwitch = (ToggleButton) findViewById(R.id.tBtnSwitch);
        mImgView = (ImageView) findViewById(R.id.mImgPic);
        mBtnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 0 ){
                    count++;
                    mImgView.setImageResource(R.drawable.fo);
                }else{
                    count--;
                    mImgView.setImageResource(R.drawable.on);
                }
            }
        });

    }
}
