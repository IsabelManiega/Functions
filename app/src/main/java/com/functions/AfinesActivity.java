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

import com.functions.adapter.Theme2afAdapter;
import com.functions.models.Theme2af;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AfinesActivity extends AppCompatActivity {

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.list)
    ListView listView;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private ActionBar bar;

    Parcelable savedRecyclerLayoutState;
    private Theme2afAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerc2af);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        bar = getSupportActionBar();

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AfinesActivity.this, Theme2ExercActivity.class);
                startActivity(back);
                finish();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AfinesActivity.this, Youtube2afActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Theme2af> theme2 = new ArrayList<Theme2af>();
        theme2.add(new Theme2af(R.drawable.afines1 , R.string.ysin, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x,R.string.vacio,
                                R.string.vacio, R.string.lineal,R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines2 ,R.string.ysin, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.vacio, R.string.lineal, R.string.vacio,R.string.vacio, R.string.vacio));;
        theme2.add(new Theme2af(R.drawable.afines3 ,R.string.ysin, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines4 ,R.string.ysin, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines5 ,R.string.ysin, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.vacio, R.string.lineal, R.string.vacio,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines6 ,R.string.ysin, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.vacio, R.string.lineal, R.string.vacio,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines7 ,R.string.ysin, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines8 ,R.string.ysin, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.vacio, R.string.lineal, R.string.vacio,R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines9 ,R.string.ysin, R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme2af(R.drawable.afines10 ,R.string.ysin, R.string.vacio,R.string.lineal, R.string.vacio, R.string.x, R.string.vacio,
                R.string.vacio, R.string.lineal, R.string.vacio,R.string.vacio, R.string.vacio));

        //Cuando rote la pantalla se quede en item correspondiente:
        //When you rotate the screen, stay in the corresponding item:
        savedRecyclerLayoutState = listView.onSaveInstanceState();

        adapter = new Theme2afAdapter(this, theme2);
        listView.setAdapter(adapter);

        listView.onRestoreInstanceState(savedRecyclerLayoutState);

    }
}
