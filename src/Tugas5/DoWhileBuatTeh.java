package Tugas5;

import java.util.Scanner;

public class DoWhileBuatTeh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Langkah-langkah membuat secangkir teh:");
        boolean airMendidih = false;
        boolean tehDitambahkan = false;

        do {
            System.out.println("1. Panaskan air hingga mendidih.");
            System.out.print("Apakah air sudah mendidih? (sudah/belum): ");
            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("sudah")) {
                airMendidih = true;
            }
        } while (!airMendidih);

        do {
            System.out.println("2. Tambahkan teh dan gula ke dalam cangkir.");
            System.out.print("Apakah teh dan gula sudah ditambahkan? (sudah/belum): ");
            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("sudah")) {
                tehDitambahkan = true;
            }
        } while (!tehDitambahkan);
        System.out.println("3. Teh siap diminum!");
    }
}
