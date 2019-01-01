package com.example.mira.dominopizza;

import android.content.Intent;
import android.net.Uri;
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
    private LinearLayout openSurveyBtn;
    private LinearLayout bigOrderBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindViews();
        setupEvents();
        setValues();

        Toast.makeText(mContext, "onCreate", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(mContext, "onResume", Toast.LENGTH_SHORT).show();
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

                String userId = getIntent().getStringExtra("입력아이디");

                if (userId != null) {
                    Toast.makeText(mContext, "주문화면으로 이동합니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(mContext, MenuListActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(mContext, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
        pizzaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MenuListActivity.class);
                startActivity(intent);
            }
        });
        openSurveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://web.dominos.co.kr/survey/surveyForm");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        bigOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://cdn.dominos.co.kr/renewal2016/ko/w/img/specials_event/event_list199.jpg");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

        String userId = getIntent().getStringExtra("입력아이디");

        if (userId != null) {
            setTitle(String.format("%s님 안녕하세요!", userId));
        }

    }

    @Override
    public void bindViews() {

        this.LoginBtn = (Button) findViewById(R.id.LoginBtn);
        this.openSurveyBtn = (LinearLayout) findViewById(R.id.openSurveyBtn);
        this.bigOrderBtn = (LinearLayout) findViewById(R.id.bigOrderBtn);
        this.orderBtn = (LinearLayout) findViewById(R.id.orderBtn);
        this.pizzaBtn = (TextView) findViewById(R.id.pizzaBtn);


    }
}
