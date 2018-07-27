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

import com.functions.adapter.Theme2ppAdapter;
import com.functions.models.Theme2pp;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProportionDirectActivity extends AppCompatActivity {

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.list)
    ListView listView;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private ActionBar bar;

    Parcelable savedRecyclerLayoutState;
    private Theme2ppAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerc2pp);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        bar = getSupportActionBar();

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(ProportionDirectActivity.this, Theme2ExercActivity.class);
                startActivity(back);
                finish();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProportionDirectActivity.this, Youtube2ppActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Theme2pp> theme2 = new ArrayList<Theme2pp>();
        theme2.add(new Theme2pp(R.drawable.pp_directa1 ,R.string.y, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.lineal, R.string.vacio,R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa2 ,R.string.y, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.lineal, R.string.vacio,R.string.vacio));;
        theme2.add(new Theme2pp(R.drawable.pp_directa3 ,R.string.y, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa4 ,R.string.y, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa5 ,R.string.y, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.lineal, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa6 ,R.string.y, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.lineal, R.string.vacio,R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa7 ,R.string.y, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa8 ,R.string.y, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.lineal, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa9 ,R.string.y, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2pp(R.drawable.pp_directa10 ,R.string.y, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.lineal, R.string.vacio, R.string.vacio));

        //Cuando rote la pantalla se quede en item correspondiente:
        //When you rotate the screen, stay in the corresponding item:
        savedRecyclerLayoutState = listView.onSaveInstanceState();

        adapter = new Theme2ppAdapter(this, theme2);
        listView.setAdapter(adapter);

        listView.onRestoreInstanceState(savedRecyclerLayoutState);

    }
}
