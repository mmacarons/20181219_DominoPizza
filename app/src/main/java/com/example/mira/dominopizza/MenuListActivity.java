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
        menus.add(new Menu("블랙앵거스 스테이크", "36,900", "31,000"));
        menus.add(new Menu("글램핑 바비큐", "35,900", "30,000"));
        menus.add(new Menu("알로하 하와이안", "25,900", "19,000"));
        menus.add(new Menu("콰트로 치즈 퐁듀", "25,900", "19,000"));
        menus.add(new Menu("블랙타이거슈림프", "35,900", "30,000"));
        menus.add(new Menu("7치즈 앤 그릴드비프", "35,900", "30,000"));
        menus.add(new Menu("와규 앤 비스테카", "35,900", "30,000"));
        menus.add(new Menu("직화 스테이크", "35,900", "30,000"));
        menus.add(new Menu("포테이토", "27,900", "21,000"));
        menus.add(new Menu("슈퍼디럭스", "27,900", "21,000"));
        menus.add(new Menu("슈퍼슈프림", "27,900", "21,000"));
        menus.add(new Menu("베이컨체더치즈", "27,900", "21,000"));
        menus.add(new Menu("불고기", "26,900", "20,000"));
        menus.add(new Menu("페퍼로니", "24,900", "18,000"));
        menus.add(new Menu("치즈", "23,900", "17,000"));


    }

    @Override
    public void bindViews() {
        this.listView = (ListView) findViewById(R.id.listView);

    }

}
