import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElems = in.nextInt();
        int[] sequence = new int[numElems];

        for (int i = 0; i < (numElems-1); i++) {
            sequence[i+1] = in.nextInt();
        }
        sequence[0] = in.nextInt();
        for (int j : sequence) {
            System.out.print(j+" ");
        }
    }
}