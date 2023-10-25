/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;
import Tugas2.Matematika;
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika2 mtk = new Matematika2();
        
        System.out.println("Hasil Modulus  = " + mtk.modulus(21, 2));
        System.out.println("Hasil Kurang  = " + mtk.pengurangan (10, 5));
        System.out.println("Hasil Kali    = " + mtk.perkalian(10, 3));
        System.out.println("Hasil Bagi    = " + mtk.pembagian(21, 2));
        System.out.println("Hasil Tambah = " + mtk.pertambahan(20, 10));
	}

}
    
 
