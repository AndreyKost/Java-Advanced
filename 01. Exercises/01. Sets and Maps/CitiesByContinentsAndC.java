import java.util.*;

public class CitiesByContinentsAndC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> conCountries=new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<String>> countryCities=new LinkedHashMap<>();

        while (n>0){
            String tokens[]=scanner.nextLine().split(" ");
            String continent=tokens[0];
            String country=tokens[1];
            String city=tokens[2];

            if(conCountries.containsKey(continent)){
                if(conCountries.get(continent).contains(country)){

                } else {
                    conCountries.get(continent).add(country);
                }
            } else {
                conCountries.put(continent, new ArrayList<>());
                conCountries.get(continent).add(country);
            }

            if(countryCities.containsKey(country)){
                countryCities.get(country).add(city);
            } else {
                countryCities.put(country, new ArrayList<>());
                countryCities.get(country).add(city);
            }
            n--;
        }

        for (Map.Entry<String, ArrayList<String>> entry : conCountries.entrySet()) {
            System.out.printf("%s:%n",entry.getKey());
            ArrayList<String> std=entry.getValue();
            for (String s : std) {
                for (Map.Entry<String, ArrayList<String>> listEntry : countryCities.entrySet()) {
                 if(listEntry.getKey().equals(s)){
                     System.out.printf("%s -> ",listEntry.getKey());
                     ArrayList<String> asd=listEntry.getValue();
                     if(asd.size()>1){
                         for (int i = 0; i <asd.size()-1 ; i++) {
                             System.out.printf("%s, ",asd.get(i));
                         }
                         System.out.printf("%s",asd.get(asd.size()-1));
                     } else {
                         System.out.printf("%s",asd.get(0));
                     }
                     System.out.println();
                 }
                }
            }
        }


    }
}
