import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[scanner.nextInt()];
        int max = Integer.MIN_VALUE;
        int idx =-1;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if(i>0 && i<array.length){
                int aux = array[i]*array[i-1];
                if (aux> max) max= aux;
            }
        }

        System.out.println(max);
    }
}