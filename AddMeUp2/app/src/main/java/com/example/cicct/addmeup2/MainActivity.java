package com.example.cicct.addmeup2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mFirst;
    private EditText mSecond;
    private Button mEquals;
    private TextView mResult;
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirst = (EditText) findViewById(R.id.firstNum);
        mSecond = (EditText) findViewById(R.id.secondNum);
        mEquals = (Button) findViewById(R.id.equals);
        mResult = (TextView) findViewById(R.id.result);

        mEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add(Double.parseDouble(mFirst.getText().toString()), Double.parseDouble(mSecond.getText().toString()));
                mResult.setText(result+"");
            }
        });
    }

    public void add(double first, double second){
        this.result = first + second;
    }
}
