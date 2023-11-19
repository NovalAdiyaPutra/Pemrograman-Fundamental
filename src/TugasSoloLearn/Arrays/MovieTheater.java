package TugasSoloLearn.Arrays;

import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        //your code goes here

        int baris = sc.nextInt();
        int kolom = sc.nextInt();
        if (baris >= 0 && baris < seats.length && kolom >= 0 && kolom < seats[baris].length){
            if (seats[baris][kolom]==0){
                System.out.println("Free");
            } else {
                System.out.println("Sold");
            }
        } else {
            System.out.println("Tidak Valid");
        }

        sc.close();
    }
}
