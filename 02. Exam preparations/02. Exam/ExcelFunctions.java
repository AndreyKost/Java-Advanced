import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExcelFunctions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());

        Map<Integer, ArrayList<String>> matrix=new LinkedHashMap<>();
        for (int i = 0; i <N ; i++) {
            String[] tokens=scanner.nextLine().split(", ");
            matrix.put(i,new ArrayList<>());
            for (int j = 0; j <tokens.length ; j++) {
                matrix.get(i).add(tokens[j]);
            }
        }

        String[] commands=scanner.nextLine().split(" ");
        if(commands.length==2){
            if(commands[0].equals("hide")){
                boolean isOver=false;
                int idxToRemove=0;
                String header=commands[1];
                for (Map.Entry<Integer, ArrayList<String>> entry : matrix.entrySet()) {
                    ArrayList<String> value = entry.getValue();
                    for (int i = 0; i <value.size(); i++) {
                        if(value.get(i).equals(header)){
                            idxToRemove=i;
                            isOver=true;
                            break;
                        }
                    }
                    if(isOver){
                        break;
                    }
                }
                for (Map.Entry<Integer, ArrayList<String>> entry : matrix.entrySet()) {
                    entry.getValue().remove(idxToRemove);
                }

                for (Map.Entry<Integer, ArrayList<String>> entry : matrix.entrySet()) {
                    List<String> value = entry.getValue();
                    for (int i = 0; i <value.size() ; i++) {
                        if(i==value.size()-1){
                            System.out.printf("%s",value.get(i));
                        } else {
                            System.out.printf("%s | ",value.get(i));
                        }
                    }
                    System.out.println();
                }

            } else if(commands[0].equals("sort")){
                ArrayList<String> headeR=new ArrayList<>();
                String header=commands[1];
                boolean isOver=false;
                int idxToSort=0;
                for (Map.Entry<Integer, ArrayList<String>> entry : matrix.entrySet()) {
                    ArrayList<String> value = entry.getValue();
                    for (int i = 0; i <value.size(); i++) {
                        if(value.get(i).equals(header)){
                            idxToSort=i;
                            headeR=entry.getValue();
                            matrix.remove(entry.getKey());
                            isOver=true;
                            break;
                        }
                    }
                    if(isOver){
                        break;
                    }
                }
                String str=String.join(" | ",headeR);
                System.out.println(str);
                AtomicInteger ai=new AtomicInteger(idxToSort);
                matrix.entrySet().stream().sorted((f,s) -> {
                    int kur=ai.intValue();
                    if(Character.isDigit(f.getValue().get(kur).charAt(0)) && Character.isDigit(s.getValue().get(kur).charAt(0))){
                        int result=Double.compare(Double.parseDouble(f.getValue().get(kur)),Double.parseDouble(s.getValue().get(kur)));
                        return result;
                    }
                    int result=f.getValue().get(kur).compareTo(s.getValue().get(kur));
                    return result;
                }).forEach(e -> {
                    String st=String.join(" | ",e.getValue());
                    System.out.println(st);
                });

            }
        } else if(commands.length==3){
            String header1=commands[1];
            String header2=commands[2];
            ArrayList<String> heade1=new ArrayList<>();
            ArrayList<String> heade2=new ArrayList<>();

            heade1=matrix.get(0);

            for (Map.Entry<Integer, ArrayList<String>> entry : matrix.entrySet()) {
                ArrayList<String> value = entry.getValue();
                for (int i = 0; i <value.size() ; i++) {
                    if(value.get(i).equals(header2)){
                        heade2=entry.getValue();
                    }
                }
            }

            String str=String.join(" | ",heade1);
            System.out.println(str);
             str=String.join(" | ",heade2);
            System.out.println(str);


        }





    }
}
