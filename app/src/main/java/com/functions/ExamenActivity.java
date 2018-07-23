package com.functions;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExamenActivity extends AppCompatActivity {

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private ActionBar bar;

    float scoreTotal;

    private String number;
    private String number3;
    private String number2;
    private String number4;
    private String number5;
    private String number6;
    private String number7;
    private String number8;
    private String number9;
    private String number10;
    private String number11;
    private String number12;
    private String number13;
    private String number14;
    private String number15;
    private String number16;
    private String number17;
    private String number18;
    private String number19;
    private String number20;
    private String number21;
    private String number22;
    private String number23;
    private String number24;
    private String number25;
    private String number26;
    private String number27;
    private String number28;
    private String number29;
    private String number30;
    private String number31;
    private String number32;
    private String number33;
    private String number34;
    private String number35;
    private String number36;
    private String number37;
    private String number38;
    private String number39;
    private String number40;
    private String number41;
    private String number42;


    private int numberfinal;
    private int numberfinal2;
    private int numberfinal3;
    private int numberfinal4;
    private int numberfinal5;
    private int numberfinal6;
    private int numberfinal7;
    private String numberfinal8;
    private int numberfinal9;
    private int numberfinal10;
    private String numberfinal11;
    private int numberfinal12;
    private int numberfinal13;
    private int numberfinal14;
    private String numberfinal15;
    private int numberfinal16;
    private int numberfinal17;
    private int numberfinal18;
    private int numberfinal19;
    private int numberfinal20;
    private int numberfinal21;
    private int numberfinal22;
    private int numberfinal23;
    private int numberfinal24;
    private int numberfinal25;
    private int numberfinal26;
    private int numberfinal27;
    private int numberfinal28;
    private int numberfinal29;
    private int numberfinal30;
    private int numberfinal31;
    private String numberfinal32;
    private int numberfinal33;
    private int numberfinal34;
    private int numberfinal35;
    private int numberfinal36;
    private int numberfinal37;
    private int numberfinal38;
    private int numberfinal39;
    private int numberfinal40;
    private int numberfinal41;
    private int numberfinal42;

    @BindView(R.id.Examen1) ImageView Examen1;
    @BindView(R.id.Examen2) ImageView Examen2;
    @BindView(R.id.Examen3) ImageView Examen3;
    @BindView(R.id.Examen4) ImageView Examen4;
    @BindView(R.id.Examen5) ImageView Examen5;
    @BindView(R.id.Examen6) ImageView Examen6;
    @BindView(R.id.Examen7) ImageView Examen7;
    @BindView(R.id.Examen8) ImageView Examen8;
    @BindView(R.id.Examen9) ImageView Examen9;
    @BindView(R.id.Examen10) ImageView Examen10;

    @BindView(R.id.editText) EditText editText;
    @BindView(R.id.editText2) EditText editText2;
    @BindView(R.id.editText3) EditText editText3;
    @BindView(R.id.editText4) EditText editText4;
    @BindView(R.id.editText5) EditText editText5;
    @BindView(R.id.editText6) EditText editText6;
    @BindView(R.id.editText7) EditText editText7;
    @BindView(R.id.editText8) EditText editText8;
    @BindView(R.id.editText9) EditText editText9;
    @BindView(R.id.editText10) EditText editText10;
    @BindView(R.id.editText11) EditText editText11;
    @BindView(R.id.editText12) EditText editText12;
    @BindView(R.id.editText13) EditText editText13;
    @BindView(R.id.editText14) EditText editText14;
    @BindView(R.id.editText15) EditText editText15;
    @BindView(R.id.editText16) EditText editText16;
    @BindView(R.id.editText17) EditText editText17;
    @BindView(R.id.editText18) EditText editText18;
    @BindView(R.id.editText19) EditText editText19;
    @BindView(R.id.editText20) EditText editText20;
    @BindView(R.id.editText21) EditText editText21;
    @BindView(R.id.editText22) EditText editText22;
    @BindView(R.id.editText23) EditText editText23;
    @BindView(R.id.editText24) EditText editText24;
    @BindView(R.id.editText25) EditText editText25;
    @BindView(R.id.editText26) EditText editText26;
    @BindView(R.id.editText27) EditText editText27;
    @BindView(R.id.editText28) EditText editText28;
    @BindView(R.id.editText29) EditText editText29;
    @BindView(R.id.editText30) EditText editText30;
    @BindView(R.id.editText31) EditText editText31;
    @BindView(R.id.editText32) EditText editText32;
    @BindView(R.id.editText33) EditText editText33;
    @BindView(R.id.editText34) EditText editText34;
    @BindView(R.id.editText35) EditText editText35;
    @BindView(R.id.editText36) EditText editText36;
    @BindView(R.id.editText37) EditText editText37;
    @BindView(R.id.editText38) EditText editText38;
    @BindView(R.id.editText39) EditText editText39;
    @BindView(R.id.editText40) EditText editText40;
    @BindView(R.id.editText41) EditText editText41;
    @BindView(R.id.editText42) EditText editText42;

    @BindView(R.id.tvResult) TextView result;
    @BindView(R.id.constante) TextView constante;
    @BindView(R.id.constante2) TextView constante2;
    @BindView(R.id.proporcionalidad) TextView proporcionalidad;
    @BindView(R.id.proporcionalidad2) TextView proporcionalidad2;
    @BindView(R.id.proporcionalidad3) TextView proporcionalidad3;
    @BindView(R.id.decreciente_creciente) TextView decreciente_creciente;
    @BindView(R.id.decreciente_creciente2) TextView decreciente_creciente2;
    @BindView(R.id.decreciente_creciente3) TextView decreciente_creciente3;
    @BindView(R.id.decreciente_creciente4) TextView decreciente_creciente4;
    @BindView(R.id.afines) TextView afines;
    @BindView(R.id.parabola)TextView parabola;
    @BindView(R.id.parabola2)TextView parabola2;
    @BindView(R.id.vertice)TextView vertice;
    @BindView(R.id.vertice2)TextView vertice2;
    @BindView(R.id.rama_izquierda)TextView rama_izquierda;
    @BindView(R.id.rama_derecha)TextView rama_derecha;
    @BindView(R.id.rama_izquierda2)TextView rama_izquierda2;
    @BindView(R.id.rama_derecha2)TextView rama_derecha2;
    @BindView(R.id.rama_izquierda3)TextView rama_izquierda3;
    @BindView(R.id.rama_derecha3)TextView rama_derecha3;
    @BindView(R.id.rama_izquierda4)TextView rama_izquierda4;
    @BindView(R.id.rama_derecha4)TextView rama_derecha4;
    @BindView(R.id.hiperbola)TextView hiperbola;
    @BindView(R.id.hiperbola2)TextView hiperbola2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        bar = getSupportActionBar();

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(ExamenActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ExamenActivity.this, YoutubeExActivity.class);
                startActivity(intent);
            }
        });

        Examen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen1);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen2);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen3);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen4);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen5);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen6);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen7);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen8);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen9);
                ExamenActivity.this.startActivity(intent);
            }
        });

        Examen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamenActivity.this, ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen10);
                ExamenActivity.this.startActivity(intent);
            }
        });
    }

    public void submit(View v){
        scoreTotal = 0;
        number = editText.getText().toString();
        number2 = editText2.getText().toString();
        number3 = editText3.getText().toString();
        number4 = editText4.getText().toString();
        number5 = editText5.getText().toString();
        number6 = editText6.getText().toString();
        number7 = editText7.getText().toString();
        number8 = editText8.getText().toString();
        number9 = editText9.getText().toString();
        number10 = editText10.getText().toString();
        number11 = editText11.getText().toString();
        number12 = editText12.getText().toString();
        number13 = editText13.getText().toString();
        number14 = editText14.getText().toString();
        number15 = editText15.getText().toString();
        number16 = editText16.getText().toString();
        number17 = editText17.getText().toString();
        number18 = editText18.getText().toString();
        number19 = editText19.getText().toString();
        number20 = editText20.getText().toString();
        number21 = editText21.getText().toString();
        number22 = editText22.getText().toString();
        number23 = editText23.getText().toString();
        number24 = editText24.getText().toString();
        number25 = editText25.getText().toString();
        number26 = editText26.getText().toString();
        number27 = editText27.getText().toString();
        number28 = editText28.getText().toString();
        number29 = editText29.getText().toString();
        number30 = editText30.getText().toString();
        number31 = editText31.getText().toString();
        number32 = editText32.getText().toString();
        number33 = editText33.getText().toString();
        number34 = editText34.getText().toString();
        number35 = editText35.getText().toString();
        number36 = editText36.getText().toString();
        number37 = editText37.getText().toString();
        number38 = editText38.getText().toString();
        number39 = editText39.getText().toString();
        number40 = editText40.getText().toString();
        number41 = editText41.getText().toString();
        number42 = editText42.getText().toString();
        if (number.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty() || number5.isEmpty() ||
                number6.isEmpty() || number7.isEmpty() || number8.isEmpty() || number9.isEmpty()
                ||number10.isEmpty() || number11.isEmpty() || number12.isEmpty() || number13.isEmpty()||
                number15.isEmpty() || number16.isEmpty() || number17.isEmpty() || number18.isEmpty() ||
                number19.isEmpty() || number20.isEmpty() || number21.isEmpty() || number22.isEmpty()||
                number23.isEmpty() || number24.isEmpty() || number25.isEmpty() || number26.isEmpty() ||
                number27.isEmpty() || number28.isEmpty() || number29.isEmpty() || number30.isEmpty() ||
                number31.isEmpty() || number32.isEmpty() || number33.isEmpty() || number34.isEmpty() ||
                number35.isEmpty() || number36.isEmpty() || number37.isEmpty() || number38.isEmpty() ||
                number39.isEmpty() || number40.isEmpty() || number41.isEmpty() || number42.isEmpty()) {
            result.setText(R.string.put_number);
            result.setTextColor(getResources().getColor(R.color.black));
        } else {
            String crecent = ">";
            String decrecent = "<";
            numberfinal = Integer.parseInt(number);
            numberfinal2 = Integer.parseInt(number2);
            numberfinal3 = Integer.parseInt(number3);
            numberfinal4 = Integer.parseInt(number4);
            numberfinal5 = Integer.parseInt(number5);
            numberfinal6 = Integer.parseInt(number6);
            numberfinal7 = Integer.parseInt(number7);
            numberfinal8 = editText8.getText().toString();
            numberfinal9 = Integer.parseInt(number9);
            numberfinal10 = Integer.parseInt(number10);
            numberfinal11 = editText11.getText().toString();
            numberfinal12 = Integer.parseInt(number12);
            numberfinal13 = Integer.parseInt(number13);
            numberfinal14 = Integer.parseInt(number14);
            numberfinal15 = editText15.getText().toString();
            numberfinal16 = Integer.parseInt(number16);
            numberfinal17 = Integer.parseInt(number17);
            numberfinal18 = Integer.parseInt(number18);
            numberfinal19 = Integer.parseInt(number19);
            numberfinal20 = Integer.parseInt(number20);
            numberfinal21 = Integer.parseInt(number21);
            numberfinal22 = Integer.parseInt(number22);
            numberfinal23 = Integer.parseInt(number23);
            numberfinal24 = Integer.parseInt(number24);
            numberfinal25 = Integer.parseInt(number25);
            numberfinal26 = Integer.parseInt(number26);
            numberfinal27 = Integer.parseInt(number27);
            numberfinal28 = Integer.parseInt(number28);
            numberfinal29 = Integer.parseInt(number29);
            numberfinal30 = Integer.parseInt(number30);
            numberfinal31 = Integer.parseInt(number31);
            numberfinal32 = editText32.getText().toString();
            numberfinal33 = Integer.parseInt(number33);
            numberfinal34 = Integer.parseInt(number34);
            numberfinal35 = Integer.parseInt(number35);
            numberfinal36 = Integer.parseInt(number36);
            numberfinal37 = Integer.parseInt(number37);
            numberfinal38 = Integer.parseInt(number38);
            numberfinal39 = Integer.parseInt(number39);
            numberfinal40 = Integer.parseInt(number40);
            numberfinal41 = Integer.parseInt(number41);
            numberfinal42 = Integer.parseInt(number42);

            //Exercice 1
            if(numberfinal == 0){
                scoreTotal += 0.33;
                editText.setTextColor(getResources().getColor(R.color.black));
                constante.setText(R.string.Subtitle_main);
            }else{
                scoreTotal += 0;
                constante.setText(R.string.vacio);
                editText.setTextColor(getResources().getColor(R.color.red));

            }

            if(numberfinal2 == 0 ){
                scoreTotal += 0.33;
                editText2.setTextColor(getResources().getColor(R.color.black));
                constante.setText(R.string.Subtitle_main);
            }else{
                scoreTotal += 0;
                editText2.setTextColor(getResources().getColor(R.color.red));
                constante.setText(R.string.vacio);

            }

            if(numberfinal3 == 0 ){
                scoreTotal += 0.34;
                editText3.setTextColor(getResources().getColor(R.color.black));
                constante.setText(R.string.Subtitle_main);
            }else{
                scoreTotal += 0;
                editText3.setTextColor(getResources().getColor(R.color.red));
                constante.setText(R.string.vacio);
            }

            //Exercice 2
            if(numberfinal4 == 7){
                scoreTotal += 0.2;
                editText4.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad.setText(R.string.Subtitle2_main);
                decreciente_creciente.setText(R.string.crescent);
            }else{
                scoreTotal += 0;
                editText4.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad.setText(R.string.vacio);
                decreciente_creciente.setText(R.string.vacio);
            }
            if(numberfinal5 == 4){
                scoreTotal += 0.2;
                editText5.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad.setText(R.string.Subtitle2_main);
                decreciente_creciente.setText(R.string.crescent);
            }else{
                scoreTotal += 0;
                editText5.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad.setText(R.string.vacio);
                decreciente_creciente.setText(R.string.vacio);
            }

            if(numberfinal6 == 7){
                scoreTotal += 0.2;
                editText6.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad.setText(R.string.Subtitle2_main);
                decreciente_creciente.setText(R.string.crescent);
            }else{
                scoreTotal += 0;
                editText6.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad.setText(R.string.vacio);
                decreciente_creciente.setText(R.string.vacio);
            }

            if(numberfinal7 == 4){
                scoreTotal += 0.2;
                editText7.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad.setText(R.string.Subtitle2_main);
                decreciente_creciente.setText(R.string.crescent);;
            }else{
                scoreTotal += 0;
                editText7.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad.setText(R.string.vacio);
                decreciente_creciente.setText(R.string.vacio);
            }

            if(numberfinal8.equals(crecent)){
                scoreTotal += 0.2;
                editText8.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad.setText(R.string.Subtitle2_main);
                decreciente_creciente.setText(R.string.crescent);
            }else{
                scoreTotal += 0;
                editText8.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad.setText(R.string.vacio);
                decreciente_creciente.setText(R.string.vacio);
            }

            //Exercice 3
            if(numberfinal9 == -3 ){
                scoreTotal += 0.34;
                editText9.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad2.setText(R.string.Subtitle2_main);
            }else{
                scoreTotal += 0;
                editText9.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad2.setText(R.string.vacio);
            }

            if(numberfinal10 == -3 ){
                scoreTotal += 0.33;
                editText10.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad2.setText(R.string.Subtitle2_main);
            }else{
                scoreTotal += 0;
                editText10.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad2.setText(R.string.vacio);
            }

            if(numberfinal11.equals(decrecent)){
                scoreTotal += 0.33;
                editText11.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad2.setText(R.string.Subtitle2_main);
            }else{
                scoreTotal += 0;
                editText11.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad2.setText(R.string.vacio);
            }
            //Exercice 4
            if(numberfinal12 == -1){
                scoreTotal += 0.2;
                editText12.setTextColor(getResources().getColor(R.color.black));
                afines.setText(R.string.Subtitle2_2_main);
                decreciente_creciente2.setText(R.string.decrease);
                decreciente_creciente3.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText12.setTextColor(getResources().getColor(R.color.red));
                afines.setText(R.string.vacio);
                decreciente_creciente2.setText(R.string.vacio);
                decreciente_creciente3.setText(R.string.vacio);
            }

            if( numberfinal13 == 1){
                scoreTotal += 0.2;
                editText13.setTextColor(getResources().getColor(R.color.black));
                afines.setText(R.string.Subtitle2_2_main);
                decreciente_creciente2.setText(R.string.decrease);
                decreciente_creciente3.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText13.setTextColor(getResources().getColor(R.color.red));
                afines.setText(R.string.vacio);
                decreciente_creciente2.setText(R.string.vacio);
                decreciente_creciente3.setText(R.string.vacio);
            }

            if( numberfinal14 == -1 ){
                scoreTotal += 0.2;
                editText14.setTextColor(getResources().getColor(R.color.black));
                afines.setText(R.string.Subtitle2_2_main);
                decreciente_creciente2.setText(R.string.decrease);
                decreciente_creciente3.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText14.setTextColor(getResources().getColor(R.color.red));
                afines.setText(R.string.vacio);
                decreciente_creciente2.setText(R.string.vacio);
                decreciente_creciente3.setText(R.string.vacio);
            }

            if( numberfinal15.equals(decrecent) ){
                scoreTotal += 0.2;
                editText15.setTextColor(getResources().getColor(R.color.black));
                afines.setText(R.string.Subtitle2_2_main);
                decreciente_creciente2.setText(R.string.decrease);
                decreciente_creciente3.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText15.setTextColor(getResources().getColor(R.color.red));
                afines.setText(R.string.vacio);
                decreciente_creciente2.setText(R.string.vacio);
                decreciente_creciente3.setText(R.string.vacio);
            }

            if(numberfinal16 == 1){
                scoreTotal += 0.2;
                editText16.setTextColor(getResources().getColor(R.color.black));
                afines.setText(R.string.Subtitle2_2_main);
                decreciente_creciente2.setText(R.string.decrease);
                decreciente_creciente3.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText16.setTextColor(getResources().getColor(R.color.red));
                afines.setText(R.string.vacio);
                decreciente_creciente2.setText(R.string.vacio);
                decreciente_creciente3.setText(R.string.vacio);
            }
                //Exercice 5
            if(numberfinal17 == 2){
                scoreTotal += 0.17;
                editText17.setTextColor(getResources().getColor(R.color.black));
                parabola.setText(R.string.Subtitle_main3);
                vertice.setText(R.string.vertice_max);
                rama_izquierda.setText(R.string.crescent_left);
                rama_derecha.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText17.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            if(numberfinal18 == 8){
                scoreTotal += 0.17;
                editText18.setTextColor(getResources().getColor(R.color.black));
                parabola.setText(R.string.Subtitle_main3);
                vertice.setText(R.string.vertice_min);
                rama_izquierda.setText(R.string.crescent_left);
                rama_derecha.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText18.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            if(numberfinal19 == 8){
                scoreTotal += 0.16;
                editText19.setTextColor(getResources().getColor(R.color.black));
                parabola.setText(R.string.Subtitle_main3);
                vertice.setText(R.string.vertice_min);
                rama_izquierda.setText(R.string.crescent_left);
                rama_derecha.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText19.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            if(numberfinal20 == -3){
                scoreTotal += 0.17;
                editText20.setTextColor(getResources().getColor(R.color.black));
                parabola.setText(R.string.Subtitle_main3);
                vertice.setText(R.string.vertice_min);
                rama_izquierda.setText(R.string.crescent_left);
                rama_derecha.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText20.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            if(numberfinal21 == 5){
                scoreTotal += 0.16;
                editText21.setTextColor(getResources().getColor(R.color.black));
                parabola.setText(R.string.Subtitle_main3);
                vertice.setText(R.string.vertice_min);
                rama_izquierda.setText(R.string.crescent_left);
                rama_derecha.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText21.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            if(numberfinal22 == -3){
                scoreTotal += 0.17;
                editText22.setTextColor(getResources().getColor(R.color.black));
                parabola.setText(R.string.Subtitle_main3);
                vertice.setText(R.string.vertice_min);
                rama_izquierda.setText(R.string.crescent_left);
                rama_derecha.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText22.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            //Exercice 6
            if(numberfinal23 == 2){
                scoreTotal += 0.25;
                editText23.setTextColor(getResources().getColor(R.color.black));
                hiperbola.setText(R.string.subtitle_main4);
                rama_izquierda2.setText(R.string.decrease_left);
                rama_derecha2.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText23.setTextColor(getResources().getColor(R.color.red));
                hiperbola.setText(R.string.vacio);
                rama_izquierda2.setText(R.string.vacio);
                rama_derecha2.setText(R.string.vacio);
            }

            if(numberfinal24 == -3 ){
                scoreTotal += 0.25;
                editText24.setTextColor(getResources().getColor(R.color.black));
                hiperbola.setText(R.string.subtitle_main4);
                rama_izquierda2.setText(R.string.decrease_left);
                rama_derecha2.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText24.setTextColor(getResources().getColor(R.color.red));
                hiperbola.setText(R.string.vacio);
                rama_izquierda2.setText(R.string.vacio);
                rama_derecha2.setText(R.string.vacio);
            }

            if(numberfinal25 == 2){
                scoreTotal += 0.25;
                editText25.setTextColor(getResources().getColor(R.color.black));
                hiperbola.setText(R.string.subtitle_main4);
                rama_izquierda2.setText(R.string.decrease_left);
                rama_derecha2.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText25.setTextColor(getResources().getColor(R.color.red));
                parabola.setText(R.string.vacio);
                vertice.setText(R.string.vacio);
                rama_izquierda.setText(R.string.vacio);
                rama_derecha.setText(R.string.vacio);
            }

            if(numberfinal26 == 3){
                scoreTotal += 0.25;
                editText26.setTextColor(getResources().getColor(R.color.black));
                hiperbola.setText(R.string.subtitle_main4);
                rama_izquierda2.setText(R.string.decrease_left);
                rama_derecha2.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText26.setTextColor(getResources().getColor(R.color.red));
                hiperbola.setText(R.string.vacio);
                rama_izquierda2.setText(R.string.vacio);
                rama_derecha2.setText(R.string.vacio);
            }
            //Exercice 7
            if(numberfinal27 == -2){
                scoreTotal += 0.34;
                editText27.setTextColor(getResources().getColor(R.color.black));
                constante2.setText(R.string.Subtitle_main);
            }else{
                scoreTotal += 0;
                editText27.setTextColor(getResources().getColor(R.color.red));
                constante2.setText(R.string.vacio);
            }

            if(numberfinal28 == 0){
                scoreTotal += 0.33;
                editText28.setTextColor(getResources().getColor(R.color.black));
                constante2.setText(R.string.Subtitle_main);
            }else{
                scoreTotal += 0;
                editText28.setTextColor(getResources().getColor(R.color.red));
                constante2.setText(R.string.vacio);
            }

            if(numberfinal29 == 0){
                scoreTotal += 0.33;
                editText29.setTextColor(getResources().getColor(R.color.black));
                constante2.setText(R.string.Subtitle_main);
            }else{
                scoreTotal += 0;
                editText29.setTextColor(getResources().getColor(R.color.red));
                constante2.setText(R.string.vacio);
            }
            //Exercice 8
            if(numberfinal30 == -5 ){
                scoreTotal += 0.34;
                editText30.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad3.setText(R.string.Subtitle2_main);
                decreciente_creciente4.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText30.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad3.setText(R.string.vacio);
                decreciente_creciente4.setText(R.string.vacio);
            }
            if(numberfinal31 == -5){
                scoreTotal += 0.33;
                editText31.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad3.setText(R.string.Subtitle2_main);
                decreciente_creciente4.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText31.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad3.setText(R.string.vacio);
                decreciente_creciente4.setText(R.string.vacio);
            }

            if(numberfinal32.equals(decrecent)){
                scoreTotal += 0.33;
                editText32.setTextColor(getResources().getColor(R.color.black));
                proporcionalidad3.setText(R.string.Subtitle2_main);
                decreciente_creciente4.setText(R.string.decrease);
            }else{
                scoreTotal += 0;
                editText32.setTextColor(getResources().getColor(R.color.red));
                proporcionalidad3.setText(R.string.vacio);
                decreciente_creciente4.setText(R.string.vacio);
            }
            //Exercice 9
            if(numberfinal33 == -1){
                scoreTotal += 0.17;
                editText33.setTextColor(getResources().getColor(R.color.black));
                parabola2.setText(R.string.Subtitle_main3);
                vertice2.setText(R.string.vertice_max);
                rama_izquierda3.setText(R.string.crescent_left);
                rama_derecha3.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText33.setTextColor(getResources().getColor(R.color.red));
                parabola2.setText(R.string.vacio);
                vertice2.setText(R.string.vacio);
                rama_izquierda3.setText(R.string.vacio);
                rama_derecha3.setText(R.string.vacio);
            }
            if(numberfinal34 == -10){
                scoreTotal += 0.17;
                editText34.setTextColor(getResources().getColor(R.color.black));
                parabola2.setText(R.string.Subtitle_main3);
                vertice2.setText(R.string.vertice_max);
                rama_izquierda3.setText(R.string.crescent_left);
                rama_derecha3.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText34.setTextColor(getResources().getColor(R.color.red));
                parabola2.setText(R.string.vacio);
                vertice2.setText(R.string.vacio);
                rama_izquierda3.setText(R.string.vacio);
                rama_derecha3.setText(R.string.vacio);
            }
            if(numberfinal35 == -25){
                scoreTotal += 0.17;
                editText35.setTextColor(getResources().getColor(R.color.black));
                parabola2.setText(R.string.Subtitle_main3);
                vertice2.setText(R.string.vertice_max);
                rama_izquierda3.setText(R.string.crescent_left);
                rama_derecha3.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText35.setTextColor(getResources().getColor(R.color.red));
                parabola2.setText(R.string.vacio);
                vertice2.setText(R.string.vacio);
                rama_izquierda3.setText(R.string.vacio);
                rama_derecha3.setText(R.string.vacio);
            }

            if(numberfinal36 == -5 ){
                scoreTotal += 0.16;
                editText36.setTextColor(getResources().getColor(R.color.black));
                parabola2.setText(R.string.Subtitle_main3);
                vertice2.setText(R.string.vertice_max);
                rama_izquierda3.setText(R.string.crescent_left);
                rama_derecha3.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText36.setTextColor(getResources().getColor(R.color.red));
                parabola2.setText(R.string.vacio);
                vertice2.setText(R.string.vacio);
                rama_izquierda3.setText(R.string.vacio);
                rama_derecha3.setText(R.string.vacio);
            }

            if(numberfinal37 == 0){
                scoreTotal += 0.17;
                editText37.setTextColor(getResources().getColor(R.color.black));
                parabola2.setText(R.string.Subtitle_main3);
                vertice2.setText(R.string.vertice_max);
                rama_izquierda3.setText(R.string.crescent_left);
                rama_derecha3.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText37.setTextColor(getResources().getColor(R.color.red));
                parabola2.setText(R.string.vacio);
                vertice2.setText(R.string.vacio);
                rama_izquierda3.setText(R.string.vacio);
                rama_derecha3.setText(R.string.vacio);
            }

            if(numberfinal38 == -5){
                scoreTotal += 0.16;
                editText38.setTextColor(getResources().getColor(R.color.black));
                parabola2.setText(R.string.Subtitle_main3);
                vertice2.setText(R.string.vertice_max);
                rama_izquierda3.setText(R.string.crescent_left);
                rama_derecha3.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText38.setTextColor(getResources().getColor(R.color.red));
                parabola2.setText(R.string.vacio);
                vertice2.setText(R.string.vacio);
                rama_izquierda3.setText(R.string.vacio);
                rama_derecha3.setText(R.string.vacio);
            }
            //Exercice 10
            if(numberfinal39 == 3 ){
                scoreTotal += 0.25;
                editText39.setTextColor(getResources().getColor(R.color.black));
                hiperbola2.setText(R.string.subtitle_main4);
                rama_izquierda4.setText(R.string.decrease_left);
                rama_derecha4.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText39.setTextColor(getResources().getColor(R.color.red));
                hiperbola2.setText(R.string.vacio);
                rama_izquierda4.setText(R.string.vacio);
                rama_derecha4.setText(R.string.vacio);
            }

            if(numberfinal40 == -4){
                scoreTotal += 0.25;
                editText40.setTextColor(getResources().getColor(R.color.black));
                hiperbola2.setText(R.string.subtitle_main4);
                rama_izquierda4.setText(R.string.decrease_left);
                rama_derecha4.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText40.setTextColor(getResources().getColor(R.color.red));
                hiperbola2.setText(R.string.vacio);
                rama_izquierda4.setText(R.string.vacio);
                rama_derecha4.setText(R.string.vacio);
            }

            if(numberfinal41 == -4){
                scoreTotal += 0.25;
                editText41.setTextColor(getResources().getColor(R.color.black));
                hiperbola2.setText(R.string.subtitle_main4);
                rama_izquierda4.setText(R.string.decrease_left);
                rama_derecha4.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText41.setTextColor(getResources().getColor(R.color.red));
                hiperbola2.setText(R.string.vacio);
                rama_izquierda4.setText(R.string.vacio);
                rama_derecha4.setText(R.string.vacio);
            }

            if(numberfinal42 == 0){
                scoreTotal += 0.25;
                editText42.setTextColor(getResources().getColor(R.color.black));
                hiperbola2.setText(R.string.subtitle_main4);
                rama_izquierda4.setText(R.string.decrease_left);
                rama_derecha4.setText(R.string.decrease_right);
            }else{
                scoreTotal += 0;
                editText42.setTextColor(getResources().getColor(R.color.red));
                hiperbola2.setText(R.string.vacio);
                rama_izquierda4.setText(R.string.vacio);
                rama_derecha4.setText(R.string.vacio);
            }


            result.setText( String.valueOf(scoreTotal));
            result.setTextColor(getResources().getColor(R.color.red));

        }
    }
}
