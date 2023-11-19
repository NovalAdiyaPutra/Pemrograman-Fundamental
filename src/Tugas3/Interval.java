package Tugas3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan minimal");
        int minimal = sc.nextInt();

        System.out.println("masukkan maksimal");
        int maksimal = sc.nextInt();

        System.out.println("masukkan interval");
        int interval = sc.nextInt();

        int i = 1;
        int sum = 0;

        int n = (maksimal-minimal)/interval;

        if ((maksimal - minimal) % interval != 0) {
            System.out.println("Invalid interval");
        } else {
            while(i <= n){
                sum += minimal;
                minimal += interval;
                i += 1;
            }
            System.out.println("Sum: " + sum);
        }
    }
}
