import java.util.Scanner;

// NPM berakhiran ganjil (3): Kerucut dan Tabung
public class Latihan03 {

    // Class variable (static, di luar method)
    static double PI = Math.PI;

    // ===== KERUCUT =====
    // Method dengan nilai balik
    static double garisPelukis(double r, double t) {
        double s = Math.sqrt(r * r + t * t); // local variable
        return s;
    }

    static double kelilingAlasKerucut(double r) {
        return 2 * PI * r;
    }

    static double luasPermukaanKerucut(double r, double t) {
        double s = garisPelukis(r, t);
        return PI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }

    // ===== TABUNG =====
    // Method tanpa nilai balik (void)
    static void hitungTabung(double r, double t) {
        double keliling = 2 * PI * r;
        double luasPermukaan = 2 * PI * r * (r + t);
        double volume = PI * r * r * t;

        System.out.println("Keliling alas        : " + keliling);
        System.out.println("Luas permukaan tabung: " + luasPermukaan);
        System.out.println("Volume tabung        : " + volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KERUCUT ===");
        System.out.print("Masukkan jari-jari (r): ");
        double r = scanner.nextDouble();
        System.out.print("Masukkan tinggi (t)   : ");
        double t = scanner.nextDouble();

        System.out.println("Garis pelukis        : " + garisPelukis(r, t));
        System.out.println("Keliling alas        : " + kelilingAlasKerucut(r));
        System.out.println("Luas permukaan       : " + luasPermukaanKerucut(r, t));
        System.out.println("Volume               : " + volumeKerucut(r, t));

        System.out.println();
        System.out.println("=== TABUNG ===");
        System.out.print("Masukkan jari-jari (r): ");
        double rTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi (t)   : ");
        double tTabung = scanner.nextDouble();
        hitungTabung(rTabung, tTabung);

        scanner.close();
    }
}