import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest= s.substring(0, k);
        largest=s.substring(0, k);
         for (int i = 1; i <= s.length() - k; ++i){
        String curSubstr = s.substring(i, i + k);
        if (largest.compareTo(curSubstr) < 0)
            largest = s.substring(i, i + k);
        if (smallest.compareTo(curSubstr) > 0)
            smallest = s.substring(i, i + k);
         }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}