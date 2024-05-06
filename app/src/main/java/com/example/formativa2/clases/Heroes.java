package com.example.formativa2.clases;

import android.os.Parcel;
import android.os.Parcelable;

public class Heroes implements Parcelable {
    Heroes() {
    }

    private String nombre, comentarios, foto;

    protected Heroes(Parcel in) {
        nombre = in.readString();
        comentarios = in.readString();
        foto = in.readString();
    }

    public static final Creator<Heroes> CREATOR = new Creator<Heroes>() {
        @Override
        public Heroes createFromParcel(Parcel in) {
            return new Heroes(in);
        }

        @Override
        public Heroes[] newArray(int size) {
            return new Heroes[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(comentarios);
        parcel.writeString(foto);
    }
}

