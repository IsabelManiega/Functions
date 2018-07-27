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
import com.functions.models.Theme1;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Theme1Adapter extends ArrayAdapter<Theme1> {

    private int numberfinal;
    private String number;
    private final Context mContext;

    public static ArrayList<Theme1> mTheme;


    public Theme1Adapter(Context context, ArrayList<Theme1> theme) {
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
    public Theme1 getItem(int position) {
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
            convertView = inflater.inflate(R.layout.content_exercices, null, true);

            holder.image = convertView.findViewById(R.id.imagenParab);
            holder.title = convertView.findViewById(R.id.enunciado1);

            holder.editText1 =  convertView.findViewById(R.id.editText);
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


        holder.submit.setTag(position);
        holder.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = (Integer) v.getTag();
                if (pos == 0) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != 2) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                } else if (pos == 1) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != 3) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }

                    }

                } else if (pos == 2) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != 1) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                } else if (pos == 3) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != -2) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                } else if (pos == 4) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != -4) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                } else if (pos == 5) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != -5) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                } else if (pos == 6) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != -7) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                } else if (pos == 7) {
                    number = holder.editText1.getText().toString();
                    if (number.isEmpty()) {
                        Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                    } else {
                        numberfinal = Integer.parseInt(number);
                        if (numberfinal != 4) {
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        } else {
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        }
                    }
                    } else {
                        number = holder.editText1.getText().toString();
                        if (number.isEmpty()) {
                            Toast.makeText(mContext,R.string.put_number,Toast.LENGTH_SHORT).show();
                        } else {
                            numberfinal = Integer.parseInt(number);
                            if (numberfinal != -6) {
                                holder.result.setText(R.string.incorrect);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                            } else {
                                holder.result.setText(R.string.correct);
                                holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
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
        protected TextView result;
        protected Button submit;

    }
}
