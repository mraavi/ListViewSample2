package com.appcrops.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mraavi on 21/03/17.
 */

public class CricketerListAdapter extends BaseAdapter {
    private class ViewHolder {
        TextView name;
        TextView age;
    }

    private ArrayList<Cricketer> mCricketerList;
    private Context mContext;

    public CricketerListAdapter (Context context, ArrayList<Cricketer> cricketers) {
        mCricketerList = cricketers;
        mContext = context;
    }

    @Override
    public int getCount() {
        if (mCricketerList != null) {
            return mCricketerList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return mCricketerList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cricketer_list_item, viewGroup, false);
        viewHolder.name = (TextView) view.findViewById(R.id.name);
        viewHolder.age = (TextView)view.findViewById(R.id.age);

        Cricketer cricketer = mCricketerList.get(pos);
        viewHolder.name.setText(cricketer.getName());
        viewHolder.age.setText(Integer.toString(cricketer.getAge()));

        return view;
    }
}
