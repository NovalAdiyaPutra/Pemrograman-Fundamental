package TugasSoloLearn.Methods;

import java.util.Scanner;

public class Bot {
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again".
    */
    public static void bot() {
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        if (userinput == 1) {
            System.out.println("Order confirmed");
        } else if (userinput == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
        sc.close();
    }
    public static void main(String[] args) {
        bot();
    }
}
