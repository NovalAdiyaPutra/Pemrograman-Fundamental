package Tugas7;

import java.util.Scanner;

public class ArrayJumlahData {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah data : ");
        int size = sc.nextInt();
        int [] data = new int[size];
        System.out.println("Inputkan data berikut : ");

        for(int i = 0; i < size; i++){
            System.out.print("data ke- " + i + " : ");
            data[i] = sc.nextInt();
        }
        System.out.println("Menampilkan data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " : ");
            if (data[i] % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        }

        int total = 0;
        for (int num : data){
            total += num;
        }
        double rataRata = total / size;

        System.out.println("total penjumlahan : " +total);
        System.out.println("rata-rata : "+rataRata);

        sc.close();
    }
}

