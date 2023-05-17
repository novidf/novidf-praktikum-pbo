/**
* File		: ArrayListTest.java
* Nama		: Novi Dwi Fitriani
* NIM		: 24060121120027
* Tanggal 	: 17 Mei 2023
* Deskripsi	: program penggunaan onjek ArryList sebagai Collection class
*/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArryList yang hanya dapat berisi objek String
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArryList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}