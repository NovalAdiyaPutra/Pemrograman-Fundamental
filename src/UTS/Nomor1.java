package UTS;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 :");
        double nilai1 = sc.nextInt();
        System.out.print("Masukkan nilai 2 :");
        double nilai2 = sc.nextInt();
        System.out.print("Masukkan nilai 3 :");
        double nilai3 = sc.nextInt();
        System.out.print("Masukkan nilai 4 :");
        double nilai4 = sc.nextInt();

        double ratarata = (nilai1+nilai2+nilai3+nilai4)/4;
        System.out.println("rata-rata : "+ratarata);
    }
}
