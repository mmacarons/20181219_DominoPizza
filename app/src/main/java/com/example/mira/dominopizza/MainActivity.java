package com.example.mira.dominopizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout orderBtn;

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

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "주문화면으로 이동합니다.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, OrderActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        orderBtn = findViewById(R.id.orderBtn);


    }
}
