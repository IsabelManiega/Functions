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

import com.functions.ImageActivity;
import com.functions.R;
import com.functions.models.Theme2pp;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Theme2ppAdapter extends ArrayAdapter<Theme2pp> {


    private String number;
    private String number2;
    private String number3;
    private String number4;
    private String number5;

    private int numberfinal;
    private int numberfinal2;
    private int numberfinal3;
    private int numberfinal4;
    private String numberfinal5;

    private final Context mContext;

    public static ArrayList<Theme2pp> mTheme;


    public Theme2ppAdapter(Context context, ArrayList<Theme2pp> theme) {
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
    public Theme2pp getItem(int position) {
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
            convertView = inflater.inflate(R.layout.content_exercices2pp, null, true);

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

            holder.creciente_decreciente =  convertView.findViewById(R.id.editText5);
            if (mTheme.get(position).hasEditText5()) {
                holder.creciente_decreciente.setText(mTheme.get(position).getEditText5());
                holder.creciente_decreciente.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        mTheme.get(position).setEditTextValue5(holder.creciente_decreciente.getText().toString());

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                holder.creciente_decreciente.setVisibility(View.VISIBLE);
            } else {
                holder.creciente_decreciente.setVisibility(View.GONE);
            }

            holder.textView1 =  convertView.findViewById(R.id.enunciado2);
            holder.textView2 =  convertView.findViewById(R.id.enunciado3);
            holder.textView3 =  convertView.findViewById(R.id.enunciado5);
            holder.decreciente_creciente = convertView.findViewById(R.id.decreciente_creciente);
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


        //holder.textView1.setText(mTheme.get(position).getTextView1());
        if (mTheme.get(position).hasTextView1()) {
            holder.textView1.setText(mTheme.get(position).getTextView1());
            holder.textView1.setVisibility(View.VISIBLE);
        } else {
            holder.textView1.setVisibility(View.GONE);
        }

        //holder.textView2.setText(mTheme.get(position).getTextView2());
        if (mTheme.get(position).hasTextView2()) {
            holder.textView2.setText(mTheme.get(position).getTextView2());
            holder.textView2.setVisibility(View.VISIBLE);
        } else {
            holder.textView2.setVisibility(View.GONE);
        }
        //holder.textView2.setText(mTheme.get(position).getTextView2());
        if (mTheme.get(position).hasTextView3()) {
            holder.textView3.setText(mTheme.get(position).getTextView3());
            holder.textView3.setVisibility(View.VISIBLE);
        } else {
            holder.textView3.setVisibility(View.GONE);
        }

        holder.submit.setTag(position);
        holder.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = (Integer) v.getTag();
                if (pos == 0) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    number5 = holder.creciente_decreciente.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty()
                            || number4.isEmpty() || number5.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal3 = Integer.parseInt(number3);
                        numberfinal4 = Integer.parseInt(number4);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";

                        if (numberfinal == 2 && numberfinal2 == 3 && numberfinal3 == 2 &&
                                numberfinal4 == 3 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else if (pos == 1) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal3 = Integer.parseInt(number3);
                        numberfinal4 = Integer.parseInt(number4);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";
                        if (numberfinal == 3 && numberfinal2 == 4 && numberfinal3 == 3
                                && numberfinal4 == 4 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }

                } else if (pos == 2) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText3.getText().toString();
                    if (number.isEmpty() || number2.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = "<";
                        if (numberfinal == -1 && numberfinal2 == -1 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.decrease);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else if (pos == 3) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText3.getText().toString();
                    if (number.isEmpty() || number2.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";
                        if (numberfinal == 1 && numberfinal2 == 1 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else if (pos == 4) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal3 = Integer.parseInt(number3);
                        numberfinal4 = Integer.parseInt(number4);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";
                        if (numberfinal == 1 && numberfinal2 == 2 && numberfinal3 == 1 &&
                                numberfinal4 == 2 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else if (pos == 5) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal3 = Integer.parseInt(number3);
                        numberfinal4 = Integer.parseInt(number4);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";
                        if (numberfinal == 1 && numberfinal2 == 5 && numberfinal3 == 1
                                && numberfinal4 == 5 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                      }
                } else if (pos == 6) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText3.getText().toString();
                    if (number.isEmpty() || number2.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = "<";
                        if (numberfinal == -3 && numberfinal2 == -3 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.decrease);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else if (pos == 7) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal3 = Integer.parseInt(number3);
                        numberfinal4 = Integer.parseInt(number4);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";
                        if (numberfinal == 7 && numberfinal2 == 3 && numberfinal3 == 7 &&
                                numberfinal4 == 3 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else if (pos == 8) {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText3.getText().toString();
                    if (number.isEmpty() || number2.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = "<";
                        if (numberfinal == -5 && numberfinal2 == -5 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.decrease);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
                        }
                    }
                } else {
                    number = holder.editText1.getText().toString();
                    number2 = holder.editText2.getText().toString();
                    number3 = holder.editText3.getText().toString();
                    number4 = holder.editText4.getText().toString();
                    if (number.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty()) {
                        holder.result.setText(R.string.put_number);
                        holder.result.setTextColor(mContext.getResources().getColor(R.color.black));
                    } else {
                        numberfinal = Integer.parseInt(number);
                        numberfinal2 = Integer.parseInt(number2);
                        numberfinal3 = Integer.parseInt(number3);
                        numberfinal4 = Integer.parseInt(number4);
                        numberfinal5 = holder.creciente_decreciente.getText().toString();
                        String crecent = ">";
                        if (numberfinal == 2 && numberfinal2 == 7 && numberfinal3 == 2 &&
                                numberfinal4 == 7 && numberfinal5.equals(crecent)) {
                            holder.decreciente_creciente.setText(R.string.crescent);
                            holder.result.setText(R.string.correct);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.green));
                        } else {
                            holder.decreciente_creciente.setText(R.string.vacio);
                            holder.result.setText(R.string.incorrect);
                            holder.result.setTextColor(mContext.getResources().getColor(R.color.red));
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
        protected TextView textView1;
        protected TextView textView2;
        protected TextView textView3;
        protected EditText creciente_decreciente;
        protected TextView decreciente_creciente;
        protected TextView result;
        protected Button submit;

    }

}
