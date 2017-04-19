package com.fuicuiedu.xc.mvp_20170418.mosby;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fuicuiedu.xc.mvp_20170418.R;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends MvpActivity<LoginView,LoginPresenter> implements LoginView{

    @BindView(R.id.login_prb)ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();//创建业务类
    }

    @Override
    public void showPrb() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePrb() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.login_btn)
    public void onClick(){
        //执行业务
        getPresenter().login();
    }
}
