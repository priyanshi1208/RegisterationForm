import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName,lastName,email,phoneNumber;
        do {
            System.out.println("Enter first name");
            firstName = scanner.next();
            firstName(firstName);
        }while(!firstName(firstName));
        do {
            System.out.println("Enter last name");
            lastName = scanner.next();
            lastName(lastName);
        }while(!lastName(lastName));
        do {
            System.out.println("Enter email");
            email = scanner.next();
            lastName(email);
        }while(!email(email));
        do {
            System.out.println("Enter phone Number");
            phoneNumber = scanner.next();
            lastName(phoneNumber);
        }while(!phoneNumber(phoneNumber));
    }
    public static boolean regexCheck(String reg, String input){
        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher(input);
        boolean matches=matcher.matches();
        return matches;
    }
   public static boolean firstName(String firstName){
        String reg="^[A-Z][a-z]{3,}";
        return regexCheck(reg,firstName);
   }
    public static boolean lastName(String lastName) {
        String reg = "^[A-Z][a-z]{3,}";
        return regexCheck(reg, lastName);
    }
    public static boolean email(String email) {
        String reg = "^[a-za-z0-9-\\+]+(\\.[a-za-z0-9-]+)*@"+"[a-za-z0-9-]+(\\.[a-za-z0-9]+)*(\\.[a-za-z]{2,})$";
        return regexCheck(reg, email);
    }
    public static boolean phoneNumber(String phoneNumber) {
        String reg = "^\\d{10}$";
        return regexCheck(reg, phoneNumber);
    }

}
