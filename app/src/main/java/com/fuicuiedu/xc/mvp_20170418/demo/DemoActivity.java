package com.fuicuiedu.xc.mvp_20170418.demo;

import com.fuicuiedu.xc.mvp_20170418.MyMvp.MyMvpActivity;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public class DemoActivity extends MyMvpActivity<DemoPresenter,DemoView> implements DemoView{

    @Override
    public DemoPresenter createPresenter() {
        DemoPresenter demoPresenter = new DemoPresenter();
        return demoPresenter;
    }


}
