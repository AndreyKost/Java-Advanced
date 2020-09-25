import java.util.*;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeMap<String, ArrayList<Double>> students=new TreeMap<>();
        int n=Integer.parseInt(scanner.nextLine());

        while (n>0){
            String tokens[]=scanner.nextLine().split(" ");
            String name=tokens[0];
            double mark=Double.parseDouble(tokens[1]);

            if(students.containsKey(name)){
                students.get(name).add(mark);
            } else {
                students.put(name, new ArrayList<>());
                students.get(name).add(mark);
            }
            n--;
        }

        List<Double> avg=new ArrayList<>();
        double average=0;
        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            average=0;
            ArrayList<Double> course=entry.getValue();
            for (Double ad : course) {
                average+=ad;
            }
            average=average/course.size();
            avg.add(average);
        }

        int count=0;
        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey()+" -> ");
            List<Double> marks=entry.getValue();
            for (Double mark : marks) {
                System.out.printf("%.2f ",mark);
            }
            System.out.printf("(avg: %.2f)",avg.get(count));
            count++;
            System.out.println();
        }


    }
}
