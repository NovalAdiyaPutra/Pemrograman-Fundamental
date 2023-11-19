package TugasSoloLearn.ControlFlow;

import  java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner (System.in);
        String warna = sc.nextLine();

        int angkaboxs;

        switch(warna){
            case "red":
                angkaboxs = 1;
                break;
            case "green":
                angkaboxs = 2;
                break;
            case "black":
                angkaboxs = 3;
                break;
            default:
                angkaboxs = -1;
                break;
        }
        if (angkaboxs != -1) {
            System.out.println(angkaboxs);
        } else {
            System.out.println("tidak diketahui");
        }
    }
}
