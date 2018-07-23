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

import com.functions.adapter.Theme3Adapter;
import com.functions.models.Theme3;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Theme3ExercActivity extends AppCompatActivity {

    @BindView(R.id.fab) FloatingActionButton fab;

    @BindView(R.id.list)
    ListView listView;

    @BindView(R.id.toolbar) Toolbar toolbar;
    private ActionBar bar;

    Parcelable savedRecyclerLayoutState;
    private Theme3Adapter adapter;


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
                Intent back = new Intent(Theme3ExercActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Theme3ExercActivity.this, Youtube3Activity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Theme3> theme2 = new ArrayList<Theme3>();
        theme2.add(new Theme3(R.drawable.parab1 ,R.string.y, R.string.vacio,R.string.x2, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab2 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab3 ,R.string.y, R.string.vacio,R.string.x2, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab4 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab5 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab6 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab8 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab7 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab9 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));
        theme2.add(new Theme3(R.drawable.parab10 ,R.string.y, R.string.vacio,R.string.x2,R.string.vacio,R.string.x,R.string.vacio, R.string.vacio, R.string.vacio, R.string.vacio));

        //Cuando rote la pantalla se quede en item correspondiente:
        //When you rotate the screen, stay in the corresponding item:
        savedRecyclerLayoutState = listView.onSaveInstanceState();

        adapter = new Theme3Adapter(this, theme2);
        listView.setAdapter(adapter);

        listView.onRestoreInstanceState(savedRecyclerLayoutState);

    }

}