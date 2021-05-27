import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName;
        do {
            System.out.println("Enter first name");
            firstName = scanner.next();
            firstName(firstName);
        }while(!firstName(firstName));
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

}
