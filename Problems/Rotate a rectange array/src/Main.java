import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int numRows = in.nextInt();
        final int numColumns = in.nextInt();

        final int[][] matrix = new int[numRows][numColumns];
        final int[][] outputMatrix = new int[numColumns][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                int outputRow = j;
                int outputColumnn = numRows - 1 - i;
                outputMatrix[outputRow][outputColumnn] = matrix[i][j];
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
