/**
Nama file	: AngkaSial.java
Tanggal		: 29 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi	: Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
**/

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}


//baris 14 dan 23 (baris 12 dan 21 jika pada modul) tidak dieksekusi karena class AngkaSial exception belum dibuat,
//dengan demikian, perlu dibuat class AngkaSial exception dahulu yang mana merupakan turunan dari class exception