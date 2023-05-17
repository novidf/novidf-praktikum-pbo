/**
* File		: BangunDatarGenericTest.java
* Nama		: Novi Dwi Fitriani
* NIM		: 24060121120027
* Tanggal 	: 17 Mei 2023
* Deskripsi	: main class uuntuk generic bangun datar
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("keliling Lingkaran " +bdg.hitungKeliling());
		System.out.println("tipe generic : "+bdg.get().getClass().getName());
	}
}