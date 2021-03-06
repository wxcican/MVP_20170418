package com.fuicuiedu.xc.mvp_20170418.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fuicuiedu.xc.mvp_20170418.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

public class RegisterActivity extends AppCompatActivity implements RegisterView{

    @BindView(R.id.register_prb)ProgressBar mPrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.register_btn)
    public void onClick(){
        //业务操作
        RegisterPresenter registerPresenter = new RegisterPresenter(this);
        registerPresenter.register();
    }

    @Override
    public void showPrb() {
        mPrb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePrb() {
        mPrb.setVisibility(View.GONE);
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
