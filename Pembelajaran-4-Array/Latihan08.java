import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
            {"Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "JL Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

        String output = "=== Data Mahasiswa / Warga ===\n\n";
        for (int i = 0; i < dataMahasiswa.length; i++) {
            output += "Data ke-" + i + "\n";
            output += "Nama Lengkap : " + dataMahasiswa[i][0] + "\n";
            output += "Alamat       : " + dataMahasiswa[i][1] + "\n";
            output += "No Telp      : " + dataMahasiswa[i][2] + "\n\n";
        }

        JOptionPane.showMessageDialog(null, output, "Latihan 08 - Array Multidimensi", JOptionPane.INFORMATION_MESSAGE);
    }
}