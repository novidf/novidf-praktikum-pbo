//Nama file 	: Titik.java
//Penulis 	: Novi Dwi Fitriani/24060121120027
//Tanggal	: 22/02/2023
//Deskripsi : Kelas yang berisi realisasi program kelas titik

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}  
	
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
  
	void setAbsis(double a){
		absis =a;
	}
  
	double getAbsis(){
		return absis;
	}
	
	void setOrdinat(double b){
		ordinat = b;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}
