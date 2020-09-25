import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        String[] tokens=line.split("\\s+");
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for (String token : tokens) {
            stack.push(Integer.parseInt(token));
        }
        while(stack.size()>0){
            System.out.print(stack.pop()+" ");
        }


    }
}
