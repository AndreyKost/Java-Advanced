import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String left[]=scanner.nextLine().split(" ");
        String right[]=scanner.nextLine().split(" ");
        ArrayDeque<Integer> stackLeft=new ArrayDeque<>();
        ArrayDeque<Integer> queueRight=new ArrayDeque<>();
        ArrayList<Integer> pairSocks=new ArrayList<>();

        for (String l : left) {
            stackLeft.push(Integer.parseInt(l));
        }
        for (String r : right) {
            queueRight.offer(Integer.parseInt(r));
        }

        while (stackLeft.size()!=0 && queueRight.size()!=0){
            int leftOne=stackLeft.pop();
            int rightOne=queueRight.poll();

            if(leftOne>rightOne){
                int sum=leftOne+rightOne;
                pairSocks.add(sum);
            } else if(leftOne< rightOne){
                queueRight.addFirst(rightOne);
            } else {
                leftOne++;
                stackLeft.push(leftOne);
            }

        }

        int max= Integer.MIN_VALUE;
        for (int i = 0; i <pairSocks.size() ; i++) {
            if(pairSocks.get(i)>max){
                max=pairSocks.get(i);
            }
        }
        System.out.println(max);
        for (int i = 0; i <pairSocks.size() ; i++) {
            System.out.print(pairSocks.get(i)+" ");
        }


    }
}
