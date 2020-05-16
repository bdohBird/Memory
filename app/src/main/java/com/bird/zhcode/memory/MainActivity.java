package com.bird.zhcode.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public class MainActivityHolder{
        List<MainActivity> mainActivity = new ArrayList<>();
    }

    public static MainActivityHolder mainActivityHolder ;

    List<String> list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (mainActivityHolder==null) {
            mainActivityHolder = new MainActivityHolder();
        }
        mainActivityHolder.mainActivity.add(this);
        for (int i = 0; i < 1000; i++) {
            list.add(i+"");
        }

    }
}
