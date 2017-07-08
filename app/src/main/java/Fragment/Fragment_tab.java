package Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import bwei.admin.news.R;

/**
 * 类描述：
 * 创建人：WuRui
 * 创建时间：2017/7/7 9:53
 */
public class Fragment_tab extends Fragment {
private ListView listview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
         listview = (ListView) view.findViewById(R.id.listview);
        loding();
        return view;
    }

    private void loding() {
        new Thread(){
            @Override
            public void run() {

            }
        }.start();
    }

    class MyBase extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }

}
