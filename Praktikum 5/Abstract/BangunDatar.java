/**
Nama file	: BangunDatar.java
Tanggal		: 25 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi	: File abstract class bangun datar
**/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}