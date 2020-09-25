import java.util.Scanner;

public class AddAndSubtract {

    static int getSum(int a, int b){
        int sum=a+b;
        return sum;
    }

    static int getDifference(int a, int b){
        int difference=a-b;
        return difference;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        int sum=getSum(a,b);
        int difference=getDifference(sum,c);
        System.out.println(difference);
    }
}
