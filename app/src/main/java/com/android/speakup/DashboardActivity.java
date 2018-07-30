package com.android.speakup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

import com.android.speakup.Adapter.ImageAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by kamalshree on 7/28/2018.
 */

public class DashboardActivity extends AppCompatActivity {


    private List<Integer> dashbaordResultList;
    private List<String> titleResultList;
    ImageAdapter imageAdapter;

    public @BindView(R.id.gv_dashboard_gridview)
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

        dashbaordResultList = new ArrayList<>();
        titleResultList = new ArrayList<>();

        dashbaordResultList.add(R.drawable.agenda);
        dashbaordResultList.add(R.drawable.search);
        dashbaordResultList.add(R.drawable.notification);
        dashbaordResultList.add(R.drawable.location);
        dashbaordResultList.add(R.drawable.follower);
        dashbaordResultList.add(R.drawable.about);
        dashbaordResultList.add(R.drawable.settings);

        titleResultList.add("Agenda");
        titleResultList.add("Information");
        titleResultList.add("Notification");
        titleResultList.add("Placeholder");
        titleResultList.add("Follower");
        titleResultList.add("Speaker");
        titleResultList.add("Settings");

        imageAdapter = new ImageAdapter(this ,R.layout.list_item, dashbaordResultList,titleResultList);
        gridView.setAdapter(imageAdapter);
    }

}