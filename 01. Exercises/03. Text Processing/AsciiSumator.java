import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        String line=scanner.nextLine();


        int sum=0;
        for (int i = 0; i <line.length() ; i++) {
            if(line.charAt(i)>s1.charAt(0) && line.charAt(i)<s2.charAt(0)){
                sum+=line.charAt(i);
            }
        }

        System.out.println(sum);

    }
}
