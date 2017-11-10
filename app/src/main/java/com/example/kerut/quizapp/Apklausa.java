package com.example.kerut.quizapp;

/**
 * Created by kerut on 08/11/2017.
 */

public class Apklausa {
    private String id;
    private String vartotojas;
    private String kiekis;
    private String data;

    public Apklausa(String id, String vartotojas, String kiekis, String data) {
        this.id = id;
        this.vartotojas = vartotojas;
        this.kiekis = kiekis;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVartotojas() {
        return vartotojas;
    }

    public void setVartotojas(String vartotojas) {
        this.vartotojas = vartotojas;
    }

    public String getKiekis() {
        return kiekis;
    }

    public void setKiekis(String kiekis) {
        this.kiekis = kiekis;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
