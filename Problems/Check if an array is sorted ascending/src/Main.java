import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sequence = new int[in.nextInt()];
        boolean output = true;
        int i = 0;
        while (i < sequence.length && output){
            sequence[i] = in.nextInt();
            if (i>0){
                output = sequence[i-1]<sequence[i];
            }
            i++;
        }
        System.out.print(output);
    }
}