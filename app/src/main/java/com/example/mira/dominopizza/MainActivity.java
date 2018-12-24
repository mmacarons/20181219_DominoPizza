package com.example.mira.dominopizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout orderBtn;
    Button LoginBtn;
    private android.widget.TextView pizzaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "주문화면으로 이동합니다.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, OrderActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        pizzaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MenuListActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        this.LoginBtn = (Button) findViewById(R.id.LoginBtn);
        this.orderBtn = (LinearLayout) findViewById(R.id.orderBtn);
        this.pizzaBtn = (TextView) findViewById(R.id.pizzaBtn);


    }
}
