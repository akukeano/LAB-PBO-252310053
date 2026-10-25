import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {
    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<String> dataList = new ArrayList<String>();

        for (int i = 0; i < field.length; i++) {
            String inputVal = JOptionPane.showInputDialog(null, "Masukan " + field[i] + ":");
            dataList.add(inputVal);
        }

        String pesan = "Nama Lengkap: " + dataList.get(0) + "\n" +
                       "Alamat: " + dataList.get(1) + "\n" +
                       "No Telp: " + dataList.get(2);

        JOptionPane.showMessageDialog(null, pesan, "Message ArrayList", JOptionPane.INFORMATION_MESSAGE);
    }
}