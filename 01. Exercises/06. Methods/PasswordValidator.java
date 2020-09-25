import java.util.Scanner;

public class PasswordValidator {

    static void loginChecker1(String password){
        boolean isValid1=true ;
        boolean isValid2=true;
        boolean isValid3=true;

        if(password.length()<6 || password.length()>10){
            isValid1=false;
        }
        for(char i=0;i<password.length();i++) {
            if ((!Character.isDigit(password.charAt(i))) && ((password.charAt(i)<65 || password.charAt(i)>122 ) ||
                    (password.charAt(i)>90 && password.charAt(i)<97))) {
                isValid2=false;
            }
        }
        int count=0;
        for (int i = 0; i <password.length() ; i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        if(count<2){
            isValid3=false;
        }


        if (isValid1 && isValid2 && isValid3) {
            System.out.println("Password is valid");

        }
        if(!isValid1){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!isValid2){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!isValid3){
            System.out.println("Password must have at least 2 digits");
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        loginChecker1(password);

    }
}
