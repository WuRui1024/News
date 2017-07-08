package Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bwei.admin.news.R;

/**
 * 类描述：
 * 创建人：WuRui
 * 创建时间：2017/7/7 16:25
 */
public class Headline extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.headline, container, false);

        return view;
    }

}
