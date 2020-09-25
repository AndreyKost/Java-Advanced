import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int index = 0; index <line.length() ; index++) {
            char ch=line.charAt(index);
            if(ch=='('){
                stack.push(index);
            } else if(ch==')'){
                int startIndex=stack.pop();
                String content=line.substring(startIndex,index+1);
                System.out.println(content);
            }

        }

    }
}
