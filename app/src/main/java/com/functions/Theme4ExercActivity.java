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

import com.functions.adapter.Theme4Adapter;
import com.functions.models.Theme4;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Theme4ExercActivity extends AppCompatActivity {

    @BindView(R.id.fab) FloatingActionButton fab;

    @BindView(R.id.list)
    ListView listView;

    @BindView(R.id.toolbar) Toolbar toolbar;
    private ActionBar bar;

    Parcelable savedRecyclerLayoutState;
    private Theme4Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerc3);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        bar = getSupportActionBar();

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Theme4ExercActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Theme4ExercActivity.this, Youtube4Activity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Theme4> theme4 = new ArrayList<Theme4>();
        theme4.add(new Theme4(R.drawable.hiperbola1 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola2 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola3 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola4 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola5 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_,R.string.vacio, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola6 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_,R.string.vacio, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola7 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_,R.string.vacio, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola8 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_,R.string.vacio, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola9 ,R.string.y, R.string.vacio,R.string.lineal,R.string.x_,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme4.add(new Theme4(R.drawable.hiperbola10 ,R.string.y,R.string.vacio,R.string.lineal,R.string.x_,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));

        //Cuando rote la pantalla se quede en item correspondiente:
        // When rotate the screen  give item:
        savedRecyclerLayoutState = listView.onSaveInstanceState();

        adapter = new Theme4Adapter(this, theme4);
        listView.setAdapter(adapter);

        listView.onRestoreInstanceState(savedRecyclerLayoutState);

    }

}