import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sequence = new int[in.nextInt()];
        int count = 0;
        int max = 1;
        //one loop to fill and read the array
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = in.nextInt();
            if (i > 0) {
                if (sequence[i] > sequence[i - 1]) {
                    count = count > 0 ? count + 1 : count + 2;
                } else {
                    max = max > count ? max : count;
                    count = 0;
                }
            }
        }
        System.out.print(max > count ? max : count);
    }
}