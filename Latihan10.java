import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan10 {

    static final int HARGA = 6300;
    static final Locale ID = Locale.forLanguageTag("id-ID");
    static Students myBio = new Students();

    static String rp(int angka) {
        return String.format(ID, "%,d", angka);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("                  TOKO SERBAGUNA IBIK");
        System.out.println("======================================================");

        // Nama member diambil dari class Students (soal nomor 9)
        System.out.print("Masukan nama member               : ");
        String namaMember = myBio.getFullname(scanner.nextLine());

        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = Integer.parseInt(scanner.nextLine());

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
        System.out.println("Member Name : " + myBio.Fullname);

        scanner.close();
    }
}