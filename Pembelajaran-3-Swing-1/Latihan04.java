
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {
        Biodata data = new Biodata();

        while (true) {
            String fullname = "";

            // Input fullname
            while (true) {
                fullname = JOptionPane.showInputDialog(
                    "Masukkan nama lengkap:"
                );

                if (fullname == null) {
                    if (konfirmasiKeluar()) {
                        return;
                    }
                    continue;
                }

                if (fullname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Field fullname tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                break;
            }

            // Input usia
            int usia = 0;

            while (true) {
                String usiaInput = JOptionPane.showInputDialog(
                    "Masukkan usia:"
                );

                if (usiaInput == null) {
                    if (konfirmasiKeluar()) {
                        return;
                    }
                    continue;
                }

                if (usiaInput.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Field usia tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                try {
                    usia = Integer.parseInt(usiaInput.trim());
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Isian usia harus angka",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            // Input alamat
            String alamat = "";

            while (true) {
                alamat = JOptionPane.showInputDialog(
                    "Masukkan alamat:"
                );

                if (alamat == null) {
                    if (konfirmasiKeluar()) {
                        return;
                    }
                    continue;
                }

                if (alamat.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Field alamat tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                if (alamat.trim().length() < 10) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Masukan alamat minimum 10 karakter",
                        "Peringatan",
                        JOptionPane.WARNING_MESSAGE
                    );
                    continue;
                }

                break;
            }

            // Simpan data
            data.setBiodata(fullname, usia, alamat);

            // Tampilkan hasil
            JOptionPane.showMessageDialog(
                null,
                "Data Biodata\n"
                + "Nama Lengkap: " + data.fullname + "\n"
                + "Usia: " + data.usia + "\n"
                + "Alamat: " + data.alamat,
                "Informasi Biodata",
                JOptionPane.INFORMATION_MESSAGE
            );

            // Konfirmasi setelah data valid
            if (konfirmasiKeluar()) {
                return;
            }
        }
    }

    public static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(
            null,
            "Apakah anda ingin keluar ?",
            "Konfirmasi Keluar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        return pilihan == JOptionPane.YES_OPTION;
    }
}
