package com.fuicuiedu.xc.mvp_20170418.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fuicuiedu.xc.mvp_20170418.R;

//视图与业务
//
//视图
//两个EditText
//button
//progressbar
//
//视图操作：
//progressbar显示和隐藏
//toast 显示注册提示信息
//
//业务:
//模拟网络请求，点击注册后3s提示注册成功

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
