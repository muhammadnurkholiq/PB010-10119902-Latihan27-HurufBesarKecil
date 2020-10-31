/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * 
 * @author
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF-10K
 * NIM      : 10119902
 * Deskripsi Program : Program ini berisi program untuk Menformat Kalimat Ke Huruf Besar Dan Kecil
 * 
 */

public class PB01010119902Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String kalimat, kalimatHurufBesar, kalimatHurufKecil;

        System.out.print("Masukkan kalimat : ");
        kalimat = scanner.nextLine();
        
        System.out.println();

        kalimatHurufBesar = kalimat.toUpperCase();
        kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
    }
    
}