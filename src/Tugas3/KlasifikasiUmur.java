package Tugas3;

import java.util.Scanner;

public class KlasifikasiUmur {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Klasfikasi Manusia Berdasarkan Umur");
        System.out.println("Masukkan umur: ");
        int umur = sc.nextInt();

        if (umur >=0 && umur <=5) {
            System.out.println("Balita");

        } else if (umur >=6 && umur <=10) {
            System.out.println("Anak-Anak");

        } else if (umur >=11 && umur <=18) {
            System.out.println("Remaja");

        } else if (umur >=19 && umur <=60) {
            System.out.println("Dewasa");

        } else if (umur >=61) {
            System.out.println("Lanjut Usia");

        } else {
            System.out.println("Error");
        }

    }
}
