package listlyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> data= Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toCollection(ArrayList::new));

        ListIterator listInterator=new ListIterator(data);

        String line=scanner.nextLine();

        while(!line.equals("END")){

            switch (line){
                case "Move":
                    System.out.println(listInterator.move());
                    break;
                case "Print":
                    try {
                        System.out.println(listInterator.getInternalItem());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listInterator.hasNext());
                    break;
                case "PrintAll":

                    for(String str : listInterator){
                        System.out.print(str+" ");
                    }
                    System.out.println();
                    /*do {
                        try {
                            System.out.println(listInterator.getInternalItem());
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        listInterator.move();
                    } while (listInterator.hasNext());
                    *//*try {
                        System.out.println(listInterator.getInternalItem());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }*/
                    break;
            }

            line=scanner.nextLine();
        }
    }


}
