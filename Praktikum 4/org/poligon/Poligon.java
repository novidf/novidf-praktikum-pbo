/**
 Nama file	: Poligon.java
 Tanggal	: 15 Maret 2023
 Penulis	: Novi Dwi Fitriani/24060121120027
 Deskripsi	: Super Class Poligon
**/
 
package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
} 