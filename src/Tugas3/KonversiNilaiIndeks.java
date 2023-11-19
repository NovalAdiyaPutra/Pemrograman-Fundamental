package Tugas3;

import java.util.Scanner;

public class KonversiNilaiIndeks {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
        double nilai = sc.nextDouble();
        double indeks = 4.0*(nilai/100);

        if(nilai>=0 && nilai <=100){
            System.out.println("Nilai indeks:" +indeks);
        } if(nilai>=80 && nilai<100) {
            System.out.println("Nilai A");
        }else if(nilai>=70 && nilai<80) {
            System.out.println("Nilai B");
        }else if(nilai>=60 && nilai<70) {
            System.out.println("Nilai C");
        }else if(nilai>=50 && nilai<60) {
            System.out.println("Nilai D");
        }else if(nilai>=0 && nilai<50) {
            System.out.println("Nilai E");
        }else{
            System.out.println("inputan nilai salah");
        }
    }
}
