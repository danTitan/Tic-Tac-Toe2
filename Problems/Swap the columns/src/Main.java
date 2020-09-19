import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int numRows = in.nextInt();
        final int numColumns = in.nextInt();

        final int[][] matrix = new int[numRows][numColumns];
        final int[][] outputMatrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        final int sourceCol = in.nextInt();
        final int targetCol = in.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                int colId = (j == sourceCol) ? targetCol : j;
                if (targetCol == j) {
                    colId = sourceCol;
                }
                outputMatrix[i][j] = matrix[i][colId];
            }
        }

        for (int[] row: outputMatrix) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
