import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String titleOfArticle=scanner.nextLine();
        System.out.println("<h1>");
        System.out.println(titleOfArticle);
        System.out.println("</h1>");
        System.out.println("<article>");
        String contextOfTheArticle=scanner.nextLine();
        System.out.println(contextOfTheArticle);
        System.out.println("</article>");
        String comment=scanner.nextLine();
        while (!comment.equals("end of comments")){
            System.out.println("<div>");
            System.out.println(comment);
            System.out.println("</div>");

            comment=scanner.nextLine();
        }



    }
}
