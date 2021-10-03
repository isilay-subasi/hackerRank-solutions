import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan=new Scanner(System.in);
        BigInteger m =  new BigInteger(scan.next());
        BigInteger n = new BigInteger(scan.next());
         
         System.out.println(m.add(n));
         System.out.println(m.multiply(n));
        
    }
}
