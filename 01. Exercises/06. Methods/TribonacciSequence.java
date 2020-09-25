import java.util.Scanner;

public class TribonacciSequence {

    static int printTribRec(int n){
        if(n==1 || n==2){
            return 1;
        }
        if(n==3){
            return 2;
        } else {
            return printTribRec(n-1) + printTribRec(n-2) + printTribRec(n-3);
        }
    }

    static void printTrib(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.printf("%d ",printTribRec(i));
        }
    }


    /*static void printTribonacci(int n){
        for(int i=1;i <=n;i++) {
            if (i == 1 || i == 2) {
                System.out.print(1 + " ");
            } else if (i == 3) {
                System.out.print(2 + " ");
            } else {
                System.out.printf("%d ",((i-1)+(i-2)+(i-3)));
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printTrib(n);

    }
}
