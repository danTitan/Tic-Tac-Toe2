import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[scanner.nextInt()];
        int min = Integer.MIN_VALUE;
        int idx =-1;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (min < array[i]) {
                min = array[i];
                idx=(i);
            }
        }

        System.out.println(idx);
    }
}