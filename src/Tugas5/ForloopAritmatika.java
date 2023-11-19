package Tugas5;

import java.util.Scanner;

public class ForloopAritmatika {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan Angka : ");
            int a = sc.nextInt();
            int jumlah = 0;

            for (int i = 0; i < 10; i++) {
                jumlah = jumlah + a;
                System.out.println("jumlah deret aritmatika: " + jumlah);
            }
        }
    }
