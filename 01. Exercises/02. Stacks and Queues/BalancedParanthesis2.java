import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        ArrayDeque<Character> stack=new ArrayDeque<>();
        boolean isValid=true;
        for (int i = 0; i <line.length() ; i++) {
            char current=line.charAt(i);
            if(current=='(' || current=='{' || current=='['){
                stack.push(current);
            } else {
                if(stack.isEmpty()){
                    isValid=false;
                    break;
                }
                char topElement=stack.pop();
                if(current=='}' && topElement!='{'){
                    isValid=false;
                    break;
                } else if(current==']' && topElement!='['){
                    isValid=false;
                    break;
                } else if(current==')' && topElement!='('){
                    isValid=false;
                }
            }
        }

        if(isValid){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
