import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] tab = new int[n];
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();

        }

        for (int i = 0; i < tab.length; i++) {
                sum=  sum+tab[i];
        }
        System.out.println(sum);
    }
}