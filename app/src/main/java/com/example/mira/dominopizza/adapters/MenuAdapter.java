package com.example.mira.dominopizza.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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
        TextView largePriceTxt = row.findViewById(R.id.largePriceTxt);
        TextView mediumPriceTxt = row.findViewById(R.id.mediumPriceTxt);
        ImageView logoImgView = row.findViewById(R.id.logoImgView);

        Menu data = mList.get(position);

        nameTxt.setText(data.getName());
        largePriceTxt.setText(data.getLargePrice());
        mediumPriceTxt.setText(data.getMediumPrice());
        Glide.with(mContext).load(data.getLogoURL()).into(logoImgView);


        return row;

    }
}
