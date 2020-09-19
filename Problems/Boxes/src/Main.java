import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        int[] firstBox = new int[size];
        for (int i = 0; i < size; i++) {
            firstBox[i] = sc.nextInt();
        }
        int[] secondBox = new int[size];
        for (int i = 0; i < size; i++) {
            secondBox[i] = sc.nextInt();
        }
        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        boolean isEqual = firstBox[0] == secondBox[0] && firstBox[1] == secondBox[1] && firstBox[2] == secondBox[2];
        boolean isGreater = firstBox[0] >= secondBox[0] && firstBox[1] >= secondBox[1] && firstBox[2] >= secondBox[2];
        boolean isLess = firstBox[0] <= secondBox[0] && firstBox[1] <= secondBox[1] && firstBox[2] <= secondBox[2];

        if (isEqual) {
            System.out.println("Box 1 = Box 2");
        } else if (isGreater) {
            System.out.println("Box 1 > Box 2");
        } else if (isLess) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}
