import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TrojanInvasion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfWaves=Integer.parseInt(scanner.nextLine());
        String tokens[]=scanner.nextLine().split(" ");
        Deque<Integer> warriors=new ArrayDeque<>();
        Deque<Integer> plates=new ArrayDeque<>();
        for (String token : tokens) {
            plates.offer(Integer.parseInt(token));
        }

        String line="";
        boolean isTrojansDefeated=false;
        for (int i = 1; i <=numberOfWaves ; i++) {
            line=scanner.nextLine();
            String tokens1[]=line.split(" ");
            for (String s : tokens1) {
                warriors.push(Integer.parseInt(s));
            }

            if (i%3==0){
                line=scanner.nextLine();
                plates.addLast(Integer.parseInt(line));
            }

            int leftWorP=0;


            while (warriors.size()>0){
                int warrior=warriors.pop();
                int plate=plates.poll();

                if(warrior>plate){
                    leftWorP=warrior-plate;
                    warriors.push(leftWorP);
                    if(plates.size()==0){
                        isTrojansDefeated=true;
                        break;
                    }
                } else if(warrior < plate){
                    leftWorP=plate-warrior;
                    plates.addFirst(leftWorP);
                } else {
                    if(plates.size()==0){
                        isTrojansDefeated=true;
                        break;
                    }
                }


            }

            if(isTrojansDefeated){

                break;
            }

        }

        if(isTrojansDefeated){
            System.out.println("The Trojans successfully destroyed the Spartan defense.");
        } else  {
            System.out.println("The Spartans successfully repulsed the Trojan attack.");
        }

        if(warriors.size()>0){
            System.out.print("Warriors left: ");
        }
        while (warriors.size()>0){
            int w=warriors.pop();
            if(warriors.size()==0){
                System.out.print(w);
            } else {
                System.out.print(w+", ");
            }

        }

        if(plates.size()>0){
            System.out.print("Plates left: ");
        }
        while (plates.size()>0){
            int p=plates.poll();
            if(plates.size()==0){
                System.out.print(p);
            } else {
                System.out.print(p+", ");
            }
        }


    }
}
