import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stackCommands=new ArrayDeque<>();
        ArrayDeque<String> stackKindOfCommands=new ArrayDeque<>();
        StringBuilder word=new StringBuilder();

        while (N>0){
            String[] tokens=scanner.nextLine().split("\\s+");
            String command=tokens[0];

            if(command.equals("1")){
              String append=tokens[1];
              word.append(append);
              stackCommands.push(command);
              stackKindOfCommands.push(append);
            } else if(command.equals("2")){
                String str="";
                String str1="";
                int count=Integer.parseInt(tokens[1]);
                for (int i = 0; i <count ; i++) {
                    char ch=word.charAt(word.length()-1);
                    str=str+""+ch;
                    word.deleteCharAt(word.length()-1);
                }
                for (int i = str.length()-1; i >=0 ; i--) {
                    str1=str1+""+str.charAt(i);
                }
                stackCommands.push(command);
                stackKindOfCommands.push(str1);
            } else if(command.equals("3")){
                int index=Integer.parseInt(tokens[1]);
                System.out.println(word.charAt(index-1));
            } else if(command.equals("4")){
                if(stackCommands.size()>0) {
                    String st = stackCommands.pop();
                    String st1 = stackKindOfCommands.pop();
                    if (st.equals("1")) {
                        for (int i = 0; i <st1.length() ; i++) {
                            word.deleteCharAt(word.length()-1);
                        }
                    }
                    if (st.equals("2")) {
                        word.append(st1);
                    }
                }

            }
            N--;
        }




    }
}
