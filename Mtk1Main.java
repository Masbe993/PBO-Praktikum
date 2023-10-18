/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author Asus
 */
public class Mtk1Main {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mtk1 MTK = new Mtk1() {
		};
		int Pertambahan = MTK.Pertambahan(20, 10);
		int Pengurangan = MTK.Pengurangan(10, 5);
		int Perkalian = MTK.Perkalian(10, 3);
		double Pembagian = MTK.Pembagian(21, 2);
		
		System.out.println("Pertambahan: 20 + 10 = "+Pertambahan);
		System.out.println("Pengurangan: 20 - 5 = "+Pengurangan);
		System.out.println("Perkalian: 10 x 3 = "+Perkalian);
		System.out.println("Pembagian: 21 / 2 = "+Pembagian);
	}

}

