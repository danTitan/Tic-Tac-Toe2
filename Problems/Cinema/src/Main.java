import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int numRows = in.nextInt();
        final int numColumns = in.nextInt();

        final int[][] matrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        final int seats = in.nextInt();

        int rowId = 0;
        int previous = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (matrix[i][j] == 0) {
                    previous++;
                    if (previous >= seats) {
                        rowId = i + 1;
                    }
                } else {
                    if (rowId == 0) {
                        previous = 0;
                    }
                }
            }
            if (rowId > 0) {
                break;
            }
            previous = 0;
        }

        System.out.println(rowId);
    }
}
