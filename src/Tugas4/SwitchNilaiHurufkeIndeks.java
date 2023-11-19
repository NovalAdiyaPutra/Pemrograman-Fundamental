package Tugas4;

import static java.lang.System.out;
import java.util.Scanner;

public class SwitchNilaiHurufkeIndeks {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        out.print("Masukkan nilai huruf: ");
        String nilai = sc.nextLine();

        switch (nilai){
            case "A":
                out.println("Nilai indeks 4.0");
                break;
            case "B":
                out.println("Nilai indeks 3.0");
                break;
            case "C":
                out.println("Nilai indeks 2.0");
                break;
            case "D":
                out.println("Nilai indeks 1.0");
                break;
            case "E":
                out.println("Nilai indeks 0");
                break;
            default:
                out.println("Niali tidak diketahui");
                break;
        }
        sc.close();
    }
}
