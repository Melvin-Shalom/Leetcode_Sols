import java.util.Scanner;
import static java.lang.System.*;

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    };
}

public class _0231
{
    public static void main(String[] args)
    {
        Solution at = new Solution();
        Scanner sc = new Scanner(in);
        
        out.print("#: ");
        int x = sc.nextInt();
        out.println(at.isPowerOfTwo(x));
        sc.close();
    }
}

