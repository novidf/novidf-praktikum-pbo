/**
Nama file	: Lingkaran.java
Tanggal		: 25 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi   : File class implementasi IArea berupa cara menghitung luas lingkaran
**/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}