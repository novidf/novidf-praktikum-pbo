/**
Nama file	: Asersi2.java
Tanggal		: 29 Maret 2023
Penulis		: Novi Dwi Fitriani/24060121120027
Deskripsi 	: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
**/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

//Yang kurang tepat pada program Asersi2 di atas adalah penulisan jariJari > 0, seharusnya sintaks yang benar adalah jariJari != 0 bukan > 0.
//Apabila yang diinginkan angka bukan nol, angka negatif juga bisa masuk. Namun, jika jariJari > 0 yang digunakan, maka angka bernilai negatif tidak dapat dijalankan. 
//Dengan demikian, sintaks paling tepat yang digunakan adalah jariJari != 0