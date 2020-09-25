import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tokens=scanner.nextLine().split(" ");
        List<Integer> numbers=new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }


        String line=scanner.nextLine();
        while(!line.equals("find")){
            StringBuilder word=new StringBuilder(line);
            StringBuilder newWord=new StringBuilder();

           if(word.length()>numbers.size()){
               int n=word.length()/numbers.size();
               int m=word.length()%numbers.size();
               int size1=0;
               int size2=numbers.size();
               for (int i = 0; i <n ; i++) {
                   String myLine=word.substring(size1,size2);
                   for (int j = 0; j <myLine.length() ; j++) {
                       int n1=(int)myLine.charAt(j);
                       int n2=numbers.get(j);
                       int result=n1 -n2;
                       newWord.append((char)result);
                   }
                   size1+=numbers.size();
                   size2+=numbers.size();
               }
               size2-=numbers.size();
               String myLine2=word.substring(size2,word.length());
               for (int i = 0; i <myLine2.length() ; i++) {
                   int y1=(int)myLine2.charAt(i);
                   int y2=numbers.get(i);
                   int resulty=y1 -y2;
                   newWord.append((char)resulty);
               }
               String myWord=newWord.toString();

               String type=myWord.substring(myWord.indexOf('&')+1,myWord.lastIndexOf('&'));
               String coordinates=myWord.substring(myWord.indexOf('<')+1,myWord.indexOf('>'));
               System.out.printf("Found %s at %s%n",type,coordinates);
           } else {

           }



            line=scanner.nextLine();
        }




    }
}
