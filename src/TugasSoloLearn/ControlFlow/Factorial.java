package TugasSoloLearn.ControlFlow;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int fact = 1;
        for(int x=1; x<=angka; x++) {
            fact *=x;
        }
        System.out.println(fact);
    }
}
