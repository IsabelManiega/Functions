/*
 * Created by Isabel Maniega on 27/07/18 10:56
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 27/07/18 10:56
 */

package com.functions.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.functions.ImageActivity;
import com.functions.R;
import com.functions.models.Theme4;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Theme4Adapter extends ArrayAdapter<Theme4> {

    private String number;
    private String number2;
    private String number3;
    private String number4;
    private String number5;

    private int numberfinal;
    private int numberfinal2;
    private int numberfinal3;
    private int numberfinal4;
    private int numberfinal5;

    private final Context mContext;

    public static ArrayList<Theme4> mTheme;


    public Theme4Adapter(Context context, ArrayList<Theme4> theme) {
        super(context, 0, theme);
        mContext = context;
        mTheme = theme;

    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return mTheme.size();
    }

    @Override
    public Theme4 getItem(int position) {
        return mTheme.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.content_exercices4, null, true);

            holder.image = convertView.findViewById(R.id.imagenParab);
            holder.title = convertView.findViewById(R.id.enunciado1);
            holder.editText1 =  convertView.findViewById(R.id.editText);
            if (mTheme.get(position).hasEditText1()) {
                holder.editText1.setText(mTheme.get(position).getEditText1());
                holder.editText1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        mTheme.get(position).setEditTextValue1(holder.editText1.getText().toString());

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                    }
                });
                holder.editText1.setVisibility(View.VISIBLE);
            } else {
                holder.editText1.setVisibility(View.GONE);
            }

            holder.editText2 =  convertView.findViewById(R.id.editText2);
            if (mTheme.get(position).hasEditText2()) {
                holder.editText2.setText(mTheme.get(position).getEditText2());
                holder.editText2.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        mTheme.get(position).setEditTextValue2(holder.editText2.getText().toString());

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                holder.editText2.setVisibility(View.VISIBLE);
            } else {
                holder.editText2.setVisibility(View.GONE);
            }

            holder.editText3 =  convertView.findViewById(R.id.editText3);
            if (mTheme.get(position).hasEditText3()) {
                holder.editText3.setText(mTheme.get(position).getEditText3());
                holder.editText3.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        mTheme.get(position).setEditTextValue3(holder.editText3.getText().toString());

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                holder.editText3.setVisibility(View.VISIBLE);
            } else {
                holder.editText3.setVisibility(View.GONE);
            }

            holder.editText4 =  convertView.findViewById(R.id.editText4);
            if (mTheme.get(position).hasEditText4()) {
                holder.editText4.setText(mTheme.get(position).getEditText4());
                holder.editText4.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        mTheme.get(position).setEditTextValue4(holder.editText4.getText().toString());

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                holder.editText4.setVisibility(View.VISIBLE);
            } else {
                holder.editText4.setVisibility(View.GONE);
            }

            holder.editText5 =  convertView.findViewById(R.id.editText5);
            if (mTheme.get(position).hasEditText5()) {
                holder.editText5.setText(mTheme.get(position).getEditText5());
                holder.editText5.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        mTheme.get(position).setEditTextValue5(holder.editText5.getText().toString());

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                holder.editText5.setVisibility(View.VISIBLE);
            } else {
                holder.editText5.setVisibility(View.GONE);
            }

            holder.textView1 =  convertView.findViewById(R.id.enunciado2);
            holder.textView2 =  convertView.findViewById(R.id.enunciado3);
            holder.textView3 = convertView.findViewById(R.id.rama_izquierda);
            holder.textView4 = convertView.findViewById(R.id.rama_derecha);
            holder.result =  convertView.findViewById(R.id.tvResult);
            holder.submit =  convertView.findViewById(R.id.submit);

            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        Picasso.get().load(mTheme.get(position).getImage()).fit().into(holder.image);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ImageActivity.class);
                intent.putExtra("Image",mTheme.get(position).getImage());
                mContext.startActivity(intent);
            }
        });

        holder.title.setText(mTheme.get(position).getTitle());


        if (mTheme.get(position).hasTextView1()) {
            holder.textView1.setText(mTheme.get(position).getTextView1());
            holder.textView1.setVisibility(View.VISIBLE);
        } else {
            holder.textView1.setVisibility(View.GONE);
        }


        if (mTheme.get(position).hasTextView2()) {
            holder.textView2.setText(mTheme.get(position).getTextView2());
            holder.textView2.setVisibility(View.VISIBLE);
        } else {
            holder.textView2.setVisibility(View.GONE);
        }


        holder.submit.setTag(position);
        holder.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = (Integer) v.getTag();
                if (pos == 0) {
                    number = holder.editText1.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 2 && numberfinal4 == 2 && numberfinal5 == 0) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                } else if (pos == 1) {
                    number = holder.editText1.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty()|| number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == -3 && numberfinal4 == -3 && numberfinal5 == 0) {
                                holder.textView3.setText(R.string.crescent_left);
                                holder.textView4.setText(R.string.crescent_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }

                } else if (pos == 2) {
                    number = holder.editText1.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty()|| number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 5 && numberfinal4 == 5 && numberfinal5 == 0) {
                                    holder.textView3.setText(R.string.decrease_left);
                                    holder.textView4.setText(R.string.decrease_right);
                                    holder.result.setText(R.string.correct);
                                    holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                                } else {
                                    holder.textView3.setText(R.string.vacio);
                                    holder.textView4.setText(R.string.vacio);
                                    holder.result.setText(R.string.incorrect);
                                    holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                                }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                } else if (pos == 3) {
                    number = holder.editText1.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty()|| number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == -4 && numberfinal4 == -4 && numberfinal5 == 0) {
                                holder.textView3.setText(R.string.crescent_left);
                                holder.textView4.setText(R.string.crescent_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                } else if (pos == 4) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal2 = Integer.parseInt(number2);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 2 && numberfinal2 == 1 && numberfinal4 == 2 && numberfinal5 == -1) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText2.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                } else if (pos == 5) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal2 = Integer.parseInt(number2);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 2 && numberfinal2 == -3 && numberfinal4 == 2 && numberfinal5 == 3) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText2.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                }else if (pos == 6){
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number2.isEmpty()|| number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal2 = Integer.parseInt(number2);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 1 && numberfinal2 == -4 && numberfinal4 == 1 && numberfinal5 == 4) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText2.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                }else if (pos == 7){
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal2 = Integer.parseInt(number2);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 1 && numberfinal2 == -2 && numberfinal4 == 1 && numberfinal5 == 2) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText2.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                }else if (pos == 8){
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty()
                            || number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal2 = Integer.parseInt(number2);
                            numberfinal3 = Integer.parseInt(number3);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 1 && numberfinal2 == 0 && numberfinal3 == 1
                                    && numberfinal4 == 1 && numberfinal5 == 0) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText2.setText(R.string.vacio);
                            holder.editText3.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }

                } else {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.editText5.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty()
                            || number4.isEmpty() || number5.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        try{
                            numberfinal = Integer.parseInt(number);
                            numberfinal2 = Integer.parseInt(number2);
                            numberfinal3 = Integer.parseInt(number3);
                            numberfinal4 = Integer.parseInt(number4);
                            numberfinal5 = Integer.parseInt(number5);
                            if (numberfinal == 2 && numberfinal2 == 0 && numberfinal3 == -2
                                    && numberfinal4 == 2 && numberfinal5 == 0) {
                                holder.textView3.setText(R.string.decrease_left);
                                holder.textView4.setText(R.string.decrease_right);
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                            } else {
                                holder.textView3.setText(R.string.vacio);
                                holder.textView4.setText(R.string.vacio);
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            }
                        } catch (NumberFormatException nfe){
                            Toast.makeText(mContext,R.string.format,Toast.LENGTH_SHORT).show();
                            holder.editText1.setText(R.string.vacio);
                            holder.editText2.setText(R.string.vacio);
                            holder.editText3.setText(R.string.vacio);
                            holder.editText4.setText(R.string.vacio);
                            holder.editText5.setText(R.string.vacio);
                            holder.textView3.setText(R.string.vacio);
                            holder.textView4.setText(R.string.vacio);
                            holder.result.setText(R.string.vacio);
                        }
                    }
                }
            }
        });
        return convertView;
    }

    private class ViewHolder {
        protected ImageView image;
        protected TextView title;
        protected EditText editText1;
        protected EditText editText2;
        protected EditText editText3;
        protected EditText editText4;
        protected EditText editText5;
        protected TextView textView1;
        protected TextView textView2;
        protected TextView textView3;
        protected TextView textView4;
        protected TextView result;
        protected Button submit;

    }
}

