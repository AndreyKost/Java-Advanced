import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        ArrayDeque<Character> stack=new ArrayDeque<>();
        ArrayDeque<Character> queue=new ArrayDeque<>();
        int countWhite=0;
        for (int i = 0; i <line.length(); i++) {
            char ch=line.charAt(i);
            if(ch==' '){
                countWhite++;
            }
        }

        //String[] tokens=line.split("");

        int size=line.length()/2;
        for (int i = 0; i <size ; i++) {
            stack.push(line.charAt(i));
        }
        for (int i = size; i <line.length() ; i++) {
            queue.offer(line.charAt(i));
        }
        /*for (String token : tokens) {
            stack.push(token);
            queue.offer(token);
        }*/
        boolean isValid=true;
        while (size>0){
            char q=queue.poll();
            char s=stack.pop();
            if(q==('(') && s!=(')')){
                isValid=false;
                break;
            } else if(q==('{') && s!=('}')){
                isValid=false;
                break;
            } else if(q==('[') && s!=(']')){
                isValid=false;
                break;
            }

            size--;
        }

        if(!isValid){
            System.out.println("NO");
        } else {
            /*if(countWhiteQueue==countWhiteStack){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }*/
            System.out.println("YES");
        }




    }
}
