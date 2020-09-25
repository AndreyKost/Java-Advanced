import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(";");
        String[] robots = new String[tokens.length];
        int[] processTime = new int[tokens.length];
        int[] workTime = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            String[] tkns = tokens[i].split("-");
            robots[i] = tkns[0];
            processTime[i] = Integer.parseInt(tkns[1]);
        }
        String startTime = scanner.nextLine();
        String line = scanner.nextLine();
        ArrayDeque<String> products = new ArrayDeque<>();
        while (!line.equals("End")) {
            products.offer(line);

            line = scanner.nextLine();
        }

        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);

        int beginSeconds=hours*3600 + minutes*60 + seconds;

        while (!products.isEmpty()){
            beginSeconds++;
            String product=products.poll();
            boolean isAssigned=false;
            for (int i = 0; i <robots.length ; i++) {
                if(workTime[i]==0 && !isAssigned){
                    workTime[i]=processTime[i];
                    isAssigned=true;
                    printRobotData(robots[i],product, beginSeconds);
                }
                if(workTime[i]>0){
                    workTime[i]--;
                }
            }

            if(!isAssigned){
                products.offer(product);
            }
        }


    }

    private static void printRobotData(String robot, String product, int beginSeconds) {
        int hours=(beginSeconds/3600)%24;
        int minutes=(beginSeconds/60)%60;
        int seconds=beginSeconds%60;
        System.out.println(String.format(robot + " - " + product+" "+ String.format("[%02d:%02d:%02d]",hours,minutes,seconds)));
    }


}
