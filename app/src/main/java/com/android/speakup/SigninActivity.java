package com.android.speakup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kamalshree on 7/28/2018.
 */

public class SigninActivity extends AppCompatActivity{

    public @BindView(R.id.bn_register)
    Button bn_register;

    public @BindView(R.id.bn_signin)
    Button bn_signin;

    public @BindView(R.id.tv_forgotpassword)
    TextView tv_forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bn_register)
    void registerButton(View view) {
        Intent registerintent = new Intent(SigninActivity.this, RegistrationActivity.class);
        startActivity(registerintent);
    }
    @OnClick(R.id.tv_forgotpassword)
    void forgotpasswordButton(View view) {
        Intent forgotpasswordintent = new Intent(SigninActivity.this, ForgotPasswordActivity.class);
        startActivity(forgotpasswordintent);
    }
    @OnClick(R.id.bn_signin)
    void signinButton(View view) {
        Intent Signinintent = new Intent(SigninActivity.this, DashboardActivity.class);
        startActivity(Signinintent);
    }
}
