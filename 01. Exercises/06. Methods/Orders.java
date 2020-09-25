import java.util.Scanner;

public class Orders {

    static  void printPriceOfOrders(String order,int quantity){

        double price=0;
        if(order.equals("coffee")){
            price=1.50;
        }
        if(order.equals("water")){
            price=1.0;
        }
        if(order.equals("coke")){
            price=1.40;
        }
        if(order.equals("snacks")){
            price=2.0;
        }

        double sum=price*quantity;
        System.out.printf("%.2f",sum);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String order=scanner.nextLine();
        int quantity=Integer.parseInt(scanner.nextLine());
        printPriceOfOrders(order,quantity);
    }
}
