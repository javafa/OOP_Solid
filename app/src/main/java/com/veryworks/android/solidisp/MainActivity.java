package com.veryworks.android.solidisp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements DetailListener,ListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListFragment list = new ListFragment();
        DetailFragment detail = new DetailFragment();

        setList();
    }

    private void setList(){
        // 프래그먼트 activity에 붙이기
    }

    @Override
    public void goDetail(){
        // 디테일 프래그먼트로 이동하기
    }

    @Override
    public void goList(){
        // 리스트 프래그먼트로 이동하기
    }
}
