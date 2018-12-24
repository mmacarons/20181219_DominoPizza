package com.example.mira.dominopizza;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mira.dominopizza.adapters.MenuAdapter;
import com.example.mira.dominopizza.datas.Menu;

import java.util.ArrayList;

public class MenuListActivity extends BaseActivity {

    MenuAdapter mAdapter;
    ArrayList<Menu> menus = new ArrayList<Menu>();

    private android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        fillMenus();

        mAdapter = new MenuAdapter(mContext, menus);
        listView.setAdapter(mAdapter);


    }

    private void fillMenus() {
        menus.clear();
        menus.add(new Menu("블랙앵거스 스테이크"));
        menus.add(new Menu("글램핑 바비큐"));
        menus.add(new Menu("알로하 하와이안"));
        menus.add(new Menu("콰트로 치즈 퐁듀"));
        menus.add(new Menu("블랙타이거슈림프"));

    }

    @Override
    public void bindViews() {
        this.listView = (ListView) findViewById(R.id.listView);

    }

}
