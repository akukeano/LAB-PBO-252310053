import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        String inputJumlah = JOptionPane.showInputDialog(null, "Masukan jumlah array:");
        int jumlah = Integer.parseInt(inputJumlah);
        
        int nilai[] = new int[jumlah];
        String output = "";

        for (int i = 0; i < jumlah; i++) {
            String inputAngka = JOptionPane.showInputDialog(null, "Data array ke-" + i + "\nMasukan angka:");
            nilai[i] = Integer.parseInt(inputAngka);
        }

        for (int i = 0; i < jumlah; i++) {
            output += "x[" + i + "]=" + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}