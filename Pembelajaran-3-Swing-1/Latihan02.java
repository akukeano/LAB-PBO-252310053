
import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
            "Masukkan nama lengkap:"
        );

        String usiaInput = JOptionPane.showInputDialog(
            "Masukkan usia:"
        );

        String alamat = JOptionPane.showInputDialog(
            "Masukkan alamat:"
        );

        int usia = Integer.parseInt(usiaInput);

        data.setBiodata(fullname, usia, alamat);

        JOptionPane.showMessageDialog(
            null,
            "Data Biodata\n"
            + "Nama Lengkap: " + data.fullname + "\n"
            + "Usia: " + data.usia + "\n"
            + "Alamat: " + data.alamat,
            "Informasi Biodata",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
