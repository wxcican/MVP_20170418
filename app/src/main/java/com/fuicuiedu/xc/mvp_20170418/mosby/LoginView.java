package com.fuicuiedu.xc.mvp_20170418.mosby;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public interface LoginView extends MvpView{

    void showPrb();

    void hidePrb();

    void showMsg(String msg);
}
