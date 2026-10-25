import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        String data[] = new String[field.length];

        for (int i = 0; i < field.length; i++) {
            data[i] = JOptionPane.showInputDialog(null, "Data array ke-" + i + "\nMasukan " + field[i] + ":");
        }

        String pesan = "Nama Lengkap: " + data[0] + "\n" +
                       "Alamat: " + data[1] + "\n" +
                       "No Telp: " + data[2];

        JOptionPane.showMessageDialog(null, pesan, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}