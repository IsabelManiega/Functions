package com.functions.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Theme1 implements Parcelable {
    private int image;
    private int title;
    private int editText1;
    private String editTextValue1;

    public Theme1(int Image, int Title, int EditText1){
        this.image =Image;
        this.title = Title;
        this.editText1 = EditText1;
    }

    private Theme1(Parcel in) {
        image = in.readInt();
        title = in.readInt();
        editText1 = in.readInt();
    }

    public static final Creator<Theme1> CREATOR = new Creator<Theme1>() {
        @Override
        public Theme1 createFromParcel(Parcel in) {
            return new Theme1(in);
        }

        @Override
        public Theme1[] newArray(int size) {
            return new Theme1[size];
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(image);
        parcel.writeInt(title);
        parcel.writeInt(editText1);
    }
}

