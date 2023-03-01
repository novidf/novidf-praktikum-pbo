//Nama file : OperasiTitik.java
//Penulis 	: Novi Dwi Fitriani/24060121120027
//Tanggal	: 01/03/2023
//Deskripsi : Kelas yang berisi realisasi program kelas operasi titik

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat*-1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis *-1;
		titik.setAbsis(absis);
	}
	public void refleksiX(Titik titik){
		refleksiSumbuX(titik);
	}
	public void refleksiY(Titik titik){
		refleksiSumbuY(titik);
	}
}