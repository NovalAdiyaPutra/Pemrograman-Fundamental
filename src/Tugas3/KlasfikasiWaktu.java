package Tugas3;

import java.util.Scanner;

public class KlasfikasiWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jam");
        int jam = sc.nextInt();

        if (jam >=19 && jam <=23) {
            System.out.println("Selamat Malam");

        } else if (jam >=15 && jam <=18) {
            System.out.println("Selamat Sore");

        } else if (jam >=10 && jam <=14) {
            System.out.println("Selamat Siang");

        } else if (jam >=4 && jam <=9) {
            System.out.println("Selamat Pagi");

        } else if (jam >=0 && jam <=3) {
            System.out.println("Selamat Malam");

        } else {
            System.out.println("Error");
        }
    }
}
