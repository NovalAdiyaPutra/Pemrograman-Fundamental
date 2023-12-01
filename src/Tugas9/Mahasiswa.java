package Tugas9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa extends JFrame {
    private JPanel panelMain;
    private JTextField textFieldNama;
    private JComboBox cbbln;
    private JComboBox cbthn;
    private JButton tombol;
    private JComboBox cbtgl;
    private JTextArea textnama;
    private JTextArea texttgl;
    private JTextArea alamat;
    private JTextArea textalamat;
    private JTextArea textusia;

    public Mahasiswa () {
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        tombol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                int tanggal = Integer.parseInt((String) cbtgl.getSelectedItem());
                int bulan = cbbln.getSelectedIndex() + 1;
                int tahun = Integer.parseInt((String) cbthn.getSelectedItem());
                String address = alamat.getText();

                textnama.setText("Nama : " +nama);
                texttgl.setText("Tanggal Lahir : " + tanggal + " " + bulan + " "+ tahun);
                textalamat.setText("alamat : " +address);

                LocalDate birthdate = LocalDate.of(tahun, bulan, tanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                textusia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa Mahasiswa = new Mahasiswa();
        Mahasiswa.setVisible(true);
    }


}
