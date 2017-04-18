package com.fuicuiedu.xc.mvp_20170418.register;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public interface RegisterView {

    //progressbar显示和隐藏
    void showPrb();
    void hidePrb();
//toast 显示注册提示信息
    void showMsg(String msg);
}
