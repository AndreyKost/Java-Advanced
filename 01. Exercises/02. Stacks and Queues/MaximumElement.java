import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        ArrayDeque<Integer> stack2=new ArrayDeque<>();
        while (N>0){
            String line=scanner.nextLine();
            if(line.charAt(0)=='1'){
                String[] tokens=line.split("\\s+");
                int num=Integer.parseInt(tokens[1]);
                stack.push(num);
            } else if(line.charAt(0)=='2'){
                stack.pop();
            } else {
                int max=Integer.MIN_VALUE;
                while (stack.size()>0){
                    int digit=stack.pop();
                    stack2.push(digit);
                    if(digit>max){
                        max=digit;
                    }
                }
                System.out.println(max);
                while (stack2.size()>0){
                    int digit=stack2.pop();
                    stack.push(digit);
                }
            }
            N--;
        }


    }
}
