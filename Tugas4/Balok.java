/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

public class Balok extends Perhitungan{
    private int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int Volume() {
        //rumus volume balok = p*l*t
        return panjang * lebar * tinggi;
    }

    public int LuasPermukaan() {
        //rumus luas permukaan balok = 2*(p*l + p*t + l*t)
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
