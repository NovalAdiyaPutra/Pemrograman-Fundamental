package Tugas5;

import java.util.Scanner;

public class DoWhileHargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = input.nextDouble();

        double totalPembayaran = 0;
        int i = 1;

        if (jumlahBarang >= 30) {
            do {
                totalPembayaran += hargaPerBarang;
                i++;
            } while (i <= jumlahBarang);
            totalPembayaran -= totalPembayaran * 0.1; // Diskon 10%
        } else {
            do {
                totalPembayaran += hargaPerBarang;
                i++;
            } while (i <= jumlahBarang);
        }
        System.out.println("Total pembayaran untuk " + jumlahBarang + " barang adalah: " + totalPembayaran);
    }
}
