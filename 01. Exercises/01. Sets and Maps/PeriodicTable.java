import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        TreeSet<String> periodicTable=new TreeSet<>();

        while (n>0){
            String line=scanner.nextLine();
            if(line.contains(" ")){
              String tokens[]=line.split(" ");
                for (String s : tokens) {
                    periodicTable.add(s);
                }
            } else {
                periodicTable.add(line);
            }

            n--;
        }

        for (String s : periodicTable) {
            System.out.printf("%s ",s);
        }


    }
}
