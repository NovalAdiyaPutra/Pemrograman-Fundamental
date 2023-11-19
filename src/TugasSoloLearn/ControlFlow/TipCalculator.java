package TugasSoloLearn.ControlFlow;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        System.out.println(bill*15/100);
    }
}
