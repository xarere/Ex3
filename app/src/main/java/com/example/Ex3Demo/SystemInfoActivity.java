package com.example.Ex3Demo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SystemInfoActivity extends AppCompatActivity {
    TextView tvShowOri,tvShowNav,tvShowMnc,tvShowTouch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_info);
        tvShowOri=findViewById(R.id.tv_system_info_activity_ori);
        tvShowNav=findViewById(R.id.tv_system_info_activity_nav);
        tvShowTouch=findViewById(R.id.tv_system_info_activity_touch);
        tvShowMnc=findViewById(R.id.tv_system_info_activity_mnc);
        Configuration cfg=getResources().getConfiguration();;
        String screen = cfg.orientation == Configuration.ORIENTATION_LANDSCAPE ? "横向屏幕": "竖向屏幕";
        String mncCode = cfg.mnc + "";
        String naviName = cfg.orientation == Configuration.NAVIGATION_NONAV ? "没有方向控制": cfg.orientation == Configuration.NAVIGATION_WHEEL ? "滚轮控制方向": cfg.orientation == Configuration.NAVIGATION_DPAD ? "方向键控制方向 ": "轨迹球控制方向";
        tvShowNav.setText(naviName);
        String touchName = cfg.touchscreen == Configuration.TOUCHSCREEN_NOTOUCH ? "无触摸屏": cfg.touchscreen == Configuration.TOUCHSCREEN_STYLUS ? "触摸笔式触摸屏": "接受手指的触摸屏";
        tvShowOri.setText(screen);
        tvShowMnc.setText(mncCode);
        tvShowTouch.setText(touchName);
    }
}