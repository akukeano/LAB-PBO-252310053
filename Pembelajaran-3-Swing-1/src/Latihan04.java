import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan04 {

    static final int HARGA = 6300;
    static final Locale ID = Locale.forLanguageTag("id-ID");

    // Format angka ala Indonesia: 44100 -> 44.100
    static String rp(int angka) {
        return String.format(ID, "%,d", angka);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("                  TOKO SERBAGUNA IBIK");
        System.out.println("======================================================");
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = scanner.nextInt();

        // Diskon 5% untuk setiap kelipatan 3 (7 item -> 2 kelipatan -> 10%)
        int diskonPersen = (qty / 3) * 5;
        if (diskonPersen > 100) {
            diskonPersen = 100;
        }

        int total = qty * HARGA;
        int potongan = total * diskonPersen / 100;
        int subTotal = total - potongan;

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", ID);
        String waktu = LocalDateTime.now().format(format);

        System.out.println(waktu);
        System.out.println("ITEM          QTY    HARGA          TOTAL");
        System.out.println("======================================================");
        System.out.println("ROTI ENAK     " + qty + "      Rp " + rp(HARGA) + ",-    Rp " + rp(total));
        System.out.println("------------------------------------------------------");
        System.out.println("Diskon    : " + diskonPersen + "%");
        System.out.println("Sub Total : Rp " + rp(subTotal) + ",-");

        scanner.close();
    }
}