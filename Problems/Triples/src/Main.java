import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sequence = new int[in.nextInt()];
        int triples = 0;

        for (int j = 0; j < sequence.length; j++) {
            sequence[j] = in.nextInt();
            if (j > 1) {
                if ((sequence[j - 1] - sequence[j - 2] == 1) && (sequence[j] - sequence[j -1 ] == 1)) {
                    triples++;
                }
            }

        }
        System.out.print(triples);
    }
}