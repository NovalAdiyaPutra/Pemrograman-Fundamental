package Tugas2;

import javax.swing.JOptionPane;
public class Authenticator1 {
        public static void main(String[] args) {
            String username = JOptionPane.showInputDialog("Username:");
            String password = JOptionPane.showInputDialog("Password:");

            if	( username != null && password != null
                    &&	(
                    (username.equals("noval") && password.equals("pastibisa")) ||
                            (username.equals("adiya") && password.equals("semangat"))
            )
            )
            {
                JOptionPane.showMessageDialog(null,"You're in");
            }	else {
                JOptionPane.showMessageDialog(null,"You're suspicious");
            }
        }
    }

