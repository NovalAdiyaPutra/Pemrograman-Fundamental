package UAS;

public class ganjil {
    int angka;

    public int getAngka() {
        return angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public int getJumlah() {
        int a1 = 1;
        int an = 99;
        int sum = 2500;
        int n = 2 * sum / (a1 + an);

        int jumlah = 0;
        for (int i = a1; i <= an; i += 2) {
            jumlah += i;
        }

        return jumlah;
    }

    public String getTampilan(){
            StringBuilder result = new StringBuilder();
            int jumlah = 0;
            int currentValue = 1;

            for (int i = 0; i < 50; i++) {
                result.append(currentValue).append("\n");
                jumlah += currentValue;
                currentValue += 2;
            }
            return result.toString();
        }

    }

