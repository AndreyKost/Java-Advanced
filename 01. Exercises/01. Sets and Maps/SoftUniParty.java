import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeSet<String> vip=new TreeSet<>();
        TreeSet<String> regular=new TreeSet<>();

        String line=scanner.nextLine();

        while (!line.equals("PARTY")){
            if(Character.isDigit(line.charAt(0))){
                vip.add(line);
            } else {
                regular.add(line);
            }

            line=scanner.nextLine();
        }

        line=scanner.nextLine();
        while (!line.equals("END")){
            if(Character.isDigit(line.charAt(0))){
                vip.remove(line);
            } else {
                regular.remove(line);
            }
            line=scanner.nextLine();
        }


        System.out.println(vip.size()+regular.size());
        if(!vip.isEmpty()){
            for (String s : vip) {
                System.out.println(s);
            }
        }
        if(!regular.isEmpty()){
            for (String s : regular) {
                System.out.println(s);
            }
        }


    }
}
