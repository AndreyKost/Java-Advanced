import java.util.Scanner;

public class DataTypes {

    static void printResult(String dataType,int a){
        System.out.println(a*2);
    }
    static void printResult(String dataType, double a){
        System.out.printf("%.2f",a*1.5);
    }
    static void printResult(String dataType, String a){
        System.out.println("$"+a+"$");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String dataType=scanner.nextLine();
        if(dataType.equals("int")){
            int a=Integer.parseInt(scanner.nextLine());
            printResult(dataType,a);
        } else if(dataType.equals("real")){
            double a=Double.parseDouble(scanner.nextLine());
            printResult(dataType,a);
        } else if(dataType.equals("string")){
            String a=scanner.nextLine();
            printResult(dataType,a);
        }


    }
}
