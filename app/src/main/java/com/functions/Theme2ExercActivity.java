package com.functions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Theme2ExercActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private ActionBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_theme2);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        bar = getSupportActionBar();

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Theme2ExercActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

        }
    public void pp_directa (View v){
        startActivity(new Intent (this, ProportionDirectActivity.class));
    }

    public void afines (View v){
        startActivity(new Intent (this, AfinesActivity.class));
    }
}
