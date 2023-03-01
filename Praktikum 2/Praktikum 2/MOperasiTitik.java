//Nama file : MOperasiTitik.java
//Penulis 	: Novi Dwi Fitriani/24060121120027
//Tanggal	: 01/03/2023
//Deskripsi : Kelas yang berisi program utama yamng memanfaatkan kelas operasi titik

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1 = new Titik(4.0, 4.0);
		OperasiTitik op= new OperasiTitik();
		
		
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		
		op.refleksiX(t1);
		System.out.println("\nTitik setelah refleksi sumbu X");
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		
		op.refleksiY(t1);
		System.out.println("\nTitik setelah refleksi sumbu Y");
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
	}
}