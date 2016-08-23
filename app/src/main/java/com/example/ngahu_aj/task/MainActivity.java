package com.example.ngahu_aj.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread bg = new Thread(){
            @Override
            public void run() {
                try{

                }
            }
        };
    }
}
