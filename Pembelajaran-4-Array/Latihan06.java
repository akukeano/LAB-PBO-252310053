import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];

        JOptionPane.showMessageDialog(null, "Input untuk Matrix A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matrix A [" + i + "][" + j + "]:"));
            }
        }

        JOptionPane.showMessageDialog(null, "Input untuk Matrix B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matrix B [" + i + "][" + j + "]:"));
            }
        }

        String output = "Matrix A:\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output += matrixA[i][j] + " ";
            }
            output += "\n";
        }

        output += "\nMatrix B:\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output += matrixB[i][j] + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Hasil Matrix 2x2", JOptionPane.INFORMATION_MESSAGE);
    }
}