/**
Nama file	: BujurSangkar.java
Tanggal		: 25 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi	: File class implementasi method dari abstract class bangun datar
**/

public class BujurSangkar extends BangunDatar {
	public double hitungLuas(double sisi) {
		luas = sisi * sisi;
		return luas;
	}
	
    // jika implementasi metode dari abstract tidak dibuat, maka terjadi error
    // file bujursangkar tidak dapat dicompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}