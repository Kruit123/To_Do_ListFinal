package com.example.krutant.to_do_listfinal;

import java.util.List;
import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.BaseAdapter;

import android.widget.TextView;

public class listAdapter extends BaseAdapter {

    private Context mContext;

    private List<Combine> listItem;


    public listAdapter(Context context, List<Combine> list) {

        mContext = context;

        listItem = list;

    }

    @Override

    public int getCount() {

        return listItem.size();

    }

    @Override

    public Object getItem(int pos) {

        return listItem.get(pos);

    }

    @Override

    public long getItemId(int pos) {

        return pos;

    }

    @Override

    public View getView(int pos, View convertView, ViewGroup parent) {

        // get selected entry

        Combine entry = listItem.get(pos);


        // inflating list view layout if null

        if(convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(mContext);

            convertView = inflater.inflate(R.layout.activity_main, null);

        }


        // set name

        TextView tvName = (TextView)convertView.findViewById(R.id.item);

        tvName.setText(entry.getItem());



        // set phone

        TextView tvPhone = (TextView)convertView.findViewById(R.id.subitem);

        tvPhone.setText(entry.getSubItem());

        return convertView;

    }



}