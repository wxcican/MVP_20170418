package com.fuicuiedu.xc.mvp_20170418.MyMvp;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public class MyMvpPresenter<V extends MyMvpView> {

    private V v;

    //经常要用到View接口，所以写在父类方法，方便调用
    public V getView(){
        if (v == null){
            //抛异常
        }
        return v;
    }

}
