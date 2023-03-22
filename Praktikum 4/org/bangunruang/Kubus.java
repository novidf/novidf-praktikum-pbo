/**
 Nama file	: Kubus.java
 Tanggal	: 15 Maret 2023
 Penulis	: Novi Dwi Fitriani/24060121120027
 Deskripsi	: Representasi dasar dari objek kubus, turunan kelas bujur sangkar
**/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		return (permukaan.getPanjangSisi() * permukaan.getPanjangSisi() * permukaan.getPanjangSisi());
	}
	
	public double hitungLuasAlas(){
		return (permukaan.getPanjangSisi() * permukaan.getPanjangSisi());
	}
	
}