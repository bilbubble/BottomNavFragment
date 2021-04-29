package com.example.bottomnavfragment;

import android.os.Parcel;
import android.os.Parcelable;

public class ShowModel implements Parcelable {
    private int photo;

    public ShowModel( int photo) {
        this.photo = photo;
    }

    public ShowModel(Parcel p){
        this.photo = p.readInt();
    }


    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(photo);
    }

    public static final Parcelable.Creator<ShowModel> CREATOR = new Parcelable.Creator<ShowModel>() {

        @Override
        public ShowModel createFromParcel(Parcel source) {
            return new ShowModel(source);
        }

        @Override
        public ShowModel[] newArray(int size) {
            return new ShowModel[0];
        }
    };
}

