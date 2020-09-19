import java.util.Scanner;

class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];  // creating an array with the specified length
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        final int max = scanner.nextInt();
        int total = 0;
        for (int aux:array){
            if (aux>max){
                total += aux;
            }
        }
        System.out.println(total);
    }
}