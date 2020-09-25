import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        String[] tokens=scanner.nextLine().split("\\s+");
        int N=Integer.parseInt(tokens[0]);
        int S=Integer.parseInt(tokens[1]);
        int X=Integer.parseInt(tokens[2]);
        String[] tokens2=scanner.nextLine().split("\\s+");
        for (int i = 0; i <N ; i++) {
            queue.add(Integer.parseInt(tokens2[i]));
        }
        for (int i = 0; i <S ; i++) {
            queue.poll();
        }
        if(queue.size()>0) {
            if (queue.contains(X)) {
                System.out.println("true");
            } else {
                int min = Integer.MAX_VALUE;
                while (queue.size() > 0) {
                    int n = queue.poll();
                    if (n < min) {
                        min = n;
                    }
                }
                System.out.println(min);
            }
        } else {
            System.out.println(0);
        }



    }
}
