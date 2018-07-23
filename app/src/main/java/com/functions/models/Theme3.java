package com.functions.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Theme3 implements Parcelable {
    private int image;
    private int title;

    private static final int NO_EDITTEXT_PROVIDER = -1;
    private int textView1 = NO_TEXTVIEW_PROVIDER;
    private int textView2 = NO_TEXTVIEW_PROVIDER;

    private static final int NO_TEXTVIEW_PROVIDER = -1;
    private int editText1 = NO_EDITTEXT_PROVIDER;
    private int editText2 = NO_EDITTEXT_PROVIDER;
    private int editText3 = NO_EDITTEXT_PROVIDER;
    private int editText4 = NO_EDITTEXT_PROVIDER;
    private int editText5 = NO_EDITTEXT_PROVIDER;
    private int editText6 = NO_EDITTEXT_PROVIDER;

    private String editTextValue1;
    private String editTextValue2;
    private String editTextValue3;
    private String editTextValue4;
    private String editTextValue5;
    private String editTextValue6;


    public Theme3(int Image, int Title, int EditText1,
                  int TextView1, int EditText4,int EditText5,int EditText6){
        this.image =Image;
        this.title = Title;
        this.editText1 = EditText1;
        this.textView1 = TextView1;
        this.editText4 = EditText4;
        this.editText5 = EditText5;
        this.editText6 = EditText6;
    }

    public Theme3(int Image, int Title, int EditText1,
                  int TextView1, int EditText3, int EditText4,int EditText5,int EditText6){
        this.image = Image;
        this.title = Title;
        this.editText1 = EditText1;
        this.textView1 = TextView1;
        this.editText3 = EditText3;
        this.editText4 = EditText4;
        this.editText5 = EditText5;
        this.editText6 = EditText6;
    }

    public Theme3(int Image, int Title, int EditText1,
                  int TextView1, int EditText2, int TextView2,
                  int EditText3, int EditText4,int EditText5,int EditText6){
        this.image = Image;
        this.title = Title;
        this.editText1 = EditText1;
        this.textView1 = TextView1;
        this.editText2 = EditText2;
        this.textView2 = TextView2;
        this.editText3 = EditText3;
        this.editText4 = EditText4;
        this.editText5 = EditText5;
        this.editText6 = EditText6;
    }

    private Theme3(Parcel in) {
        image = in.readInt();
        title = in.readInt();
        editText1 = in.readInt();
        textView1 = in.readInt();
        editText2 = in.readInt();
        textView2 = in.readInt();
        editText3 = in.readInt();
        editText4 = in.readInt();
        editText5 = in.readInt();
        editText6 = in.readInt();
    }

    public static final Creator<Theme3> CREATOR = new Creator<Theme3>() {
        @Override
        public Theme3 createFromParcel(Parcel in) {
            return new Theme3(in);
        }

        @Override
        public Theme3[] newArray(int size) {
            return new Theme3[size];
        }
    };

    public int getImage() {
        return image;
    }

    public int getTitle() {
        return title;
    }


    public int getEditText1() {
        return editText1;
    }

    public void setEditTextValue1(String editTextValue) {
        editTextValue1 = editTextValue;
    }

    public boolean hasEditText1() {
        return editText1 != NO_EDITTEXT_PROVIDER;
    }


    public int getEditText2() {
        return editText2;
    }

    public void setEditTextValue2(String editTextValue) {
        editTextValue2 = editTextValue;
    }

    public boolean hasEditText2() {
        return editText2 != NO_EDITTEXT_PROVIDER;
    }


    public int getEditText3() {
        return editText3;
    }

    public void setEditTextValue3(String editTextValue) {
        editTextValue3 = editTextValue;
    }

    public boolean hasEditText3() {
        return editText3 != NO_EDITTEXT_PROVIDER;
    }


    public int getEditText4() {
        return editText4;
    }

    public void setEditTextValue4(String editTextValue) {
        editTextValue4 = editTextValue;
    }

    public boolean hasEditText4() {
        return editText4 != NO_EDITTEXT_PROVIDER;
    }


    public int getEditText5() {
        return editText5;
    }

    public void setEditTextValue5(String editTextValue) {
        editTextValue5 = editTextValue;
    }

    public boolean hasEditText5() {
        return editText5 != NO_EDITTEXT_PROVIDER;
    }


    public int getEditText6() { return editText6; }

    public void setEditTextValue6(String editTextValue) {
        editTextValue6 = editTextValue;
    }

    public boolean hasEditText6() {
        return editText6 != NO_EDITTEXT_PROVIDER;
    }


    public int getTextView1() {
        return textView1;
    }

    public boolean hasTextView1() {
        return textView1 != NO_TEXTVIEW_PROVIDER;
    }

    public int getTextView2() {
        return textView2;
    }

    public boolean hasTextView2() {
        return textView2 != NO_TEXTVIEW_PROVIDER;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(image);
        parcel.writeInt(title);
        parcel.writeInt(editText1);
        parcel.writeInt(textView1);
        parcel.writeInt(editText2);
        parcel.writeInt(textView2);
        parcel.writeInt(editText3);
        parcel.writeInt(editText4);
        parcel.writeInt(editText5);
        parcel.writeInt(editText6);
    }
}
