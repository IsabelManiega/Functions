package com.functions.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Lessons implements Parcelable {
    private final int title;
    private final int subtitle;
    private final int image;

    public Lessons(int Title, int Subtitle, int Image) {
        this.title = Title;
        this.subtitle = Subtitle;
        this.image = Image;
    }

    private Lessons(Parcel in) {
        title = in.readInt();
        subtitle = in.readInt();
        image = in.readInt();
    }

    public static final Creator<Lessons> CREATOR = new Creator<Lessons>() {
        @Override
        public Lessons createFromParcel(Parcel in) {
            return new Lessons(in);
        }

        @Override
        public Lessons[] newArray(int size) {
            return new Lessons [size];
        }
    };



    public int getTitle() {
        return title;
    }


    public int getsubtitle() {
        return subtitle;
    }

    public int getImage() {
        return image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(title);
        parcel.writeInt(subtitle);
        parcel.writeInt(image);
    }
}