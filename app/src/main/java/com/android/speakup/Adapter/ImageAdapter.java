package com.android.speakup.Adapter;

/**
 * Created by kamalshree on 7/28/2018.
 */

import android.content.Context;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.speakup.MainActivity;
import com.android.speakup.ProfileActivity;
import com.android.speakup.R;
import com.android.speakup.SigninActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;


public class ImageAdapter extends ArrayAdapter<Integer> {
    private final List<Integer> mResultList;
    private final List<String> tResultList;
    private final Context mContext;
    private final int resource;
    public @BindView(R.id.tv_imagepath)
    ImageView posterImage;

    public @BindView(R.id.tv_title)
    TextView tv_title;


    public ImageAdapter(Context context, int resource, List<Integer> movieResources,List<String> titleResources) {
        super(context, resource, movieResources);
        this.mContext = context;
        this.resource = resource;
        this.mResultList = movieResources;
        this.tResultList = titleResources;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(resource, null, false);

        posterImage = view.findViewById(R.id.tv_imagepath);
        tv_title = view.findViewById(R.id.tv_title);
        Picasso.get()
                .load( mResultList.get(position))
                .placeholder(R.drawable.ic_launcher_background)
                .into(posterImage);
        tv_title.setText(tResultList.get(position));

        posterImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ProfileActivity.class);
                mContext.startActivity(intent);
            }
        });

    return view;
    }
}