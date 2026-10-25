import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {
    public static void main(String[] args) {
        String inputJumlah = JOptionPane.showInputDialog(null, "Masukan jumlah data ArrayList:");
        int jumlah = Integer.parseInt(inputJumlah);
        
        ArrayList<Integer> nilaiList = new ArrayList<Integer>();
        String output = "";

        for (int i = 0; i < jumlah; i++) {
            String inputAngka = JOptionPane.showInputDialog(null, "Data ArrayList ke-" + i + "\nMasukan angka:");
            nilaiList.add(Integer.parseInt(inputAngka));
        }

        int max = nilaiList.get(0);
        int min = nilaiList.get(0);

        for (int i = 0; i < nilaiList.size(); i++) {
            int val = nilaiList.get(i);
            output += "x[" + i + "]=" + val + "\n";
            if (val > max) max = val;
            if (val < min) min = val;
        }

        output += "Nilai terbesar adalah " + max + "\n";
        output += "Nilai terkecil adalah " + min;

        JOptionPane.showMessageDialog(null, output, "Output ArrayList", JOptionPane.INFORMATION_MESSAGE);
    }
}