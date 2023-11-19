package Tugas2;

import java.util.Scanner;

import static java.lang.System.out;

public class Authenticator {
    public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    out.println("username: ");
    String username = keyboard.next();

    if (username.equals("bburd")){
        out.println("Password: ");
        String password = keyboard.next();

        if (password.equals("swordfish")){
            out.println("You are in, ");
        }else {
            out.println("Incorrect password");
        }
    }else {
        out.println("Unknown user");
    }
    keyboard.close();
    }
}


