import java.util.Scanner;

public class Grades {

    static void printGrades(double grade){
        String str="";

        if (grade>=2.0 && grade<=2.99) {
            str="Fail";
        }  else if(grade>=3.0&& grade<=3.49){
            str="Poor";
        } else if(grade>=3.50 && grade<=4.49){
            str="Good";
        } else if(grade>=4.50 && grade<=5.49){
            str="Very good";
        }else if(grade>=5.50){
            str="Excellent";
        }
        System.out.println(str);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double grade=Double.parseDouble(scanner.nextLine());
        printGrades(grade);
    }
}
