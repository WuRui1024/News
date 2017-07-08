package bwei.admin.news;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hjm.bottomtabbar.BottomTabBar;

import Fragment.Headline;
import Fragment.Home_page;
import Fragment.Loge;
import Fragment.Video;

public class MainActivity extends AppCompatActivity {
    private BottomTabBar mBottomTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomTabBar = (BottomTabBar) findViewById(R.id.bottom_tab_bar);
        mBottomTabBar.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.RED,Color.WHITE)
                .addTabItem("首页", R.mipmap.ic_launcher, Home_page.class)
                .addTabItem("视频", R.mipmap.ic_launcher, Video.class)
                .addTabItem("微头条", R.mipmap.ic_launcher, Headline.class)
                .addTabItem("登录", R.mipmap.ic_launcher, Loge.class)
                .setTabBarBackgroundColor(Color.GRAY)
                .isShowDivider(false);
    }
}