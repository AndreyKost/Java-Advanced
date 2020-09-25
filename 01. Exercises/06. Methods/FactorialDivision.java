import java.util.Scanner;

public class FactorialDivision {

    static double getFactorial(int a, int b){
        long factorial1=1;
        long factorial2=1;

            for (int i = 1; i <= a; i++) {
                factorial1 = factorial1 * i;
            }
            for (int i = 1; i <= b; i++) {
                factorial2 = factorial2 * i;
            }

            double division = factorial1 * 1.0 / factorial2 * 1.0;
            return division;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        double devision=getFactorial(a,b);
        System.out.printf("%.2f",devision);

    }
}
