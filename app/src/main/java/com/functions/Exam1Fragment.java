/*
 * Created by Isabel Maniega on 27/07/18 10:56
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 27/07/18 10:56
 */

package com.functions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Exam1Fragment extends  Fragment {

    float scoreTotal;
    float scoreOne;
    float scoreTwo;
    float scoreThree;
    float scoreFour;
    float scoreFive;

    @BindView(R.id.submitOne) Button SubmitOne;
    @BindView(R.id.submitTwo) Button SubmitTwo;
    @BindView(R.id.submitThree) Button SubmitThree;
    @BindView(R.id.submitFour) Button SubmitFour;
    @BindView(R.id.submitFive) Button SubmitFive;

    @BindView(R.id.tvResultOne) TextView resultOne;
    @BindView(R.id.tvResultTwo) TextView resultTwo;
    @BindView(R.id.tvResultThree) TextView resultThree;
    @BindView(R.id.tvResultFour) TextView resultFour;
    @BindView(R.id.tvResultFive) TextView resultFive;

    @BindView(R.id.Examen1) ImageView Examen1;
    @BindView(R.id.Examen2) ImageView Examen2;
    @BindView(R.id.Examen3) ImageView Examen3;
    @BindView(R.id.Examen4) ImageView Examen4;
    @BindView(R.id.Examen5) ImageView Examen5;


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


    @BindView(R.id.constante) TextView constante;
    @BindView(R.id.proporcionalidad) TextView proporcionalidad;
    @BindView(R.id.proporcionalidad2) TextView proporcionalidad2;
    @BindView(R.id.decreciente_creciente) TextView decreciente_creciente;
    @BindView(R.id.decreciente_creciente2) TextView decreciente_creciente2;
    @BindView(R.id.decreciente_creciente3) TextView decreciente_creciente3;
    @BindView(R.id.afines) TextView afines;
    @BindView(R.id.parabola)TextView parabola;
    @BindView(R.id.vertice)TextView vertice;
    @BindView(R.id.rama_izquierda)TextView rama_izquierda;
    @BindView(R.id.rama_derecha)TextView rama_derecha;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.content_exam1, container, false);
            ButterKnife.bind(this, rootView);

            scoreTotal = 0;

        Picasso.get().load(R.drawable.examen1).fit().into(Examen1);
        Examen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen1);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen2).fit().into(Examen2);
        Examen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen2);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen3).fit().into(Examen3);
        Examen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen3);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen4).fit().into(Examen4);
        Examen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen4);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen5).fit().into(Examen5);
        Examen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen5);
                startActivity(intent);
            }
        });

        //Exercice 1
        SubmitOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreOne = 0;
                String number = editText.getText().toString();
                String number2 = editText2.getText().toString();
                String number3 = editText3.getText().toString();
                if (number.isEmpty() || number2.isEmpty() || number3.isEmpty()) {
                    Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                } else {
                    try{
                        int numberfinal = Integer.parseInt(number);
                        int numberfinal2 = Integer.parseInt(number2);
                        int numberfinal3 = Integer.parseInt(number3);

                        if(numberfinal == 0){
                            scoreOne += 6.6;
                            editText.setTextColor(getResources().getColor(R.color.black));
                            constante.setText(R.string.Subtitle_main);
                        }else{
                            scoreOne += 0;
                            constante.setText(R.string.vacio);
                            editText.setTextColor(getResources().getColor(R.color.red));
                        }

                        if(numberfinal2 == 0){
                            scoreOne += 6.6;
                            editText2.setTextColor(getResources().getColor(R.color.black));
                            constante.setText(R.string.Subtitle_main);
                        }else{
                            scoreOne += 0;
                            editText2.setTextColor(getResources().getColor(R.color.red));
                            constante.setText(R.string.vacio);
                        }

                        if(numberfinal3 == 0){
                            scoreOne += 6.8;
                            editText3.setTextColor(getResources().getColor(R.color.black));
                            constante.setText(R.string.Subtitle_main);
                        }else{
                            scoreOne += 0;
                            editText3.setTextColor(getResources().getColor(R.color.red));
                            constante.setText(R.string.vacio);
                        }

                        resultOne.setText( String.valueOf(scoreOne));
                        resultOne.setTextColor(getResources().getColor(R.color.red));
                        scoreTotal = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive;
                        Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();

                    } catch (NumberFormatException nfe){
                        Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                        editText.setText(R.string.vacio);
                        editText2.setText(R.string.vacio);
                        editText3.setText(R.string.vacio);
                        constante.setText(R.string.vacio);
                        resultOne.setText(R.string.vacio);
                    }
                }

            }
        });
            //Exercice 2
            SubmitTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    scoreTwo = 0;
                    String number4 = editText4.getText().toString();
                    String number5 = editText5.getText().toString();
                    String number6 = editText6.getText().toString();
                    String number7 = editText7.getText().toString();
                    String number8 = editText8.getText().toString();

                    if (number4.isEmpty() || number5.isEmpty() ||
                            number6.isEmpty() || number7.isEmpty() || number8.isEmpty()) {
                        Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            String crecent = ">";
                            int numberfinal4 = Integer.parseInt(number4);
                            int numberfinal5 = Integer.parseInt(number5);
                            int numberfinal6 = Integer.parseInt(number6);
                            int numberfinal7 = Integer.parseInt(number7);
                            String numberfinal8 = editText8.getText().toString();

                            if(numberfinal4 == 7){
                                scoreTwo += 4;
                                editText4.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad.setText(R.string.Subtitle2_main);
                                decreciente_creciente.setText(R.string.crescent);
                            }else{
                                scoreTwo += 0;
                                editText4.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad.setText(R.string.vacio);
                                decreciente_creciente.setText(R.string.vacio);
                            }
                            if(numberfinal5 == 4){
                                scoreTwo += 4;
                                editText5.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad.setText(R.string.Subtitle2_main);
                                decreciente_creciente.setText(R.string.crescent);
                            }else{
                                scoreTwo += 0;
                                editText5.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad.setText(R.string.vacio);
                                decreciente_creciente.setText(R.string.vacio);
                            }

                            if(numberfinal6 == 7){
                                scoreTwo += 4;
                                editText6.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad.setText(R.string.Subtitle2_main);
                                decreciente_creciente.setText(R.string.crescent);
                            }else{
                                scoreTwo += 0;
                                editText6.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad.setText(R.string.vacio);
                                decreciente_creciente.setText(R.string.vacio);
                            }

                            if(numberfinal7 == 4){
                                scoreTwo += 4;
                                editText7.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad.setText(R.string.Subtitle2_main);
                                decreciente_creciente.setText(R.string.crescent);
                            }else{
                                scoreTwo += 0;
                                editText7.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad.setText(R.string.vacio);
                                decreciente_creciente.setText(R.string.vacio);
                            }

                            if(numberfinal8.equals(crecent)){
                                scoreTwo += 4;
                                editText8.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad.setText(R.string.Subtitle2_main);
                                decreciente_creciente.setText(R.string.crescent);
                            }else{
                                scoreTwo += 0;
                                editText8.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad.setText(R.string.vacio);
                                decreciente_creciente.setText(R.string.vacio);
                            }
                            resultTwo.setText(String.valueOf(scoreTwo));
                            resultTwo.setTextColor(getResources().getColor(R.color.red));

                            scoreTotal = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive;
                            Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                        } catch (NumberFormatException nfe){
                            Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                            editText4.setText(R.string.vacio);
                            editText5.setText(R.string.vacio);
                            editText6.setText(R.string.vacio);
                            editText7.setText(R.string.vacio);
                            editText8.setText(R.string.vacio);
                            proporcionalidad.setText(R.string.vacio);
                            decreciente_creciente.setText(R.string.vacio);
                            resultTwo.setText(R.string.vacio);
                        }
                    }
                }
            });
            //Exercice 3
            SubmitThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    scoreThree = 0;
                    String number9 = editText9.getText().toString();
                    String number10 = editText10.getText().toString();
                    String number11 = editText11.getText().toString();

                    if ( number9.isEmpty() || number10.isEmpty() || number11.isEmpty()) {
                        Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            String decrecent = "<";
                            int numberfinal9 = Integer.parseInt(number9);
                            int numberfinal10 = Integer.parseInt(number10);
                            String numberfinal11 = editText11.getText().toString();

                            if(numberfinal9 == -3 ){
                                scoreThree += 6.8;
                                editText9.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad2.setText(R.string.Subtitle2_main);
                            }else{
                                scoreThree += 0;
                                editText9.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad2.setText(R.string.vacio);
                            }

                            if(numberfinal10 == -3 ){
                                scoreThree += 6.6;
                                editText10.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad2.setText(R.string.Subtitle2_main);
                            }else{
                                scoreThree += 0;
                                editText10.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad2.setText(R.string.vacio);
                            }

                            if(numberfinal11.equals(decrecent)){
                                scoreThree += 6.6;
                                editText11.setTextColor(getResources().getColor(R.color.black));
                                proporcionalidad2.setText(R.string.Subtitle2_main);
                            }else{
                                scoreThree += 0;
                                editText11.setTextColor(getResources().getColor(R.color.red));
                                proporcionalidad2.setText(R.string.vacio);
                            }
                            resultThree.setText( String.valueOf(scoreThree));
                            resultThree.setTextColor(getResources().getColor(R.color.red));

                            scoreTotal = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive;
                            Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                        } catch (NumberFormatException nfe){
                            Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                            editText9.setText(R.string.vacio);
                            editText10.setText(R.string.vacio);
                            editText11.setText(R.string.vacio);
                            proporcionalidad2.setText(R.string.vacio);
                            resultThree.setText(R.string.vacio);
                        }
                    }
                }
            });
            //Exercice 4
            SubmitFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    scoreFour = 0;
                    String number12 = editText12.getText().toString();
                    String number13 = editText13.getText().toString();
                    String number14 = editText14.getText().toString();
                    String number15 = editText15.getText().toString();
                    String number16 = editText16.getText().toString();
                    if ( number12.isEmpty() || number13.isEmpty()|| number15.isEmpty() || number16.isEmpty()) {
                        Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            String decrecent = "<";
                            int numberfinal12 = Integer.parseInt(number12);
                            int numberfinal13 = Integer.parseInt(number13);
                            int numberfinal14 = Integer.parseInt(number14);
                            String numberfinal15 = editText15.getText().toString();
                            int numberfinal16 = Integer.parseInt(number16);

                            if(numberfinal12 == -1){
                                scoreFour += 4;
                                editText12.setTextColor(getResources().getColor(R.color.black));
                                afines.setText(R.string.Subtitle2_2_main);
                                decreciente_creciente2.setText(R.string.decrease);
                                decreciente_creciente3.setText(R.string.decrease);
                            }else{
                                scoreFour += 0;
                                editText12.setTextColor(getResources().getColor(R.color.red));
                                afines.setText(R.string.vacio);
                                decreciente_creciente2.setText(R.string.vacio);
                                decreciente_creciente3.setText(R.string.vacio);
                            }

                            if( numberfinal13 == 1){
                                scoreFour += 4;
                                editText13.setTextColor(getResources().getColor(R.color.black));
                                afines.setText(R.string.Subtitle2_2_main);
                                decreciente_creciente2.setText(R.string.decrease);
                                decreciente_creciente3.setText(R.string.decrease);
                            }else{
                                scoreFour += 0;
                                editText13.setTextColor(getResources().getColor(R.color.red));
                                afines.setText(R.string.vacio);
                                decreciente_creciente2.setText(R.string.vacio);
                                decreciente_creciente3.setText(R.string.vacio);
                            }

                            if( numberfinal14 == -1 ){
                                scoreFour += 4;
                                editText14.setTextColor(getResources().getColor(R.color.black));
                                afines.setText(R.string.Subtitle2_2_main);
                                decreciente_creciente2.setText(R.string.decrease);
                                decreciente_creciente3.setText(R.string.decrease);
                            }else{
                                scoreFour += 0;
                                editText14.setTextColor(getResources().getColor(R.color.red));
                                afines.setText(R.string.vacio);
                                decreciente_creciente2.setText(R.string.vacio);
                                decreciente_creciente3.setText(R.string.vacio);
                            }

                            if( numberfinal15.equals(decrecent) ){
                                scoreFour += 4;
                                editText15.setTextColor(getResources().getColor(R.color.black));
                                afines.setText(R.string.Subtitle2_2_main);
                                decreciente_creciente2.setText(R.string.decrease);
                                decreciente_creciente3.setText(R.string.decrease);
                            }else{
                                scoreFour += 0;
                                editText15.setTextColor(getResources().getColor(R.color.red));
                                afines.setText(R.string.vacio);
                                decreciente_creciente2.setText(R.string.vacio);
                                decreciente_creciente3.setText(R.string.vacio);
                            }

                            if(numberfinal16 == 1){
                                scoreFour += 4;
                                editText16.setTextColor(getResources().getColor(R.color.black));
                                afines.setText(R.string.Subtitle2_2_main);
                                decreciente_creciente2.setText(R.string.decrease);
                                decreciente_creciente3.setText(R.string.decrease);
                            }else{
                                scoreFour += 0;
                                editText16.setTextColor(getResources().getColor(R.color.red));
                                afines.setText(R.string.vacio);
                                decreciente_creciente2.setText(R.string.vacio);
                                decreciente_creciente3.setText(R.string.vacio);
                            }
                            resultFour.setText( String.valueOf(scoreFour));
                            resultFour.setTextColor(getResources().getColor(R.color.red));

                            scoreTotal = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive;
                            Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                        } catch (NumberFormatException nfe){
                            Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                            editText12.setText(R.string.vacio);
                            editText13.setText(R.string.vacio);
                            editText14.setText(R.string.vacio);
                            editText15.setText(R.string.vacio);
                            editText16.setText(R.string.vacio);
                            afines.setText(R.string.vacio);
                            decreciente_creciente2.setText(R.string.vacio);
                            decreciente_creciente3.setText(R.string.vacio);
                            resultFour.setText(R.string.vacio);
                        }
                    }
                }
            });

            //Exercice 5
            SubmitFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    scoreFive = 0;
                    String number17 = editText17.getText().toString();
                    String number18 = editText18.getText().toString();
                    String number19 = editText19.getText().toString();
                    String number20 = editText20.getText().toString();
                    String number21 = editText21.getText().toString();
                    String number22 = editText22.getText().toString();
                    if (number17.isEmpty() || number18.isEmpty() || number19.isEmpty() ||
                            number20.isEmpty() || number21.isEmpty() || number22.isEmpty()) {
                        Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            int numberfinal17 = Integer.parseInt(number17);
                            int numberfinal18 = Integer.parseInt(number18);
                            int numberfinal19 = Integer.parseInt(number19);
                            int numberfinal20 = Integer.parseInt(number20);
                            int numberfinal21 = Integer.parseInt(number21);
                            int numberfinal22 = Integer.parseInt(number22);

                            if(numberfinal17 == 2){
                                scoreFive += 3.4;
                                editText17.setTextColor(getResources().getColor(R.color.black));
                                parabola.setText(R.string.Subtitle_main3);
                                vertice.setText(R.string.vertice_max);
                                rama_izquierda.setText(R.string.crescent_left);
                                rama_derecha.setText(R.string.decrease_right);
                            }else{
                                scoreFive += 0;
                                editText17.setTextColor(getResources().getColor(R.color.red));
                                parabola.setText(R.string.vacio);
                                vertice.setText(R.string.vacio);
                                rama_izquierda.setText(R.string.vacio);
                                rama_derecha.setText(R.string.vacio);
                            }

                            if(numberfinal18 == 8){
                                scoreFive += 3.4;
                                editText18.setTextColor(getResources().getColor(R.color.black));
                                parabola.setText(R.string.Subtitle_main3);
                                vertice.setText(R.string.vertice_max);
                                rama_izquierda.setText(R.string.crescent_left);
                                rama_derecha.setText(R.string.decrease_right);
                            }else{
                                scoreFive += 0;
                                editText18.setTextColor(getResources().getColor(R.color.red));
                                parabola.setText(R.string.vacio);
                                vertice.setText(R.string.vacio);
                                rama_izquierda.setText(R.string.vacio);
                                rama_derecha.setText(R.string.vacio);
                            }

                            if(numberfinal19 == 8){
                                scoreFive += 3.2;
                                editText19.setTextColor(getResources().getColor(R.color.black));
                                parabola.setText(R.string.Subtitle_main3);
                                vertice.setText(R.string.vertice_max);
                                rama_izquierda.setText(R.string.crescent_left);
                                rama_derecha.setText(R.string.decrease_right);
                            }else{
                                scoreFive += 0;
                                editText19.setTextColor(getResources().getColor(R.color.red));
                                parabola.setText(R.string.vacio);
                                vertice.setText(R.string.vacio);
                                rama_izquierda.setText(R.string.vacio);
                                rama_derecha.setText(R.string.vacio);
                            }

                            if(numberfinal20 == -3){
                                scoreFive += 3.4;
                                editText20.setTextColor(getResources().getColor(R.color.black));
                                parabola.setText(R.string.Subtitle_main3);
                                vertice.setText(R.string.vertice_max);
                                rama_izquierda.setText(R.string.crescent_left);
                                rama_derecha.setText(R.string.decrease_right);
                            }else{
                                scoreFive += 0;
                                editText20.setTextColor(getResources().getColor(R.color.red));
                                parabola.setText(R.string.vacio);
                                vertice.setText(R.string.vacio);
                                rama_izquierda.setText(R.string.vacio);
                                rama_derecha.setText(R.string.vacio);
                            }

                            if(numberfinal21 == 5){
                                scoreFive += 3.2;
                                editText21.setTextColor(getResources().getColor(R.color.black));
                                parabola.setText(R.string.Subtitle_main3);
                                vertice.setText(R.string.vertice_max);
                                rama_izquierda.setText(R.string.crescent_left);
                                rama_derecha.setText(R.string.decrease_right);
                            }else{
                                scoreFive += 0;
                                editText21.setTextColor(getResources().getColor(R.color.red));
                                parabola.setText(R.string.vacio);
                                vertice.setText(R.string.vacio);
                                rama_izquierda.setText(R.string.vacio);
                                rama_derecha.setText(R.string.vacio);
                            }

                            if(numberfinal22 == -3){
                                scoreFive += 3.4;
                                editText22.setTextColor(getResources().getColor(R.color.black));
                                parabola.setText(R.string.Subtitle_main3);
                                vertice.setText(R.string.vertice_max);
                                rama_izquierda.setText(R.string.crescent_left);
                                rama_derecha.setText(R.string.decrease_right);
                            }else{
                                scoreFive += 0;
                                editText22.setTextColor(getResources().getColor(R.color.red));
                                parabola.setText(R.string.vacio);
                                vertice.setText(R.string.vacio);
                                rama_izquierda.setText(R.string.vacio);
                                rama_derecha.setText(R.string.vacio);
                            }

                            resultFive.setText( String.valueOf(scoreFive));
                            resultFive.setTextColor(getResources().getColor(R.color.red));

                            scoreTotal = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive;
                            Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                        } catch (NumberFormatException nfe){
                            Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                            editText17.setText(R.string.vacio);
                            editText18.setText(R.string.vacio);
                            editText19.setText(R.string.vacio);
                            editText20.setText(R.string.vacio);
                            editText21.setText(R.string.vacio);
                            editText22.setText(R.string.vacio);
                            parabola.setText(R.string.vacio);
                            vertice.setText(R.string.vacio);
                            rama_izquierda.setText(R.string.vacio);
                            rama_derecha.setText(R.string.vacio);
                            resultFive.setText(R.string.vacio);
                        }
                    }
                }
            });

            return rootView;
    }
}
