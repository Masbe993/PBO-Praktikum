/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
import java.util.Scanner;
public class Beli {
public static void main( String[] args ){
    int potongan, hasil;
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan total pembelian Anda: ");
    int pembelian = masukan.nextInt();
    if(pembelian < 50000){
        potongan = pembelian * 5 / 100;
        hasil = pembelian - potongan;
    } else {
        potongan = pembelian * 20 / 100;
        hasil = pembelian - potongan;
    }
    System.out.print("besarnya potongan: "+potongan+"\nJumlah yang harus dibayar: "+hasil);
}
}