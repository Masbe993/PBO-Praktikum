/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematika mtk = new Matematika () ;
            mtk.pertambahan (20,10);
            mtk.pengurangan(10, 5);
            mtk.perkalian(10, 3);
            mtk.pembagian(21, 2);
            
            System.out.println("Penambahan 20 + 10 = "+mtk.pertambahan(20, 10));
            System.out.println("Pengurangan 10 - 5 = "+mtk.pengurangan(10, 5));
            System.out.println("Perkalian 10 x 3 = "+mtk.perkalian(10, 3));
            System.out.println("Pembagian 21 / 2 = "+mtk.pembagian(21, 2));
            
            
        }
    }
    

