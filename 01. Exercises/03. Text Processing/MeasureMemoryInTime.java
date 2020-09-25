import java.util.Date;

public class MeasureMemoryInTime {
    public static void main(String[] args) {
        String word="abc";
        StringBuilder repeated=new StringBuilder();
        long startEpochMs=new Date().getTime();
        for (int i = 0; i <10000000 ; i++) {
            repeated.append(word);
        }
        long timeMs=new Date().getTime() - startEpochMs;
        System.out.println(timeMs);


    }
}
