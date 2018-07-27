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

public class Exam2Fragment extends Fragment {

    float scoreTotal;
    float scoreSix;
    float scoreSeven;
    float scoreEight;
    float scoreNine;
    float scoreTen;

    @BindView(R.id.submitSix) Button SubmitSix;
    @BindView(R.id.submitSeven) Button SubmitSeven;
    @BindView(R.id.submitEight) Button SubmitEight;
    @BindView(R.id.submitNine) Button SubmitNine;
    @BindView(R.id.submitTen) Button SubmitTen;

    @BindView(R.id.tvResultSix) TextView resultSix;
    @BindView(R.id.tvResultSeven) TextView resultSeven;
    @BindView(R.id.tvResultEight) TextView resultEight;
    @BindView(R.id.tvResultNine) TextView resultNine;
    @BindView(R.id.tvResultTen) TextView resultTen;

    @BindView(R.id.Examen6) ImageView Examen6;
    @BindView(R.id.Examen7) ImageView Examen7;
    @BindView(R.id.Examen8) ImageView Examen8;
    @BindView(R.id.Examen9) ImageView Examen9;
    @BindView(R.id.Examen10) ImageView Examen10;

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

    @BindView(R.id.constante2) TextView constante2;
    @BindView(R.id.proporcionalidad3) TextView proporcionalidad3;
    @BindView(R.id.decreciente_creciente4) TextView decreciente_creciente4;
    @BindView(R.id.parabola2)TextView parabola2;
    @BindView(R.id.vertice2)TextView vertice2;
    @BindView(R.id.rama_izquierda2)TextView rama_izquierda2;
    @BindView(R.id.rama_derecha2)TextView rama_derecha2;
    @BindView(R.id.rama_izquierda3)TextView rama_izquierda3;
    @BindView(R.id.rama_derecha3)TextView rama_derecha3;
    @BindView(R.id.rama_izquierda4)TextView rama_izquierda4;
    @BindView(R.id.rama_derecha4)TextView rama_derecha4;
    @BindView(R.id.hiperbola)TextView hiperbola;
    @BindView(R.id.hiperbola2)TextView hiperbola2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_exam2, container, false);
        ButterKnife.bind(this, rootView);

        scoreTotal = 0;

        Picasso.get().load(R.drawable.examen6).fit().into(Examen6);
        Examen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen6);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen7).fit().into(Examen7);
        Examen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen7);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen8).fit().into(Examen8);
        Examen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen8);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen9).fit().into(Examen9);
        Examen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen9);
                startActivity(intent);
            }
        });
        Picasso.get().load(R.drawable.examen10).fit().into(Examen10);
        Examen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImageActivity.class);
                intent.putExtra("Image",R.drawable.examen10);
                startActivity(intent);
            }
        });
        //Exercice 6
        SubmitSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreSix = 0;
                String number23 = editText23.getText().toString();
                String number24 = editText24.getText().toString();
                String number25 = editText25.getText().toString();
                String number26 = editText26.getText().toString();

                if (number23.isEmpty() || number24.isEmpty() || number25.isEmpty() || number26.isEmpty()) {
                    Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                } else {
                    try{
                        int numberfinal23 = Integer.parseInt(number23);
                        int numberfinal24 = Integer.parseInt(number24);
                        int numberfinal25 = Integer.parseInt(number25);
                        int numberfinal26 = Integer.parseInt(number26);

                        if (numberfinal23 == 2) {
                            scoreSix += 5;
                            editText23.setTextColor(getResources().getColor(R.color.black));
                            hiperbola.setText(R.string.subtitle_main4);
                            rama_izquierda2.setText(R.string.decrease_left);
                            rama_derecha2.setText(R.string.decrease_right);
                        } else {
                            scoreSix += 0;
                            editText23.setTextColor(getResources().getColor(R.color.red));
                            hiperbola.setText(R.string.vacio);
                            rama_izquierda2.setText(R.string.vacio);
                            rama_derecha2.setText(R.string.vacio);
                        }

                        if (numberfinal24 == -3) {
                            scoreSix += 5;
                            editText24.setTextColor(getResources().getColor(R.color.black));
                            hiperbola.setText(R.string.subtitle_main4);
                            rama_izquierda2.setText(R.string.decrease_left);
                            rama_derecha2.setText(R.string.decrease_right);
                        } else {
                            scoreSix += 0;
                            editText24.setTextColor(getResources().getColor(R.color.red));
                            hiperbola.setText(R.string.vacio);
                            rama_izquierda2.setText(R.string.vacio);
                            rama_derecha2.setText(R.string.vacio);
                        }

                        if (numberfinal25 == 2) {
                            scoreSix += 5;
                            editText25.setTextColor(getResources().getColor(R.color.black));
                            hiperbola.setText(R.string.subtitle_main4);
                            rama_izquierda2.setText(R.string.decrease_left);
                            rama_derecha2.setText(R.string.decrease_right);
                        } else {
                            scoreSix += 0;
                            editText25.setTextColor(getResources().getColor(R.color.red));
                            hiperbola.setText(R.string.vacio);
                            rama_izquierda2.setText(R.string.vacio);
                            rama_derecha2.setText(R.string.vacio);
                        }

                        if (numberfinal26 == 3) {
                            scoreSix += 5;
                            editText26.setTextColor(getResources().getColor(R.color.black));
                            hiperbola.setText(R.string.subtitle_main4);
                            rama_izquierda2.setText(R.string.decrease_left);
                            rama_derecha2.setText(R.string.decrease_right);
                        } else {
                            scoreSix += 0;
                            editText26.setTextColor(getResources().getColor(R.color.red));
                            hiperbola.setText(R.string.vacio);
                            rama_izquierda2.setText(R.string.vacio);
                            rama_derecha2.setText(R.string.vacio);
                        }
                        resultSix.setText(String.valueOf(scoreSix));
                        resultSix.setTextColor(getResources().getColor(R.color.red));

                        scoreTotal = scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
                        Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException nfe){
                        Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                        editText23.setText(R.string.vacio);
                        editText24.setText(R.string.vacio);
                        editText25.setText(R.string.vacio);
                        editText26.setText(R.string.vacio);
                        hiperbola.setText(R.string.vacio);
                        rama_izquierda2.setText(R.string.vacio);
                        rama_derecha2.setText(R.string.vacio);
                        resultSix.setText(R.string.vacio);
                    }
                }
                }
        });
        //Exercice 7
        SubmitSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreSeven = 0;
                String number27 = editText27.getText().toString();
                String number28 = editText28.getText().toString();
                String number29 = editText29.getText().toString();
                if (number27.isEmpty() || number28.isEmpty() || number29.isEmpty()) {
                    Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                } else {
                    try{
                        int numberfinal27 = Integer.parseInt(number27);
                        int numberfinal28 = Integer.parseInt(number28);
                        int numberfinal29 = Integer.parseInt(number29);

                        if (numberfinal27 == -2) {
                            scoreSeven += 6.8;
                            editText27.setTextColor(getResources().getColor(R.color.black));
                            constante2.setText(R.string.Subtitle_main);
                        } else {
                            scoreSeven += 0;
                            editText27.setTextColor(getResources().getColor(R.color.red));
                            constante2.setText(R.string.vacio);
                        }

                        if (numberfinal28 == 0) {
                            scoreSeven += 6.6;
                            editText28.setTextColor(getResources().getColor(R.color.black));
                            constante2.setText(R.string.Subtitle_main);
                        } else {
                            scoreSeven += 0;
                            editText28.setTextColor(getResources().getColor(R.color.red));
                            constante2.setText(R.string.vacio);
                        }

                        if (numberfinal29 == 0) {
                            scoreSeven += 6.6;
                            editText29.setTextColor(getResources().getColor(R.color.black));
                            constante2.setText(R.string.Subtitle_main);
                        } else {
                            scoreSeven += 0;
                            editText29.setTextColor(getResources().getColor(R.color.red));
                            constante2.setText(R.string.vacio);
                        }
                        resultSeven.setText(String.valueOf(scoreSeven));
                        resultSeven.setTextColor(getResources().getColor(R.color.red));
                        scoreTotal = scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
                        Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException nfe) {
                        Toast.makeText(getContext(), R.string.format, Toast.LENGTH_SHORT).show();
                        editText27.setText(R.string.vacio);
                        editText28.setText(R.string.vacio);
                        editText29.setText(R.string.vacio);
                        constante2.setText(R.string.vacio);
                        resultSeven.setText(R.string.vacio);
                    }
                }
            }
        });
        //Exercice 8
        SubmitEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreEight = 0;
                String number30 = editText30.getText().toString();
                String number31 = editText31.getText().toString();
                String number32 = editText32.getText().toString();
                if (number30.isEmpty() || number31.isEmpty() || number32.isEmpty()) {
                    Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                } else {
                    try{
                        String decrecent = "<";
                        int numberfinal30 = Integer.parseInt(number30);
                        int numberfinal31 = Integer.parseInt(number31);
                        String numberfinal32 = editText32.getText().toString();

                        if (numberfinal30 == -5) {
                            scoreEight += 6.8;
                            editText30.setTextColor(getResources().getColor(R.color.black));
                            proporcionalidad3.setText(R.string.Subtitle2_main);
                            decreciente_creciente4.setText(R.string.decrease);
                        } else {
                            scoreEight += 0;
                            editText30.setTextColor(getResources().getColor(R.color.red));
                            proporcionalidad3.setText(R.string.vacio);
                            decreciente_creciente4.setText(R.string.vacio);
                        }
                        if (numberfinal31 == -5) {
                            scoreEight += 6.6;
                            editText31.setTextColor(getResources().getColor(R.color.black));
                            proporcionalidad3.setText(R.string.Subtitle2_main);
                            decreciente_creciente4.setText(R.string.decrease);
                        } else {
                            scoreEight += 0;
                            editText31.setTextColor(getResources().getColor(R.color.red));
                            proporcionalidad3.setText(R.string.vacio);
                            decreciente_creciente4.setText(R.string.vacio);
                        }

                        if (numberfinal32.equals(decrecent)) {
                            scoreEight += 6.6;
                            editText32.setTextColor(getResources().getColor(R.color.black));
                            proporcionalidad3.setText(R.string.Subtitle2_main);
                            decreciente_creciente4.setText(R.string.decrease);
                        } else {
                            scoreEight += 0;
                            editText32.setTextColor(getResources().getColor(R.color.red));
                            proporcionalidad3.setText(R.string.vacio);
                            decreciente_creciente4.setText(R.string.vacio);
                        }

                        resultEight.setText(String.valueOf(scoreEight));
                        resultEight.setTextColor(getResources().getColor(R.color.red));
                        scoreTotal = scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
                        Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException nfe){
                        Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                        editText30.setText(R.string.vacio);
                        editText31.setText(R.string.vacio);
                        editText32.setText(R.string.vacio);
                        proporcionalidad3.setText(R.string.vacio);
                        decreciente_creciente4.setText(R.string.vacio);
                        resultEight.setText(R.string.vacio);
                    }
                }
            }
        });
        //Exercice 9
        SubmitNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreNine = 0;
                String number33 = editText33.getText().toString();
                String number34 = editText34.getText().toString();
                String number35 = editText35.getText().toString();
                String number36 = editText36.getText().toString();
                String number37 = editText37.getText().toString();
                String number38 = editText38.getText().toString();
                if (number33.isEmpty() || number34.isEmpty() ||
                        number35.isEmpty() || number36.isEmpty() || number37.isEmpty() || number38.isEmpty()) {
                    Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                } else {
                    try{
                        int numberfinal33 = Integer.parseInt(number33);
                        int numberfinal34 = Integer.parseInt(number34);
                        int numberfinal35 = Integer.parseInt(number35);
                        int numberfinal36 = Integer.parseInt(number36);
                        int numberfinal37 = Integer.parseInt(number37);
                        int numberfinal38 = Integer.parseInt(number38);

                        if (numberfinal33 == -1) {
                            scoreNine += 3.4;
                            editText33.setTextColor(getResources().getColor(R.color.black));
                            parabola2.setText(R.string.Subtitle_main3);
                            vertice2.setText(R.string.vertice_max);
                            rama_izquierda3.setText(R.string.crescent_left);
                            rama_derecha3.setText(R.string.decrease_right);
                        } else {
                            scoreNine += 0;
                            editText33.setTextColor(getResources().getColor(R.color.red));
                            parabola2.setText(R.string.vacio);
                            vertice2.setText(R.string.vacio);
                            rama_izquierda3.setText(R.string.vacio);
                            rama_derecha3.setText(R.string.vacio);
                        }
                        if (numberfinal34 == -10) {
                            scoreNine += 3.4;
                            editText34.setTextColor(getResources().getColor(R.color.black));
                            parabola2.setText(R.string.Subtitle_main3);
                            vertice2.setText(R.string.vertice_max);
                            rama_izquierda3.setText(R.string.crescent_left);
                            rama_derecha3.setText(R.string.decrease_right);
                        } else {
                            scoreNine += 0;
                            editText34.setTextColor(getResources().getColor(R.color.red));
                            parabola2.setText(R.string.vacio);
                            vertice2.setText(R.string.vacio);
                            rama_izquierda3.setText(R.string.vacio);
                            rama_derecha3.setText(R.string.vacio);
                        }
                        if (numberfinal35 == -25) {
                            scoreNine += 3.4;
                            editText35.setTextColor(getResources().getColor(R.color.black));
                            parabola2.setText(R.string.Subtitle_main3);
                            vertice2.setText(R.string.vertice_max);
                            rama_izquierda3.setText(R.string.crescent_left);
                            rama_derecha3.setText(R.string.decrease_right);
                        } else {
                            scoreNine += 0;
                            editText35.setTextColor(getResources().getColor(R.color.red));
                            parabola2.setText(R.string.vacio);
                            vertice2.setText(R.string.vacio);
                            rama_izquierda3.setText(R.string.vacio);
                            rama_derecha3.setText(R.string.vacio);
                        }

                        if (numberfinal36 == -5) {
                            scoreNine += 3.2;
                            editText36.setTextColor(getResources().getColor(R.color.black));
                            parabola2.setText(R.string.Subtitle_main3);
                            vertice2.setText(R.string.vertice_max);
                            rama_izquierda3.setText(R.string.crescent_left);
                            rama_derecha3.setText(R.string.decrease_right);
                        } else {
                            scoreNine += 0;
                            editText36.setTextColor(getResources().getColor(R.color.red));
                            parabola2.setText(R.string.vacio);
                            vertice2.setText(R.string.vacio);
                            rama_izquierda3.setText(R.string.vacio);
                            rama_derecha3.setText(R.string.vacio);
                        }

                        if (numberfinal37 == 0) {
                            scoreNine += 3.4;
                            editText37.setTextColor(getResources().getColor(R.color.black));
                            parabola2.setText(R.string.Subtitle_main3);
                            vertice2.setText(R.string.vertice_max);
                            rama_izquierda3.setText(R.string.crescent_left);
                            rama_derecha3.setText(R.string.decrease_right);
                        } else {
                            scoreNine += 0;
                            editText37.setTextColor(getResources().getColor(R.color.red));
                            parabola2.setText(R.string.vacio);
                            vertice2.setText(R.string.vacio);
                            rama_izquierda3.setText(R.string.vacio);
                            rama_derecha3.setText(R.string.vacio);
                        }

                        if (numberfinal38 == -5) {
                            scoreNine += 3.2;
                            editText38.setTextColor(getResources().getColor(R.color.black));
                            parabola2.setText(R.string.Subtitle_main3);
                            vertice2.setText(R.string.vertice_max);
                            rama_izquierda3.setText(R.string.crescent_left);
                            rama_derecha3.setText(R.string.decrease_right);
                        } else {
                            scoreNine += 0;
                            editText38.setTextColor(getResources().getColor(R.color.red));
                            parabola2.setText(R.string.vacio);
                            vertice2.setText(R.string.vacio);
                            rama_izquierda3.setText(R.string.vacio);
                            rama_derecha3.setText(R.string.vacio);
                        }
                        resultNine.setText(String.valueOf(scoreNine));
                        resultNine.setTextColor(getResources().getColor(R.color.red));
                        scoreTotal = scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
                        Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException nfe){
                        Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                        editText33.setText(R.string.vacio);
                        editText34.setText(R.string.vacio);
                        editText35.setText(R.string.vacio);
                        editText36.setText(R.string.vacio);
                        editText37.setText(R.string.vacio);
                        editText38.setText(R.string.vacio);
                        parabola2.setText(R.string.vacio);
                        vertice2.setText(R.string.vacio);
                        rama_izquierda3.setText(R.string.vacio);
                        rama_derecha3.setText(R.string.vacio);
                        resultNine.setText(R.string.vacio);
                    }
                }
            }
        });
        //Exercice 10
        SubmitTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTen = 0;
                String number39 = editText39.getText().toString();
                String number40 = editText40.getText().toString();
                String number41 = editText41.getText().toString();
                String number42 = editText42.getText().toString();
                if (number39.isEmpty() || number40.isEmpty() ||
                        number41.isEmpty() || number42.isEmpty()) {
                    Toast.makeText(getContext(),R.string.put_number,Toast.LENGTH_SHORT).show();
                } else {
                    try{
                        int numberfinal39 = Integer.parseInt(number39);
                        int numberfinal40 = Integer.parseInt(number40);
                        int numberfinal41 = Integer.parseInt(number41);
                        int numberfinal42 = Integer.parseInt(number42);

                        if (numberfinal39 == 3) {
                            scoreTen += 5;
                            editText39.setTextColor(getResources().getColor(R.color.black));
                            hiperbola2.setText(R.string.subtitle_main4);
                            rama_izquierda4.setText(R.string.decrease_left);
                            rama_derecha4.setText(R.string.decrease_right);
                        } else {
                            scoreTen += 0;
                            editText39.setTextColor(getResources().getColor(R.color.red));
                            hiperbola2.setText(R.string.vacio);
                            rama_izquierda4.setText(R.string.vacio);
                            rama_derecha4.setText(R.string.vacio);
                        }

                        if (numberfinal40 == -4) {
                            scoreTen += 5;
                            editText40.setTextColor(getResources().getColor(R.color.black));
                            hiperbola2.setText(R.string.subtitle_main4);
                            rama_izquierda4.setText(R.string.decrease_left);
                            rama_derecha4.setText(R.string.decrease_right);
                        } else {
                            scoreTen += 0;
                            editText40.setTextColor(getResources().getColor(R.color.red));
                            hiperbola2.setText(R.string.vacio);
                            rama_izquierda4.setText(R.string.vacio);
                            rama_derecha4.setText(R.string.vacio);
                        }

                        if (numberfinal41 == -4) {
                            scoreTen += 5;
                            editText41.setTextColor(getResources().getColor(R.color.black));
                            hiperbola2.setText(R.string.subtitle_main4);
                            rama_izquierda4.setText(R.string.decrease_left);
                            rama_derecha4.setText(R.string.decrease_right);
                        } else {
                            scoreTen += 0;
                            editText41.setTextColor(getResources().getColor(R.color.red));
                            hiperbola2.setText(R.string.vacio);
                            rama_izquierda4.setText(R.string.vacio);
                            rama_derecha4.setText(R.string.vacio);
                        }

                        if (numberfinal42 == 0) {
                            scoreTen += 5;
                            editText42.setTextColor(getResources().getColor(R.color.black));
                            hiperbola2.setText(R.string.subtitle_main4);
                            rama_izquierda4.setText(R.string.decrease_left);
                            rama_derecha4.setText(R.string.decrease_right);
                        } else {
                            scoreTen += 0;
                            editText42.setTextColor(getResources().getColor(R.color.red));
                            hiperbola2.setText(R.string.vacio);
                            rama_izquierda4.setText(R.string.vacio);
                            rama_derecha4.setText(R.string.vacio);
                        }
                        resultTen.setText(String.valueOf(scoreTen));
                        resultTen.setTextColor(getResources().getColor(R.color.red));
                        scoreTotal = scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
                        Toast.makeText(getContext(),String.valueOf(scoreTotal)+ "%",Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException nfe){
                        Toast.makeText(getContext(),R.string.format,Toast.LENGTH_SHORT).show();
                        editText40.setText(R.string.vacio);
                        editText41.setText(R.string.vacio);
                        editText42.setText(R.string.vacio);
                        editText39.setText(R.string.vacio);
                        hiperbola2.setText(R.string.vacio);
                        rama_izquierda4.setText(R.string.vacio);
                        rama_derecha4.setText(R.string.vacio);
                        resultTen.setText(R.string.vacio);
                    }
                }
            }
        });

        return rootView;
    }
}
