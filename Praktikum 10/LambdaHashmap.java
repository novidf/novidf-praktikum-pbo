/**
File		: LambdaHashmap.java
Nama		: Novi Dwi Fitriani
NIM			: 24060121120027
Tanggal 	: 1 Juni 2023
Deskripsi	: Implementasi lambda pada Hashmap
**/

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashmap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121120027", "Novi Dwi Fitriani"); 
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama)); 
    } 
}
