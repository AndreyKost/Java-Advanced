package compareObjects;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        TreeSet<Person> peopleByNames=new TreeSet<>(new ComparatorPeopleByNames());
        TreeSet<Person> peopleByAge=new TreeSet<>(new ComparatorPeopleByAge());
        int n=Integer.parseInt(scanner.nextLine());



        while (n-- > 0){

            String[] tokens=scanner.nextLine().split("\\s+");
            Person p=new Person(tokens[0],Integer.parseInt(tokens[1]));
            peopleByNames.add(p);
            peopleByAge.add(p);

        }







        for (Person person : peopleByNames){
            System.out.println(person.toString());
        }

        for (Person person : peopleByAge){
            System.out.println(person.toString());
        }


    }
}
