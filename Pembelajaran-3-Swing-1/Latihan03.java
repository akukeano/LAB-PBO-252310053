
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
            "Masukkan nama lengkap:"
        );

        if (fullname == null || fullname.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Field fullname tidak boleh kosong",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String usiaInput = JOptionPane.showInputDialog(
            "Masukkan usia:"
        );

        if (usiaInput == null || usiaInput.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Field usia tidak boleh kosong",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        int usia;

        try {
            usia = Integer.parseInt(usiaInput.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Isian usia harus angka",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String alamat = JOptionPane.showInputDialog(
            "Masukkan alamat:"
        );

        if (alamat == null || alamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Field alamat tidak boleh kosong",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        if (alamat.trim().length() < 10) {
            JOptionPane.showMessageDialog(
                null,
                "Masukan alamat minimum 10 karakter",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

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
