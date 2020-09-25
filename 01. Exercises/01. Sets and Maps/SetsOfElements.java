import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int n=Integer.parseInt(tokens[0]);
        int m=Integer.parseInt(tokens[1]);
        LinkedHashSet<Integer> setN=new LinkedHashSet<>();
        LinkedHashSet<Integer> setM=new LinkedHashSet<>();


        while (n>0){
            int number=Integer.parseInt(scanner.nextLine());
            setN.add(number);

            n--;
        }

        while (m>0){
            int number=Integer.parseInt(scanner.nextLine());
            setM.add(number);

            m--;
        }

        for (Integer intr : setN) {
            if(setM.contains(intr)){
                System.out.printf("%d ",intr);
            }
        }


    }
}
