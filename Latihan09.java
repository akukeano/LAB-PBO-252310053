import java.util.Scanner;

public class Latihan09 {
    static Students myBio = new Students();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NPM       : ");
        Integer npm = myBio.getNPM(Integer.parseInt(scanner.nextLine()));

        System.out.print("Masukkan Fullname  : ");
        String fullname = myBio.getFullname(scanner.nextLine());

        System.out.print("Masukkan ClassName : ");
        String className = myBio.getClassName(scanner.nextLine());

        System.out.print("Masukkan Semester  : ");
        Integer semester = myBio.getSemester(Integer.parseInt(scanner.nextLine()));

        System.out.print("Masukkan GPA       : ");
        Float gpa = myBio.getGPA(Float.parseFloat(scanner.nextLine()));

        System.out.println();
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM       : " + npm);
        System.out.println("Fullname  : " + fullname);
        System.out.println("ClassName : " + className);
        System.out.println("Semester  : " + semester);
        System.out.println("GPA       : " + gpa);

        scanner.close();
    }
}