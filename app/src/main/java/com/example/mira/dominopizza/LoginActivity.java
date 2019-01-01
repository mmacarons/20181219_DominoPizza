package com.example.mira.dominopizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private android.widget.TextView loginBtn;
    private android.widget.EditText idTxt;
    private android.widget.EditText passwordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputid = idTxt.getText().toString();
                String inputpw = passwordTxt.getText().toString();

                if (inputid.equals("")) {
                    Toast.makeText(mContext, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if (inputpw.isEmpty()) {
                    Toast.makeText(mContext, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(mContext, "로그인에 성공했습니다.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, MenuListActivity.class);
                    intent.putExtra("입력아이디", inputid);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                }
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.loginBtn = (Button) findViewById(R.id.loginBtn);
        this.passwordTxt = (EditText) findViewById(R.id.passwordTxt);
        this.idTxt = (EditText) findViewById(R.id.idTxt);
    }
}
