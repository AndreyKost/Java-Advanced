import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    static double printPow(double number,int power){
    double result=0;

    result=Math.pow(number,power);
    return result;

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number=Double.parseDouble(scanner.nextLine());
        int power=Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(printPow(number,power)));



    }
}
