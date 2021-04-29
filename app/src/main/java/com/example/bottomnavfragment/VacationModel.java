package com.example.bottomnavfragment;

import android.os.Parcel;
import android.os.Parcelable;

public class VacationModel implements Parcelable {
    private String name;
    private String summary;
    private int photo;

    public VacationModel(String name, String summary, int photo) {
        this.name = name;
        this.summary = summary;
        this.photo = photo;
    }

    public VacationModel(Parcel p){
        this.name = p.readString();
        this.summary = p.readString();
        this.photo = p.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
        dest.writeString(name);
        dest.writeString(summary);
        dest.writeInt(photo);
    }

    public static final Parcelable.Creator<VacationModel> CREATOR = new Parcelable.Creator<VacationModel>() {

        @Override
        public VacationModel createFromParcel(Parcel source) {
            return new VacationModel(source);
        }

        @Override
        public VacationModel[] newArray(int size) {
            return new VacationModel[0];
        }
    };
}
