package Tugas5;

import java.util.Scanner;

public class WhileLoopAritmatika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int a = sc.nextInt();
        int jumlah = 0;
        int i = 0;

        while (i < 10) {
            jumlah = jumlah + a;
            System.out.println("jumlah deret aritmatika: " + jumlah);
            i++;
        }
    }
}
