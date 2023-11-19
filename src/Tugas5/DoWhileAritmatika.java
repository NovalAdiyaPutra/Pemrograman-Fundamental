package Tugas5;

import java.util.Scanner;

public class DoWhileAritmatika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int a = sc.nextInt();
        int i = 0;
        int jumlah = 0;
        do{
            jumlah = jumlah + a;
            System.out.println("jumlah deret aritmatika: "+jumlah);
            i++;
        }while(i<10);
    }
}
