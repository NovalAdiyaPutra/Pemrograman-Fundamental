package UTS;
import java.util.Scanner;
public class Nomor2{
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Jumlah data : ");
            int size = sc.nextInt();
            int [] data = new int[size];

            for(int i = 0; i < size; i++){
                System.out.print("data ke- " + (i+1) + " : ");
                data[i] = sc.nextInt();
            }

            System.out.println("Isi data Bilangan Ganjil dan Genap:");

            int total = 0;
            for (int i = 0; i < data.length; i++) {
                System.out.print("Data ke-" + data[i] + ": " );
                if (data[i] % 2 == 0) {
                    System.out.println("Genap");
                } else {
                    System.out.println("Ganjil");
                }
                total += data[i];
            }
            int jumlah = 0;
            for (int i = 0; i < data.length; i++) {
                jumlah += data[i];
            }

            double rataRata = jumlah / size;
            System.out.println("jumlah : " +jumlah);
            System.out.println("rata-rata : "+rataRata);
            sc.close();
        }
    }
