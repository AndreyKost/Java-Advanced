import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String> stack=new ArrayDeque<>();
        ArrayDeque<String> queue=new ArrayDeque<>();
        String line=scanner.nextLine();

        while (!line.equals("Home")){
            if(line.equals("back")) {
                if (stack.size() > 1) {
                    queue.addFirst(stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if(line.equals("forward")){
                if (queue.size() > 0) {
                    System.out.println(queue.peek());
                    stack.push(queue.poll());

                } else {
                    System.out.println("no next URLs");
                }
            } else {
                stack.push(line);
                System.out.println(line);
                queue.clear();
            }
            line=scanner.nextLine();
        }

    }
}
