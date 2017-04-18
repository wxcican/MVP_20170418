package com.fuicuiedu.xc.mvp_20170418.register;

import android.os.AsyncTask;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class RegisterPresenter {

    private RegisterView registerView;

    public RegisterPresenter(RegisterView registerView){
        this.registerView = registerView;
    }

    public void register(){
        //显示加载动画
        registerView.showPrb();
        new MyAsyncTask().execute();
    }

    class MyAsyncTask extends AsyncTask<Void,Void,Void>{

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
            registerView.showMsg("注册成功");
            registerView.hidePrb();
        }
    }

}
