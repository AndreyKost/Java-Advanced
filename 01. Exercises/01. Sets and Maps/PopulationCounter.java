import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Long>> world=new LinkedHashMap<>();

        String line=scanner.nextLine();
        while (!line.equals("report")){
            String tokens[]=line.split("\\|");
            String country=tokens[1];
            String city=tokens[0];
            long population=Long.parseLong(tokens[2]);

            if(world.containsKey(country)){
                if(world.get(country).containsKey(city)){
                 long n=world.get(country).get(city);
                 world.get(country).put(city,n+population);
                } else {
                    world.get(country).put(city, population);
                }
            } else {
                world.put(country, new LinkedHashMap<>());
                world.get(country).put(city,population);
            }


            line=scanner.nextLine();
        }

        Map<String, Long> countryStats=new LinkedHashMap<>();
        long totalSum=0;
        for (Map.Entry<String, LinkedHashMap<String, Long>> mapEntry : world.entrySet()) {
            totalSum=0;
            Map<String, Long> stats=mapEntry.getValue();
            for (Map.Entry<String, Long> entry : stats.entrySet()) {
                totalSum+=entry.getValue();
            }
            countryStats.put(mapEntry.getKey(),totalSum);
        }

        countryStats.entrySet().stream().sorted((e1,e2) -> {
            int result= Long.compare(e2.getValue(),e1.getValue());
            return result;
        }).forEach(e->{
            System.out.printf("%s (total population: %d)%n",e.getKey(),e.getValue());

            for (Map.Entry<String, LinkedHashMap<String, Long>> mapEntry : world.entrySet()) {
                if(mapEntry.getKey().equals(e.getKey())){
                    Map<String, Long> asd=mapEntry.getValue();
                    asd.entrySet().stream().sorted((first,second) -> {
                        int result=Long.compare(second.getValue(),first.getValue());
                        return result;
                    }).forEach(k->{
                        System.out.printf("=>%s: %d%n",k.getKey(),k.getValue());
                    });

                }
            }


        });








    }
}

