import java.util.Scanner;

public class TopNumber {


    static void printTopNumber(int n){

        for(int i=1;i<=n;i++){
            int sum=0;
            int result=i;
            int count=0;
            while (result>0){
                int result2=result%10;
                if(result2%2!=0){
                    count++;
                }
                sum+=result2;
                result=result/10;
            }
            if(sum%8==0 && count!=0){
                System.out.println(i);
            }

        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printTopNumber(n);

    }
}
