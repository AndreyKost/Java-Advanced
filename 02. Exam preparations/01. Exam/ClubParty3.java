import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ClubParty3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallCapacity=Integer.parseInt(scanner.nextLine());
        String input[]=scanner.nextLine().split(" ");
        Deque<String> hallsAndReservations=initializeStack(input,hallCapacity);
        Deque<String> halls=new ArrayDeque<>();
        Deque<Integer> currentHallReservations=new ArrayDeque<>();

        int currentSum=0;
        while (!hallsAndReservations.isEmpty()){
            String currentElement=hallsAndReservations.pop();

            if(Character.isDigit(currentElement.charAt(0))){
                int reservation=Integer.parseInt(currentElement);

                if(reservation+currentSum>hallCapacity){
                    printHall(halls,currentHallReservations);
                    currentSum=0;
                    currentHallReservations.clear();

                }

                if(halls.isEmpty()){
                    continue;
                }

                currentSum+=reservation;
                currentHallReservations.add(reservation);
            } else {
                halls.add(currentElement);
            }


        }


    }

    private static void printHall(Deque<String> halls, Deque<Integer> currentHallReservations) {
        System.out.printf("%s -> ",halls.remove());
        while (!currentHallReservations.isEmpty()){
            if(currentHallReservations.size()==1){
                System.out.printf("%s%n",currentHallReservations.remove());
            } else {
                System.out.printf("%s, ",currentHallReservations.remove());
            }
        }

    }

    private static Deque<String> initializeStack(String[] input, int hallCapacity) {
        ArrayDeque<String> stack=new ArrayDeque<>();
        for (int i = 0; i <input.length ; i++) {
            stack.push(input[i]);
        }
        return stack;
    }
}
