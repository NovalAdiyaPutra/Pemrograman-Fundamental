package Chapter7;

import static java.lang.System.out;

public class UseAccount {
    public static void main (String [] args){
        Account myAccount;
        Account yourAccount;

        myAccount = new Account(); //instance memmbuat object baru dari sebuah class
        yourAccount = new Account();

        myAccount.name = "Noval";
        myAccount.address = "sukakarya";
        myAccount.balance = 24.02;

        yourAccount.name = "Shofie";
        yourAccount.address = "balam";
        yourAccount.balance = 55.63;

        /*
        out.print(myAccount.name);
        out.print(" (");
        out.print(myAccount.address);
        out.print(") has $");
        out.print(myAccount.balance);
        out.println();
        out.print(yourAccount.name);
        out.print(" (");
        out.print(yourAccount.address);
        out.print(") has $");
        out.print(yourAccount.balance);
         */

        myAccount.display();

        out.print(" plus $ ");
        out.print(myAccount.getInterest(5.00));
        out.println(" interest ");

        yourAccount.display();

        double yourInterestRate = 7.00;
        out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" interest ");
    }
}
