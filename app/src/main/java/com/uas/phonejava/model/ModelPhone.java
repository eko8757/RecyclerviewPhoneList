package com.uas.phonejava.model;

public class ModelPhone {
    String nama;
    String nomor;

    public ModelPhone(String nama, String nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}
