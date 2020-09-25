import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> names= Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toCollection(ArrayList::new));


        Consumer<ArrayList<String>> print= list ->{
            String st=list.toString();
            System.out.println(st.substring(1,st.length()-1)+" are going to the party!");
        };

        String line=scanner.nextLine();
        while (!line.equals("Party!")){
            String tokens[]=line.split(" ");
            Predicate<String> predicate=createPredicate(tokens[1],tokens[2]);
            if(tokens[0].equals("Remove")){
                names.removeIf(predicate);
            } else {
                ArrayList<String> namesToAdd=new ArrayList<>();

                names.forEach(name ->{
                    if(predicate.test(name)){
                        namesToAdd.add(name);
                    }
                });

                for (String s : namesToAdd) {
                    names.add(s);
                }

            }

            line=scanner.nextLine();
        }

        if(names.size()>0){
            Collections.sort(names);
            print.accept(names);
        } else {
            System.out.println("Nobody is going to the party!");
        }


    }

     public static Predicate<String> createPredicate(String type, String str){
        Predicate<String> predicate;
        switch (type){
            case "StartsWith":
                predicate=s->s.startsWith(str);
                break;
            case "EndsWith":
                predicate=s->s.endsWith(str);
                break;
            default:
                predicate=s-> s.length()==Integer.parseInt(str);
                break;
        }

        return predicate;
    }

}
