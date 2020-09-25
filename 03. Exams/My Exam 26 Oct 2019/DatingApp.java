import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        String tokens1[]=scanner.nextLine().split(" ");

        Deque<Integer> queueFemale=new ArrayDeque<>();
        Deque<Integer> stackMale=new ArrayDeque<>();

        int matches=0;

        for (String token : tokens) {
            stackMale.push(Integer.parseInt(token));
        }

        for (String s : tokens1) {
            queueFemale.offer(Integer.parseInt(s));
        }

        while (queueFemale.size()>0 && stackMale.size()>0){
            int male=stackMale.pop();
            int female=queueFemale.poll();

            if(male<=0 || female <=0){
                if(male<=0){

                } else {
                    stackMale.push(male);
                }
                if(female<=0){

                } else {
                    queueFemale.addFirst(female);
                }
                continue;
            }

            if(male%25==0 || female%25==0){
                if(male%25==0) {
                    if (stackMale.size() > 0) {
                        stackMale.pop();
                        queueFemale.addFirst(female);
                    } else {
                        break;
                    }
                }

                if(female%25==0){
                    if(queueFemale.size()>0){
                        queueFemale.poll();
                        stackMale.push(male);
                    } else {
                        break;
                    }
                }
                continue;
            }





            if(female==male){
                matches++;
            } else {
                male-=2;
               stackMale.push(male);

            }


        }


        System.out.printf("Matches: %d%n",matches);
        if(stackMale.size()>0){
            System.out.printf("Males left: ");
            while (stackMale.size()>0){
                int m=stackMale.pop();
                if(stackMale.size()==0){
                    System.out.printf("%d%n",m);
                } else {
                    System.out.printf("%d, ",m);
                }
            }
        } else {
            System.out.println("Males left: none");
        }

        if(queueFemale.size()>0){
            System.out.printf("Females left: ");
            while (queueFemale.size()>0){
                int f=queueFemale.poll();
                if(queueFemale.size()==0){
                    System.out.printf("%d%n",f);
                } else {
                    System.out.printf("%d, ",f);
                }
            }
        } else {
            System.out.println("Females left: none");
        }

    }
}
