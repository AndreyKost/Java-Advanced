import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class ClubParty2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=Integer.parseInt(scanner.nextLine());
        String tokens[] = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue=new ArrayDeque<>();

        ArrayList<Integer> reservations=new ArrayList<>();

        int sum=0;
        for (int i =tokens.length-1; i>=0 ; i--) {
            if(Character.isDigit(tokens[i].charAt(0))){

                    int number=Integer.parseInt(tokens[i]);

                    if(sum+number>max)
                    {
                        String hall=queue.poll();
                        String pattern = reservations.toString().replaceAll("[\\[\\]]", "");
                        System.out.printf("%s -> %s%n",hall,pattern);
                        reservations.clear();
                        sum=0;
                    }

                if(queue.isEmpty()){
                    continue;
                }

                sum+=number;
                reservations.add(number);

            } else {
                queue.offer(tokens[i]);
            }

        }




    }
}
