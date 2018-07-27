/*
 * Created by Isabel Maniega on 27/07/18 10:56
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 27/07/18 10:56
 */

package com.functions;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.functions.adapter.Theme1Adapter;
import com.functions.models.Theme1;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Theme1ExerActivity extends AppCompatActivity {

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.list)
    ListView listView;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private ActionBar bar;

    Parcelable savedRecyclerLayoutState;
    private Theme1Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercices);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        bar = getSupportActionBar();

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Theme1ExerActivity.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Theme1ExerActivity.this, YoutubeActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Theme1> theme = new ArrayList<Theme1>();
        theme.add(new Theme1(R.drawable.constantes1, R.string.y, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes2, R.string.x_enunciado, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes3, R.string.y, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes4, R.string.x_enunciado, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes5, R.string.y, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes6, R.string.x_enunciado, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes7, R.string.y, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes8, R.string.y, R.string.vacio));
        theme.add(new Theme1(R.drawable.constantes10, R.string.x_enunciado, R.string.vacio));

        //Cuando rote la pantalla se quede en item correspondiente:
        //When you rotate the screen, stay in the corresponding item:
        savedRecyclerLayoutState = listView.onSaveInstanceState();

        adapter = new Theme1Adapter(this, theme);
        listView.setAdapter(adapter);

        listView.onRestoreInstanceState(savedRecyclerLayoutState);

    }
}