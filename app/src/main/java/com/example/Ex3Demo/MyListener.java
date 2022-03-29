package com.example.Ex3Demo;

import android.view.View;
import android.widget.TextView;

public class MyListener implements View.OnClickListener{
    TextView tvShow;

    public MyListener(TextView tvShow){
        this.tvShow=tvShow;
    }
    @Override
    public void onClick(View view) {
        tvShow.setText("外部类作为监听器");
    }
}
