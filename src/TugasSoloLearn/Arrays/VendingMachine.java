package TugasSoloLearn.Arrays;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here

        int pilihan;
        if(sc.hasNextInt()){
            pilihan = sc.nextInt();

            if(pilihan >=0 && pilihan <menu.length){
                String memilihMinuman = menu[pilihan];
                System.out.println(memilihMinuman);
            } else {
                System.out.println("Invalid");
            }
        }else {
            System.out.println("Tidak Valid, Silahkan Masukkan Angka yang Benar");
        }
    }
}
