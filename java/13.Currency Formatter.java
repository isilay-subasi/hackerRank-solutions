import java.text.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat innf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chnf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frnf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                
        System.out.println("US: " + usnf.format(payment));
        System.out.println("India: " + innf.format(payment));
        System.out.println("China: " + chnf.format(payment));
        System.out.println("France: " + frnf.format(payment));
    }
}