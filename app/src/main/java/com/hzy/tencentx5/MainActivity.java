package com.hzy.tencentx5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String mUrl = "http://www.baidu.com/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showWebView(View v) {
        Intent intent = new Intent(this, X5WebView.class);
        intent.putExtra("mUrl", mUrl);
        startActivity(intent);
    }

}
