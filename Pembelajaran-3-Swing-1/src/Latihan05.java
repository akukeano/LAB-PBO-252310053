import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String teks = scanner.nextLine();

        String hurufBesar = teks.toUpperCase();
        System.out.println("Hasil huruf besar: " + hurufBesar);

        scanner.close();
    }
}
