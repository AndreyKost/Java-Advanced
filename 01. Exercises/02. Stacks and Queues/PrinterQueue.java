import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        ArrayDeque<String> queue=new ArrayDeque<>();

        while (!line.equals("print")){
            if(!line.equals("cancel")){
                queue.offer(line);
            } else {
                if(queue.size()>0){
                    String st=queue.poll();
                    System.out.println("Canceled "+st);
                } else {
                    System.out.println("Printer is on standby");
                }
            }
            line=scanner.nextLine();
        }


        while (queue.size()>0){
            String str=queue.poll();
            System.out.println(str);
        }
    }
}
