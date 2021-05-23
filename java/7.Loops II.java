import java.lang.Math;
import java.util.*;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 0; j < n; j++){
                int SumOfPowers = 0;
                for(int k = 0; k < j + 1; k++){
                    SumOfPowers += Math.pow(2, k);
                }
                int result = a + SumOfPowers * b;
                System.out.print(result + (j < (n - 1) ? " " : "\n"));
            }
            
        }
        in.close();
    }
}
