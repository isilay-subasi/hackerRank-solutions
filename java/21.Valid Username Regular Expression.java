import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
     
    public static final String regularExpression ="(^[A-Za-z][A-Za-z0-9_]{7,29}$)";
    
    //[a-zA-Z]
    //[a-zA-Z_0-9]
    //[^ 0-9] herhangi bir rakam olmayan
    //@"^[abcd]\d{5}$"
    //^ first line
    //$ end line
    
    
    
    
    
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}