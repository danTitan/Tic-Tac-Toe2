import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int dimension = in.nextInt();
        int[][] spiralArray = new int[dimension][dimension];

        int numConcentricSquares = (int) Math.ceil((dimension) / 2.0);

        int j;
        int sideLen = dimension;
        int currNum = 1;

        for (int i = 0; i < numConcentricSquares; i++) {
            // do top side
            for (j = 0; j < sideLen; j++) {
                spiralArray[i][i + j] = currNum++;
            }

            // do right side
            for (j = 1; j < sideLen; j++) {
                spiralArray[i + j][dimension - 1 - i] = currNum++;
            }

            // do bottom side
            for (j = sideLen - 2; j > -1; j--) {
                spiralArray[dimension - 1 - i][i + j] = currNum++;
            }

            // do left side
            for (j = sideLen - 2; j > 0; j--) {
                spiralArray[i + j][i] = currNum++;
            }

            sideLen -= 2;
        }

        for (int[] row : spiralArray) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
