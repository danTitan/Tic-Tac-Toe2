import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfCompanies=in.nextInt();
        int[] incomes = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            incomes[i] = in.nextInt();
        }

        int[] taxes = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            taxes[i] = in.nextInt();
        }
        double maxPayment = 0;
        int idxCompany = 0;

        for (int i = 0; i < numberOfCompanies; i++) {
            double aux = (incomes[i] * taxes[i]) ;
            if (aux>maxPayment) {
                maxPayment = aux;
                idxCompany= i + 1;
            }
        }
        System.out.println(idxCompany);
    }
}