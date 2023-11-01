/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

public class kubus extends Perhitungan{
    private int sisi;

    public kubus(int sisi) {
        this.sisi = sisi;
    }

    
    public int Volume() {
        //rumus volume kubus = sisi^3
        return sisi*sisi*sisi;
    }

  
    public int LuasPermukaan() {
        //rumus luas permukaan kubus adalah 6*sisi^2
        return 6 * sisi * sisi;
    }
}

