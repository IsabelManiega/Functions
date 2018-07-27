/*
 * Created by Isabel Maniega on 27/07/18 10:56
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 27/07/18 10:56
 */

package com.functions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import java.text.DecimalFormat;

public class ImageActivity extends Activity {
    private DecimalFormat df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_zoom);

        //pop up window
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int Height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(Height*.6));


        ImageView imageView = findViewById(R.id.imagenParab);

        Intent intent = getIntent();
        int image = intent.getIntExtra("Image", 0);
        imageView.setImageResource(image);

        df = new DecimalFormat("#.##");

    }
}
