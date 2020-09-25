import java.util.Scanner;

public class ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] line=scanner.nextLine().split(", ");

        for (int i = 0; i <line.length ; i++) {
            boolean isValid=true;
            if(line[i].length()>=3 && line[i].length()<=16){
                for (int j = 0; j <line[i].length() ; j++) {
                    if(((!Character.isDigit(line[i].charAt(j))) && (!Character.isAlphabetic(line[i].charAt(j)))) && ((line[i].charAt(j)!='_')
                            && (line[i].charAt(j)!='-'))){
                        isValid=false;
                    }
                }
            } else {
                isValid=false;
            }
            if(isValid) {
                System.out.println(line[i]);
            }
        }



    }
}
