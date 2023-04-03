/**
Nama file	: AngkaSialException.java
Tanggal		: 29 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
**/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial!!!");
	}
}