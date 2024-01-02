package UAS;

import javax.swing.*;

public class run {
    public static void main(String[] args) {
        JFrame app = new JFrame("Angka Ganjil");
        app.setContentPane(new formganjil().getPanelMain());
        app.setSize(1920, 1000);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
