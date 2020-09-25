import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int multiplier=Integer.parseInt(scanner.nextLine());
        int addNum=0;
        if(input.charAt(0)==0){
            input=input.substring(1);
        }
        if(input.isEmpty()){
            input="0";
        }
        if(multiplier==0){
            System.out.println(0);
            return;
        }

        StringBuilder exitNum=new StringBuilder();

        char[] inputNum=input.toCharArray();

        for (int i =inputNum.length-1; i >=0 ; i--) {
            int currentNum=((inputNum[i]-'0')*multiplier)+addNum;
            addNum=currentNum/10;
            currentNum%=10;
            exitNum.append(currentNum);
        }

        if (addNum > 0) {
            exitNum.append(addNum);
        }

        exitNum.reverse();
        System.out.println(exitNum);


    }
}
