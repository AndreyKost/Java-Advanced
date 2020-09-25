import java.util.Scanner;

public class MathOperations {


    static double calculate(int a, String operator, int b){

        double result=0;
        if (operator.equals("/")) {
            if(b!=0) {
                result = a / b;
            }
        }
        if (operator.equals("*")) {
            result=a*b;
        }
        if (operator.equals("+")) {
            result=a+b;
        }
        if (operator.equals("-")) {
            result=a-b;
        }

        return  result;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        String operation=scanner.nextLine();
        int b=Integer.parseInt(scanner.nextLine());
        double result=calculate(a,operation,b);
        System.out.printf("%.0f",result);

    }
}
