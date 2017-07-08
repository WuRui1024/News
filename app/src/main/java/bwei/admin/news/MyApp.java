package bwei.admin.news;

import android.app.Application;

import org.xutils.x;

/**
 * 类描述：
 * 创建人：WuRui
 * 创建时间：2017/7/6 20:53
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}
