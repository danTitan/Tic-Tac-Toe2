import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int width = in.nextInt();
        String[][] matrix = new String[width][width];
        String cellValue;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == (width - 1) / 2) || (j == (width - 1) / 2)
                        || i == j || i + j == (width - 1)) {
                    cellValue = "*";
                } else {
                    cellValue = ".";
                }
                matrix[i][j] = cellValue;
            }
        }

        for (String[] row: matrix) {
            for (String cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }
}
