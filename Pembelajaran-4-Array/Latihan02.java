public class Latihan02 {
    public static void main(String[] args) {
        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = (i + 1) * 5; 
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("ages[" + i + "] = " + ages[i]);
        }
    }
}