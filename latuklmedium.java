package com.mycompany.latihanukl4;

import java.util.Scanner;

public class Latihanukl4 {

    
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolumeTabung(r, t);

        System.out.println("\nVolume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah:");
        System.out.println(volume + " cm^3");

        input.close();
    }
}
