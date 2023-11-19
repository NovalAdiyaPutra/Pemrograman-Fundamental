package TugasSoloLearn.ControlFlow;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int suhu = sc.nextInt();
        if (suhu>=100){
            System.out.println("Boiling");
        }else{
            System.out.println("Not boiling");
        }
    }
}
