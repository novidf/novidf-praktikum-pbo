/**
Nama file	: MBujurSangkar.java
Tanggal		: 25 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi	: File class implementasi untuk menghitung luas bujur sangkar
**/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}