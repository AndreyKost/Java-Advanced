import java.util.Scanner;

public class SignOfInteger {

    static void printSignOfInteger (int a){
        if(a>0){
            System.out.printf("The number %d is positive.",a);
        }  else if(a<0){
            System.out.printf("The number %d is negative.",a);
        } else {
            System.out.printf("The number %d is zero.",a);
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        printSignOfInteger(Integer.parseInt(scanner.nextLine()));

    }


}
