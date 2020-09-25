import java.util.Scanner;

public class LongerLine {

    static void printLongerLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        double distance1=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
        double distance2=Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
        double distance3=Math.sqrt(Math.pow(x3,2)+Math.pow(y3,2));
        double distance4=Math.sqrt(Math.pow(x4,2)+Math.pow(y4,2));
        double lengthPoint12=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double lengthPoint34=Math.sqrt(Math.pow((x3-x4),2)+Math.pow((y3-y4),2));

        if(lengthPoint12>=lengthPoint34){
            if(distance1<=distance2){
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x1,y1,x2,y2);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x2,y2,x1,y1);
            }

        } else {
            if(distance3<=distance4){
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x3,y3,x4,y4);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x4,y4,x3,y3);
            }
        }

    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x1=Integer.parseInt(scanner.nextLine());
        double y1=Integer.parseInt(scanner.nextLine());
        double x2=Integer.parseInt(scanner.nextLine());
        double y2=Integer.parseInt(scanner.nextLine());
        double x3=Integer.parseInt(scanner.nextLine());
        double y3=Integer.parseInt(scanner.nextLine());
        double x4=Integer.parseInt(scanner.nextLine());
        double y4=Integer.parseInt(scanner.nextLine());
        printLongerLine(x1,y1,x2,y2,x3,y3,x4,y4);

    }
}
