import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int size = in.nextInt();
        final int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.abs(i - j);
            }
        }

        for (int[] row: matrix) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}