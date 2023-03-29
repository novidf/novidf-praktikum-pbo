/**
Nama file	: MLingkaran.java
Tanggal		: 25 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi   : File implementasi cara mengihtung luas lingkaran
**/

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang jari-jari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah : "+ lr.hitungLuas());
    }
}