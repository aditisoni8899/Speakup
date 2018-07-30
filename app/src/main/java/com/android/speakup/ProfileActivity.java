package com.android.speakup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kamalshree on 7/29/2018.
 */

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.speakup_toolbar)
    Toolbar speakup_toolbar;

    @BindView(R.id.tv_toolbar_title)
    TextView tv_toolbar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

 /* Toolbar */
        speakup_toolbar.setNavigationIcon(R.drawable.left_arrow);
        setSupportActionBar(speakup_toolbar);
        tv_toolbar_title.setText("Profile");
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        speakup_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
