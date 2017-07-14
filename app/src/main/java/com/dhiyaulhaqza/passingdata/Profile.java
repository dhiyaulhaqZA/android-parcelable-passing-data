package com.dhiyaulhaqza.passingdata;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by dhiyaulhaqza on 7/13/17.
 */

public class Profile implements Parcelable {
    private int nim;
    private String nama;
    private String jurusan;
    private ArrayList<String> alamat;


    protected Profile(Parcel in) {
        nim = in.readInt();
        nama = in.readString();
        jurusan = in.readString();
        alamat = in.createStringArrayList();
    }

    public Profile() {
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public void setAlamat(ArrayList<String> alamat) {
        this.alamat = alamat;
    }

    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        @Override
        public Profile createFromParcel(Parcel in) {
            return new Profile(in);
        }

        @Override
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(nim);
        parcel.writeString(nama);
        parcel.writeString(jurusan);
        parcel.writeStringList(alamat);
    }
}
