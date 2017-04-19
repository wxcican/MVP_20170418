package com.fuicuiedu.xc.mvp_20170418.mosby;

import android.os.AsyncTask;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public class LoginPresenter extends MvpNullObjectBasePresenter<LoginView> {

    public void login() {
        //显示加载动画
        getView().showPrb();
        //异步任务，登录操作
        new LoginAsyncTask().execute();
    }

    class LoginAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            //提示用户
            getView().showMsg("登录成功");
            //隐藏加载动画
            getView().hidePrb();
        }
    }


}
