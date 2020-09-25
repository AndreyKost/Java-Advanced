import java.util.ArrayDeque;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        String line=scanner.nextLine();
        ArrayDeque<String> queue=new ArrayDeque<>();

        while (!line.equals("END")){
            queue.offer(line);

            line=scanner.nextLine();
        }
        int max=Integer.MIN_VALUE;
        ArrayDeque<String> queue2=new ArrayDeque<>();
        while (queue.size()>0){
            String element=queue.poll();
            queue2.offer(element);
            if(element.length()>max){
                max=element.length();
            }
        }
        int size=queue2.size();
        char[][] matrix=new char[size][max];


        for (int row = 0; row <size ; row++) {
            String str=queue2.poll();
            for (int col = 0; col <max ; col++) {
                if(col<str.length()) {
                    matrix[row][col] = str.charAt(col);
                } else {
                    matrix[row][col]=' ';
                }
            }
        }
        String ch="";
        for (int i = 0; i <command.length() ; i++) {
            if(Character.isDigit(command.charAt(i))){
                ch=ch+""+command.charAt(i);
            }
        }
        int n=Integer.parseInt(ch);
        int num=n%360;
        if(num==90) {
            Rotate90(matrix);
        } else if(num==180){
            Rotate180(matrix);
        } else if(num==270){
            Rotate270(matrix);
        } else {
            for (int row = 0; row <matrix.length ; row++) {
                for (int col = 0; col <matrix[0].length; col++) {
                    System.out.printf("%s",matrix[row][col]);
                }
                System.out.println();
            }
        }


    }

    private static void Rotate270(char[][] matrix) {
        char[][] secondMatrix=new char[matrix[0].length][matrix.length];
        ArrayDeque<String> stack=new ArrayDeque<>();
        for (int row = matrix.length-1; row >=0 ; row--) {
            String txt="";
            for (int col = matrix[0].length-1; col >=0 ; col--) {
                txt=txt+""+matrix[row][col];
            }
            stack.push(txt);
        }
        for (int col = 0; col <secondMatrix[0].length ; col++) {
            String str=stack.pop();
            for (int row = 0; row <secondMatrix.length ; row++) {
                secondMatrix[row][col]=str.charAt(row);
            }
        }
        for (int row = 0; row <secondMatrix.length ; row++) {
            for (int col = 0; col <secondMatrix[0].length; col++) {
                System.out.printf("%s",secondMatrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void Rotate180(char[][] matrix) {
        char[][] secondMatrix=new char[matrix.length][matrix[0].length];
        ArrayDeque<String> queue=new ArrayDeque<>();
        for (int row = matrix.length-1; row >=0 ; row--) {
            String txt="";
            for (int col = matrix[0].length-1; col >=0 ; col--) {
                txt=txt+""+matrix[row][col];
            }
            queue.offer(txt);
        }

        for (int row = 0; row <matrix.length ; row++) {
            String txt=queue.poll();
            for (int col = 0; col <matrix[0].length ; col++) {
                secondMatrix[row][col]=txt.charAt(col);
            }
        }
        for (int row = 0; row <secondMatrix.length ; row++) {
            for (int col = 0; col <secondMatrix[0].length; col++) {
                System.out.printf("%s",secondMatrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void Rotate90(char[][] matrix) {
        char[][] secondMatrix=new char[matrix[0].length][matrix.length];
        ArrayDeque<String> stack=new ArrayDeque<>();
        for (int row = 0; row <matrix.length ; row++) {
            String txt="";
            for (int col = 0; col <matrix[0].length ; col++) {
                txt=txt+""+matrix[row][col];
            }
            stack.push(txt);
        }

        for (int col = 0; col <matrix.length ; col++) {
            String str=stack.pop();
            for (int row = 0; row <matrix[0].length ; row++) {
                secondMatrix[row][col]=str.charAt(row);
            }
        }

        for (int row = 0; row <secondMatrix.length ; row++) {
            for (int col = 0; col <secondMatrix[0].length; col++) {
                System.out.printf("%s",secondMatrix[row][col]);
            }
            System.out.println();
        }
    }


}
