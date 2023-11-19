package Tugas5;

import java.util.Scanner;

public class ForloopBuatTeh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Langkah-langkah membuat secangkir teh:");

        boolean airMendidih = false;
        boolean tehDitambahkan = false;

        for (int step = 1; step <= 2; step++) {
            if (!airMendidih && step == 1) {
                System.out.println("1. Panaskan air hingga mendidih.");
                System.out.print("Apakah air sudah mendidih? (sudah/belum): ");
                String jawaban = input.nextLine();

                if (jawaban.equalsIgnoreCase("belum")) {
                    airMendidih = false;
                    step--;
                }
            } else if (!tehDitambahkan && step == 2) {
                System.out.println("2. Tambahkan teh dan gula ke dalam cangkir.");
                System.out.print("Apakah teh dan gula sudah ditambahkan? (sudah/belum): ");
                String jawaban = input.nextLine();

                if (jawaban.equalsIgnoreCase("belum")) {
                    tehDitambahkan = false;
                    step--;
                }
            }
        }
        System.out.println("3. Teh siap diminum!");
    }
}
