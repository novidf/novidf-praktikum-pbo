/**
* File		: BangunDatarGeneric.java
* Nama		: Novi Dwi Fitriani
* NIM		: 24060121120027
* Tanggal 	: 17 Mei 2023
* Deskripsi	: kelas kontruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}
//Mengganti karakter 'T' dengan karakter lain merupakan suatu metode untuk memberikan nama yang lebih deskriptif kepada parameter generik
//dan membedakan ketika menggunakan lebih dari satu parameter generik dalam kelas tersebut.
