package Tugas5;

import java.util.Scanner;

public class ForloopHargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = input.nextDouble();

        double totalPembayaran = 0;

        for (int i = 1; i <= jumlahBarang; i++) {
            totalPembayaran += hargaPerBarang;
        }

        if (jumlahBarang >= 30) {
            totalPembayaran -= totalPembayaran * 0.1; // Diskon 10%
        }

        System.out.println("Total pembayaran untuk " + jumlahBarang + " barang adalah: " + totalPembayaran);
    }
}
