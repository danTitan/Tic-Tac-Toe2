import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sequence = in.nextLine().trim().split(" ");
        String[] rightRotation = new String[sequence.length];
        int rotation = in.nextInt();

        for (int i = 0; i < (sequence.length); i++) {
            rightRotation[(i + rotation) % sequence.length] = sequence[i];
        }

        for (String num : rightRotation) {
            System.out.print(num + " ");
        }
    }
}