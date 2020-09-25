import java.util.Scanner;

public class MultiplyEvensByOdds {


    static int getMultipleOfEvensAndOdds( int number ){
        int evenSum=getSumOfEvenDigits(number);
        int oddSum=getSumOfOddDigits(number);
        return  evenSum*oddSum;
    }

    static int getSumOfEvenDigits(int digit){
        
        digit=Math.abs(digit);
        int sum=0;
        while(digit>0){
            int result=digit%10;
            if (result%2==0) {
                sum+=result;
            }
            digit=digit/10;
        }

        return sum;
        
    }

    static int getSumOfOddDigits(int digit){

        digit=Math.abs(digit);
        int sum=0;
        while(digit>0){
            int result=digit%10;
            if (result%2!=0) {
                sum+=result;
            }
            digit=digit/10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int result=getMultipleOfEvensAndOdds(a);
        System.out.println(result);

    }
}
