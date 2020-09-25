import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> categ=new TreeMap<>();

        String line=scanner.nextLine();
        while (!line.equals("Revision")){
            String tokens[]=line.split(", ");
            String shop=tokens[0];
            String product=tokens[1];
            double price=Double.parseDouble(tokens[2]);

            if(categ.containsKey(shop)){
                categ.get(shop).put(product,price);
            } else {
                categ.put(shop, new LinkedHashMap<>());
                categ.get(shop).put(product,price);
            }
            line=scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> mapEntry : categ.entrySet()) {
            System.out.printf("%s->%n",mapEntry.getKey());
            HashMap<String, Double> prt=mapEntry.getValue();
            for (Map.Entry<String, Double> doubleEntry : prt.entrySet()) {
                System.out.printf("Product: %s, ",doubleEntry.getKey());
                System.out.printf("Price: %.1f",doubleEntry.getValue());
                System.out.println();
            }

        }


    }
}
