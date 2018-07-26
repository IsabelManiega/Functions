package com.functions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.functions.adapter.RecyclerViewAdapter;
import com.functions.models.Lessons;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview1)
    RecyclerView recyclerView;

    private List<Lessons> mLessons;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerViewAdapter RecyclerViewHorizontalAdapter;
    LinearLayoutManager HorizontalLayout ;
    View ChildView ;
    int RecyclerViewItemPosition ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(RecyclerViewLayoutManager);

        // Adding items to RecyclerView.
        AddItemsToRecyclerViewArrayList();

        RecyclerViewHorizontalAdapter = new RecyclerViewAdapter(this,mLessons);

        HorizontalLayout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);

        recyclerView.setAdapter(RecyclerViewHorizontalAdapter);


        // Adding on item click listener to RecyclerView.
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

            GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {

                @Override public boolean onSingleTapUp(MotionEvent motionEvent) {

                    return true;
                }


            });
            @Override
            public boolean onInterceptTouchEvent(RecyclerView Recyclerview, MotionEvent motionEvent) {

                ChildView = Recyclerview.findChildViewUnder(motionEvent.getX(), motionEvent.getY());

                if(ChildView != null && gestureDetector.onTouchEvent(motionEvent)) {

                    //Getting clicked value.
                    RecyclerViewItemPosition = Recyclerview.getChildAdapterPosition(ChildView);

                    String Theme = String.valueOf(mLessons.get(RecyclerViewItemPosition));

                    if(RecyclerViewItemPosition == 0){

                        startActivity(new Intent(MainActivity.this, Theme1ExerActivity.class).putExtra("Theme", Theme));
                        finish();

                    }else if (RecyclerViewItemPosition == 1){

                        startActivity(new Intent(MainActivity.this, Theme2ExercActivity.class).putExtra("Theme", Theme));
                        finish();

                    }else if (RecyclerViewItemPosition == 2){

                        startActivity(new Intent(MainActivity.this, Theme3ExercActivity.class).putExtra("Theme", Theme));
                        finish();

                    }else if (RecyclerViewItemPosition == 3){

                        startActivity(new Intent(MainActivity.this, Theme4ExercActivity.class).putExtra("Theme", Theme));
                        finish();

                    }else {
                        startActivity(new Intent(getApplicationContext(), ExamenActivity.class).putExtra("Theme", Theme));
                        finish();
                    }
                }

                return false;

            }

            @Override
            public void onTouchEvent(RecyclerView Recyclerview, MotionEvent motionEvent) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

    }
    

    // function to add items in RecyclerView.
    public void AddItemsToRecyclerViewArrayList(){

        mLessons = new ArrayList<>();
        mLessons.add(new Lessons(R.string.title_main, R.string.Subtitle_main,R.drawable.constantes1));
        mLessons.add(new Lessons(R.string.title_main2, R.string.Subtitle_main2,R.drawable.pp_directa1));
        mLessons.add(new Lessons(R.string.title_main3, R.string.Subtitle_main3,R.drawable.parab1));
        mLessons.add(new Lessons(R.string.title_main4, R.string.subtitle_main4, R.drawable.hiperbola1));
        mLessons.add(new Lessons(R.string.title_mainEx, R.string.Subtitle_mainEx, R.drawable.portadaexamen));

    }
}
