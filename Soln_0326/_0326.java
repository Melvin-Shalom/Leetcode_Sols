import java.util.Scanner;
import static java.lang.System.*;

class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (1162261467 % n == 0);
    }
}

public class _0326
{
    public static void main(String[] args)
    {
        Solution at = new Solution();
        Scanner sc = new Scanner(in);
        
        out.print("#: ");
        int x = sc.nextInt();
        out.println(at.isPowerOfThree(x));
        sc.close();
    }
}

