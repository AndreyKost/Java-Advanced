import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tokens=scanner.nextLine().split("\\s+");
        StringBuilder newWord=new StringBuilder();
        double sum=0;

        for (int i = 0; i <tokens.length ; i++) {
            String word=tokens[i];
            double result=calculate(word);
            sum+=result;
        }
        System.out.printf("%.2f",sum);
    }

    private static double calculate(String word) {
        StringBuilder newWord=new StringBuilder();
        for (int i = 0; i <word.length() ; i++) {
            char c=word.charAt(i);
            if(Character.isDigit(c)){
                newWord.append(c);
            }
        }
        String str=newWord.toString();
        int number=Integer.parseInt(str);
        double result=0;
        String symbol="";
        if(word.charAt(0)>=65 && word.charAt(0)<=90){
            result=number*1.0 / (word.charAt(0)-'@');
        } else {
            symbol=""+word.charAt(0);
            symbol=symbol.toUpperCase();
            result=(number*1.0) * (symbol.charAt(0)-'@');
        }
        int length=word.length()-1;
        symbol="";
        if(word.charAt(length)>=65 && word.charAt(length)<=90){
            result-=word.charAt(length)-'@';
        } else {
            symbol=""+word.charAt(length);
            symbol=symbol.toUpperCase();
            result+=symbol.charAt(0)-'@';
        }
        return  result;
    }
}
