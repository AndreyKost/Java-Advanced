import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String, List<String>> cardsPoints=new LinkedHashMap<>();

        String line=scanner.nextLine();
        while (!line.equals("JOKER")){
            String tokens[]=line.split(": ");
            String name=tokens[0];
            String cards[]=tokens[1].split(", ");
            if(cardsPoints.containsKey(name)){
                for (int i = 0; i <cards.length ; i++) {
                    if(!cardsPoints.get(name).contains(cards[i])) {
                        cardsPoints.get(name).add(cards[i]);
                    }
                }
            } else {
                cardsPoints.put(name, new ArrayList<>());
                for (int i = 0; i <cards.length ; i++) {
                    if(!cardsPoints.get(name).contains(cards[i])) {
                        cardsPoints.get(name).add(cards[i]);
                    }
                }
            }

            line=scanner.nextLine();
        }

        int sum=0;
        for (Map.Entry<String, List<String>> entry : cardsPoints.entrySet()) {
            sum=0;
            int p=0;
            int t=0;
            String st="";
            System.out.printf("%s: ",entry.getKey());
            List<String> asd=entry.getValue();
            for (int i = 0; i <asd.size() ; i++) {
                String str=asd.get(i);
                if(Character.isDigit(str.charAt(0))){
                    if(str.charAt(0)=='1'){
                        p=10;
                        if(str.charAt(2)=='S'){
                            t=4;
                        } else if(str.charAt(2)=='H'){
                            t=3;
                        } else if(str.charAt(2)=='D'){
                            t=2;
                        } else if(str.charAt(2)=='C'){
                            t=1;
                        }
                    } else {
                        st = "" + str.charAt(0);
                        p = Integer.parseInt(st);
                    }
                } else if(str.charAt(0)=='J') {
                    p=11;
                } else if(str.charAt(0)=='Q'){
                    p=12;
                } else if(str.charAt(0)=='K'){
                    p=13;
                } else if(str.charAt(0)=='A'){
                    p=14;
                }

                if(str.charAt(1)=='S'){
                    t=4;
                } else if(str.charAt(1)=='H'){
                    t=3;
                } else if(str.charAt(1)=='D'){
                    t=2;
                } else if(str.charAt(1)=='C'){
                    t=1;
                }

                int tempSum=p*t;
                sum+=tempSum;

            }
            System.out.printf("%d%n",sum);

        }


    }
}
