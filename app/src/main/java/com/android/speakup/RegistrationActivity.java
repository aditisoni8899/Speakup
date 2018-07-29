package com.android.speakup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kamalshree on 7/28/2018.
 */

public class RegistrationActivity extends AppCompatActivity{

    public @BindView(R.id.bn_registration)
    Button bn_registration;
    public @BindView(R.id.bn_login)
    Button bn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.bn_login)
    void loginButton(View view) {
        Intent registerintent = new Intent(RegistrationActivity.this, SigninActivity.class);
        startActivity(registerintent);
    }

    @OnClick(R.id.bn_registration)
    void registerButton(View view) {
        Intent loginintent = new Intent(RegistrationActivity.this, SuccessActivity.class);
        startActivity(loginintent);
    }
}