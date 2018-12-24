package com.example.mira.dominopizza.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mira.dominopizza.R;
import com.example.mira.dominopizza.datas.Menu;

import java.util.List;

public class MenuAdapter extends ArrayAdapter<Menu> {

    Context mContext;
    List<Menu> mList;
    LayoutInflater inf;

    public MenuAdapter(Context mContext, List<Menu> mList) {
        super(mContext, R.layout.menu_list_item, mList);

        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.menu_list_item, null);
        }

        TextView nameTxt = row.findViewById(R.id.nameTxt);

        Menu data = mList.get(position);

        nameTxt.setText(data.getName());

        return row;

    }
}
