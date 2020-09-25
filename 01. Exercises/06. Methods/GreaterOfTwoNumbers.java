
import java.util.Scanner;

public class GreaterOfTwoNumbers {


    static int printMax( int a,  int b){
        if (a >=b) {
            return a;
        }

        return b;

    }

    static char printMax( char a, char b){

        if (a>=b) {
            return a;
        }

        return b;

    }

    static String printMax( String a, String b){

        if (a.compareTo(b) >=0 ) {
            return a;
        }

        return b;

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String symbol=scanner.nextLine();

        if(symbol.equals("int")) {

            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int result = printMax(a, b);
            System.out.println(result);

        } else if (symbol.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            char result1 = printMax(a, b);

            System.out.println(result1);
        } else if(symbol.equals("string")) {
            String a=scanner.nextLine();
            String b=scanner.nextLine();
            String result=printMax(a,b);

            System.out.println(result);
        }

    }
}
