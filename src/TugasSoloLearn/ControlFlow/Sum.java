package TugasSoloLearn.ControlFlow;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i ;
        }
        System.out.println(sum);
    }
}