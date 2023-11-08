/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

import java.util.Scanner;

public class Nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM     : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa   : ");
        String nama = input.nextLine();
        double nilaiKehadiran = getDoubleInput("Nilai Kehadiran  : ", input);
        double nilaiTugas = getDoubleInput("Nilai Tugas      : ", input);
        double nilaiUTS = getDoubleInput("Nilai UTS        : ", input);
        double nilaiUAS = getDoubleInput("Nilai UAS        : ", input);

        double nilaiAkhir = calculateNilaiAkhir(nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        double ratarata = calculateRataRata(nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        String[] gradeAndKeterangan = getGradeAndKeterangan(nilaiAkhir);

        // Output
        System.out.println("\n");
        System.out.println("NPM Mahasiswa    : " + npm);
        System.out.println("Nama Mahasiswa   : " + nama);
        System.out.println("Nilai Rata-Rata  : " + ratarata);
        System.out.println("Grade            : " + gradeAndKeterangan[0]);
        System.out.println("Keterangan       : " + gradeAndKeterangan[1]);
        System.out.println("Nilai Akhir       : " + nilaiAkhir);
    }

    private static double getDoubleInput(String prompt, Scanner input) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    private static double calculateNilaiAkhir(double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    private static double calculateRataRata(double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        return (nilaiKehadiran + nilaiTugas + nilaiUTS + nilaiUAS) / 4;
    }

    private static String[] getGradeAndKeterangan(double nilaiAkhir) {
        String grade;
        String keterangan;

        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        return new String[]{grade, keterangan};
    }
}
