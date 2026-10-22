
import javax.swing.JOptionPane;

public class SwingMessageDialog {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(
            null,
            "Selamat datang di Java Swing!"
        );

        JOptionPane.showMessageDialog(
            null,
            "Data berhasil disimpan.",
            "Informasi",
            JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Harap periksa kembali data Anda.",
            "Peringatan",
            JOptionPane.WARNING_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Terjadi kesalahan pada program.",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Apakah Anda ingin melanjutkan?",
            "Pertanyaan",
            JOptionPane.QUESTION_MESSAGE
        );
    }
}
