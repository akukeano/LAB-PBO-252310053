import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] matrixC = new int[2][2];

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

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        String output = "Hasil Matrix C (A + B):\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output += matrixC[i][j] + "   ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Output Matrix C", JOptionPane.INFORMATION_MESSAGE);
    }
}