import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        String inputJumlah = JOptionPane.showInputDialog(null, "Masukan jumlah array:");
        int jumlah = Integer.parseInt(inputJumlah);
        
        int nilai[] = new int[jumlah];
        String output = "";

        for (int i = 0; i < jumlah; i++) {
            String inputAngka = JOptionPane.showInputDialog(null, "Data array ke-" + i + "\nMasukan angka:");
            nilai[i] = Integer.parseInt(inputAngka);
        }

        int max = nilai[0];
        int min = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            output += "x[" + i + "]=" + nilai[i] + "\n";
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }

        output += "Nilai terbesar adalah " + max + "\n";
        output += "Nilai terkecil adalah " + min;

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}