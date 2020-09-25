import java.util.ArrayList;
import java.util.Scanner;

public class ExcelFunctions2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rowCount=Integer.parseInt(scanner.nextLine());

        String[][] matrix= new String[rowCount][];

        for (int i = 0; i <rowCount ; i++) {
            matrix[i]=scanner.nextLine().split(", ");
        }

        String[] commandArgs = scanner.nextLine().split(" ");

        if(commandArgs[0].equals("hide")){
            Hide(matrix,commandArgs[1]);
        } else if(commandArgs[0].equals("sort")){
            sortByColumn(matrix,commandArgs[1]);
        } else if(commandArgs[0].equals("filter")){
            filterByColumns(matrix,commandArgs[1],commandArgs[2]);
        }


    }

    private static void filterByColumns(String[][] matrix, String commandArg, String commandArg1) {
        int sortColumnIndex=-1;
        for (int r = 1; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {
                if(matrix[r][c].equals(commandArg1)){
                    sortColumnIndex=c;
                }
            }
        }

        System.out.println(String.join(" | ",matrix[0]));
        for (int i = 1; i <matrix.length ; i++) {
            if(matrix[i][sortColumnIndex].equals(commandArg1)){
                System.out.println(String.join(" | ",matrix[i]));
            }
        }


    }

    private static void sortByColumn(String[][] matrix, String hiddenColumn) {
        int sortColumnIndex=-1;
        for (int i = 0; i <matrix[0].length ; i++) {
            if(matrix[0][i].equals(hiddenColumn)){
                sortColumnIndex=i;
                break;
            }
        }

        for (int j = 0; j <matrix.length ; j++) {
            for (int i = 1; i <matrix.length-1-j ; i++) {
                if(matrix[i][sortColumnIndex].compareTo(matrix[i+1][sortColumnIndex]) > 0){
                    String[] temp=matrix[i];
                    matrix[i]=matrix[i+1];
                    matrix[i+1]=temp;
                }
            }
        }

        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[c].length ; c++) {
                if(c==matrix[c].length-1){
                    System.out.print(matrix[r][c]);
                } else {
                    System.out.print(matrix[r][c]+" | ");
                }
            }
            System.out.println();
        }


    }

    private static void Hide(String[][] matrix, String hiddenColumn) {
        int hiddenColumnIndex=-1;
        for (int i = 0; i <matrix[0].length ; i++) {
            if(matrix[0][i].equals(hiddenColumn)){
                hiddenColumnIndex=i;
                break;
            }
        }

        ArrayList<String> arr=new ArrayList<>();
        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {
                if(c!=hiddenColumnIndex){
                    arr.add(matrix[r][c]);
                }
            }
            String str=String.join(" | ",arr);
            System.out.println(str);
            arr.clear();
        }
    }
}
