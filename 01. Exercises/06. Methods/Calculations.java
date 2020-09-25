import java.util.Scanner;

public class Calculations {

    static void printCalculations(String action,int a,int b){
        int sum=0;

        if(action.equals("add")){
            sum=a+b;
        }
        if(action.equals("multiply")){
            sum=a*b;
        }
        if (action.equals("subtract")) {
            sum=a-b;
        }
        if(action.equals("divide")){
            sum=a/b;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String action=scanner.nextLine();
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        printCalculations(action,a,b);
    }
}
