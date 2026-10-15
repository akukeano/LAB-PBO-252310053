import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = scanner.nextLine();

        // Ganti semua huruf vokal (besar/kecil) menjadi X
        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}
