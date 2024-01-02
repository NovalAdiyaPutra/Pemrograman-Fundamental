package UAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formganjil {
    private JPanel Main;
    private JButton button1;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public JPanel getPanelMain(){
        return Main;
    }

    public formganjil(){

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ganjil abc = new ganjil();

                textArea1.setText("Total 1+3+5+..+99 : " +abc.getJumlah());
                textArea2.setText(abc.getTampilan());
            }
        });
    }
}
