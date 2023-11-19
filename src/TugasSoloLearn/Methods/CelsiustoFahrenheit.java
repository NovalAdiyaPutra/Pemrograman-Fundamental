package TugasSoloLearn.Methods;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    //your code goes here
    static double fahr (double celcius){
        double fahrenheit = 1.8 * celcius + 32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}
