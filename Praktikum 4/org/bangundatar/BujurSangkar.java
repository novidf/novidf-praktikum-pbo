/**
 Nama file	: BujurSangkar.java
 Tanggal	: 15 Maret 2023
 Penulis	: Novi Dwi Fitriani/24060121120027
 Deskripsi	: Representasi dasar dari objek Bujur sangkar, turunan kelas poligon
**/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return (this.panjangSisi*this.panjangSisi);
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}