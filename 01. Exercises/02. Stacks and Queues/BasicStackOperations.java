import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] commands=scanner.nextLine().split("\\s+");
        int N=Integer.parseInt(commands[0]);
        int S=Integer.parseInt(commands[1]);
        int X=Integer.parseInt(commands[2]);
        String[] tokens=scanner.nextLine().split("\\s+");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for (int i = 0; i <N ; i++) {
            stack.push(numbers.get(i));
        }
        while (S>0){
            stack.pop();
            S--;
        }
        if(stack.size()>0){
            if(stack.contains(X)){
                System.out.println("true");
            } else {
                int min=Integer.MAX_VALUE;
                while (stack.size()>0){
                    int m=stack.pop();
                    if(m<min){
                        min=m;
                    }
                }
                System.out.println(min);
            }
        } else {
            System.out.println(0);
        }



    }
}
