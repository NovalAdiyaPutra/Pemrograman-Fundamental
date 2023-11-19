package Tugas5;

import java.util.Scanner;

public class WhileLoopHargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = input.nextDouble();

        double totalPembayaran = 0;
        int i = 1;

        while (i <= jumlahBarang) {
            totalPembayaran += hargaPerBarang;
            i++;
        }

        if (jumlahBarang >= 30) {
            totalPembayaran -= totalPembayaran * 0.1; // Diskon 10%
        }

        System.out.println("Total pembayaran untuk " + jumlahBarang + " barang adalah: " + totalPembayaran);
    }
}
