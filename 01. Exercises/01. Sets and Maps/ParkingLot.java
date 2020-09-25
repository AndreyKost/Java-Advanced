import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashSet<String> parkingLot=new HashSet<>();

        String line=scanner.nextLine();

        while (!line.equals("END")){
            String tokens[]=line.split(", ");
            String command=tokens[0];
            String lot=tokens[1];
            if(command.equals("IN")){
                parkingLot.add(lot);
            } else {
                parkingLot.remove(lot);
            }

            line=scanner.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : parkingLot) {
                System.out.println(s);
            }
        }


    }
}
