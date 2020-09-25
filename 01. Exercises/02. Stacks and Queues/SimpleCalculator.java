import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        String line=scanner.nextLine();
        String[] tokens=line.split("\\s+");
        stack.push(Integer.parseInt(tokens[0]));
        for (int i = 1; i <tokens.length ; i+=2) {
            String str=tokens[i]+tokens[i+1];
            stack.push(Integer.parseInt(str));
        }
        int sum=0;
        while(stack.size()>0){
            sum+=stack.pop();
        }
        System.out.println(sum);

    }
}
