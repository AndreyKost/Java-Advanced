import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tokens=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue=new ArrayDeque<>();
        ArrayList<String> children=new ArrayList<>();
        for (String token : tokens) {
            children.add(token);
        }
        String currentChild="";
        if(n<=tokens.length){
            currentChild=children.get(n-1);
            children.remove(n-1);
        } else {
            int left=n%tokens.length;
            if(left==0){
                currentChild=children.get(children.size()-1);
                children.remove(children.size()-1);
            } else {
                currentChild=children.get(left-1);
                children.remove(left-1);
            }
        }
        System.out.printf("Removed %s%n",currentChild);
        String[] str=new String[children.size()];
        for (int i = 0; i <children.size() ; i++) {
            str[i]=children.get(i);
        }
        Collections.addAll(queue, str);

        while (queue.size()>1){
            System.out.printf("Removed %s%n",queue.poll());
        }
        System.out.printf("Last is %s%n",queue.poll());



    }
}
