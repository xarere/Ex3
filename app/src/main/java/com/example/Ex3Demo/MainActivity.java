package com.example.Ex3Demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5;
    TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShow=findViewById(R.id.tv_show);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2=findViewById(R.id.btn2);
        MyListener listener=new MyListener();
        btn2.setOnClickListener(listener);


        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvShow.setText(btn3.getText().toString());
            }
        });

        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(v ->{
            tvShow.setText(btn4.getText().toString());
        });

        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(new com.example.Ex3Demo.MyListener(tvShow));

    }


    class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            tvShow.setText(btn2.getText().toString());
        }
    }

    public void onClickbtn6(View view) {
        tvShow.setText("监听器绑定到标签");
    }

    public void onClickbtn7(View view) {
        startActivity(new Intent(this, SystemInfoActivity.class));

    }

    public void onClickbtn8(View view) {
        startActivity(new Intent(this, ProgressDialogUtils.class));

    }

    @Override
    public void onClick(View view) {
        tvShow.setText(btn1.getText().toString());
    }
}
