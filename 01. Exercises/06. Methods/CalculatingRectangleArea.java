import java.util.Scanner;

public class CalculatingRectangleArea {

    static int printRectangleArea(int width,int length){
        return width*length;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int width=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        int area=printRectangleArea(width,length);
        System.out.println(area);
    }
}
