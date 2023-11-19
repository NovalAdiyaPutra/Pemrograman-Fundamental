package Tugas3;

import java.util.Scanner;

public class RatingMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rating Makanan Restoran Mawar : ");
        System.out.println("Rating Makanan");
        int rating = sc.nextInt();

        if (rating >=8 && rating <=10) {
            System.out.println("Enak");

        } else if (rating >=6 && rating <=7) {
            System.out.println("Biasa Saja");

        } else if (rating >=0 && rating <=5) {
            System.out.println("Tidak Enak");

        } else {
            System.out.println("Tidak Valid");
        }
    }
}
