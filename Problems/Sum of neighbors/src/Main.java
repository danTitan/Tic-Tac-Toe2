import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder concatenate = new StringBuilder();
        String line;
        int rows = 0;

        while (in.hasNext()) {
            line = in.nextLine();
            if ( line.equals("end")) {
                break;
            } else {
                concatenate.append(line).append("#");
                rows++;
            }
        }

        String[] lines = concatenate.toString().split("#");

        final int columns = lines[0].split(" ").length;
        final int[][] matrix = new int[rows][columns];

        int i = 0;
        int j = 0;

        for (String l : lines) {
            for (String number : l.split(" ")) {
                matrix[i][j] = Integer.parseInt(number);
                j++;
            }
            j = 0;
            i++;
        }

        final int [][] solution = new int[rows][columns];
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                int row, column;
                int aux = 0;
                //(i-1, j)
                row = (k - 1 + rows) % rows;
                column = l % columns;
                aux = aux + matrix[row][column];
                // (i+1, j)
                row = (k + 1 + rows) % rows;
                column = l % columns;
                aux = aux + matrix[row][column];
                // (i, j-1)
                row = (k ) % rows;
                column = (l - 1 + columns) % columns;
                aux = aux + matrix[row][column];
                // (i, j+1)
                row = (k ) % rows;
                column = (l + 1 + columns) % columns;
                aux = aux + matrix[row][column];
                solution[k][l] = aux ;
            }
        }

        for (int[] vector : solution) {
            System.out.println(Arrays.toString(vector).replace("[","").replace(","," ").replace("]",""));
        }
    }
}
