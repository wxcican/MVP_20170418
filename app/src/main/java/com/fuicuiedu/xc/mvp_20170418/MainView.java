package com.fuicuiedu.xc.mvp_20170418;

import java.util.List;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public interface MainView {

    //progressbar 显示
    void showPrb();
//progressbar 隐藏
    void hidePrb();
//setData 设置数据（改变listView，刷新）
    void setData(List<String> datas);
}
