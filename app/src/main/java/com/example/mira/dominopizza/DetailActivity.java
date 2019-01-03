package com.example.mira.dominopizza;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends BaseActivity {

    private android.widget.TextView largePriceTxt;
    private android.widget.TextView mediumPriceTxt;
    private TextView nameTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {


    }

    @Override
    public void setValues() {


    }

    @Override
    public void bindViews() {
        this.nameTxt = (TextView) findViewById(R.id.nameTxt);
        this.mediumPriceTxt = (TextView) findViewById(R.id.mediumPriceTxt);
        this.largePriceTxt = (TextView) findViewById(R.id.largePriceTxt);

    }
}
