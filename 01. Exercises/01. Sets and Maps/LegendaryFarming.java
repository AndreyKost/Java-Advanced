import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, Integer> keyMaterials=new TreeMap<>();
        Map<String, Integer> junk=new TreeMap<>();
        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);
        String str="";

        while (true){
            boolean isValid=false;
            String tokens[]=scanner.nextLine().toLowerCase().split(" ");
            int points[]=new int[tokens.length/2];
            String materials[]=new String[tokens.length/2];
            int count=1;
            int p=0;
            int m=0;

            for (int i = 0; i <tokens.length ; i++) {
                if(count%2!=0){
                    points[p]=Integer.parseInt(tokens[i]);
                    p++;
                } else {
                    materials[m]=tokens[i];
                    m++;
                }
                count++;

            }

            for (int i = 0; i <materials.length ; i++) {
                String material=materials[i];
                if(material.equals("motes") || material.equals("fragments") || material.equals("shards")){
                    int n=keyMaterials.get(material);
                    keyMaterials.put(material,n+points[i]);
                    if(keyMaterials.get(material)>=250){
                        if(material.equals("shards")){
                            str="Shadowmourne";
                        } else if(material.equals("fragments")){
                            str="Valanyr";
                        } else {
                            str="Dragonwrath";
                        }
                        int num=keyMaterials.get(material);
                        keyMaterials.put(material,num-250);
                        isValid=true;
                        break;
                    }
                } else {
                    if(junk.containsKey(material)){
                        int n=junk.get(material);
                        junk.put(material,n+points[i]);
                    } else {
                        junk.put(material,points[i]);
                    }
                }
            }

            if(isValid){
                break;
            }

        }


        System.out.println(str+" obtained!");

        keyMaterials.entrySet().stream().sorted((f,s) -> {
            int result=Integer.compare(s.getValue(),f.getValue());
//            if(result==0){
//                result=f.getKey().compareTo(s.getKey());
//            }
            return result;
        }).forEach(e -> {
            System.out.printf("%s: %d%n",e.getKey(),e.getValue());
        });

        junk.entrySet().stream().sorted((f,s) -> {
            int result=f.getKey().compareTo(s.getKey());
            return result;
        }).forEach(entry -> {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        });

    }
}
