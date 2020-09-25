import java.util.*;

public class ClubParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallMaxCapacity = Integer.parseInt(scanner.nextLine());
        String tokens[] = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayList<String> nnn=new ArrayList<>();
        LinkedHashMap<String, ArrayList<Integer>> hallWithPersons = new LinkedHashMap<>();
        for (String token : tokens) {
            nnn.add(token);
        }
        while (Character.isDigit((nnn.get(nnn.size()-1)).charAt(0))){
            nnn.remove(nnn.get(nnn.size()-1));
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> halls = new ArrayList<>();
        for (int i = nnn.size() - 1; i >= 0; i--) {
            if (Character.isDigit(nnn.get(i).charAt(0))) {
                numbers.add(Integer.parseInt(nnn.get(i)));
            } else {
                halls.add(nnn.get(i));
            }
        }

        for (int i = 0; i < halls.size(); i++) {
            int sum = 0;
            while (true) {
                if (numbers.size() > 0) {
                    if (numbers.get(0) + sum <= hallMaxCapacity) {
                        sum += numbers.get(0);
                        if (hallWithPersons.containsKey(halls.get(i))) {
                            hallWithPersons.get(halls.get(i)).add(numbers.get(0));
                        } else {
                            hallWithPersons.put(halls.get(i), new ArrayList<>());
                            hallWithPersons.get(halls.get(i)).add(numbers.get(0));
                        }
                        numbers.remove(0);
                    } else {
                        int n=numbers.get(0);
                        numbers.remove(0);
                        numbers.add(n);
                        break;
                    }

                } else {
                    break;
                }


            }



        }


        if(numbers.size()>0){
            int sum=0;
            for (Map.Entry<String, ArrayList<Integer>> entry : hallWithPersons.entrySet()) {
                if(entry.getKey().equals(halls.get(halls.size()-1))){
                    ArrayList<Integer> nums=entry.getValue();
                    for (int i = 0; i <nums.size() ; i++) {
                        sum+=nums.get(i);
                    }
                }
            }
            if(sum==hallMaxCapacity){

            } else {
                if(hallWithPersons.size()>1){
                    hallWithPersons.remove(halls.get(halls.size() - 1));
                }

            }
        } else {
            int sum=0;
            for (Map.Entry<String, ArrayList<Integer>> entry : hallWithPersons.entrySet()) {
                if(entry.getKey().equals(halls.get(halls.size()-1))){
                    ArrayList<Integer> nums=entry.getValue();
                    for (int i = 0; i <nums.size() ; i++) {
                        sum+=nums.get(i);
                    }
                }
            }
            if(hallMaxCapacity!=sum){
                if(hallWithPersons.size()>1){
                    hallWithPersons.remove(halls.get(halls.size() - 1));
                }
            }

        }

        for (Map.Entry<String, ArrayList<Integer>> entry : hallWithPersons.entrySet()) {
            System.out.printf("%s -> ",entry.getKey());
            ArrayList<Integer> nums=entry.getValue();
            for (int i = 0; i <nums.size() ; i++) {
                if(i!=nums.size()-1){
                    System.out.printf("%d, ",nums.get(i));
                } else {
                    System.out.printf("%d%n",nums.get(i));
                }
            }
        }




    }
}
