package Tugas4;

import java.util.Scanner;

import static java.lang.System.out;

public class IFNilaiHurufkeIndeks {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        out.print("Masukkan nilai huruf: ");
        String nilai = sc.nextLine();

        if (nilai.equals("A")){
            out.println("Nilai indeks: 4.0");
        } else if (nilai.equals("B")){
            out.println("Nilai indeks: 3.0");
        } else if (nilai.equals("C")){
            out.println("Nilai indeks: 2.0");
        } else if (nilai.equals("D")){
            out.println("Nilai indeks: 1.0");
        } else if (nilai.equals("E")){
            out.println("Nilai indeks: 0");
        } else {
            out.println("Nilai tidak diketahui");
        }
    }
}

