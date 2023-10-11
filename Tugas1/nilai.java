/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class nilai {

	String nim;
	String nama;
	Float  NAbsen;
	Float  NTugas;
	Float  NUTS;
	Float  NUAS;
	Float  NAkhir;
	
	float nilai() {
		NAkhir = (NAbsen * 10/100) + (NTugas * 20/100) + (NUTS * 30/100) + (NUAS * 40/100);
		return NAkhir;
	}
	
	void CetakNilai() {
		System.out.println("NIM: "+nim);
		System.out.println("Nama: "+nama);
		System.out.println("Nilai Absen [10%]: "+NAbsen);
		System.out.println("Nilai Tugas [20%]: "+NTugas);
		System.out.println("Nilai UTS [30%]: "+NUTS);
		System.out.println("Nilai UAS [40%]: "+NUAS);
		System.out.println("Nilai Akhir: "+nilai());
	}
}
  
