import java.util.Scanner;

public class Solution {
  public static int addDigits(int num) {
    return 1 + (num - 1) % 9;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digits: ");
    int xnum = sc.nextInt();
    int result = addDigits(xnum);
    System.out.println("Result: " + result);
  }
}

/*

class Solution {
  public int addDigits(int num) {
    return 1 + (num - 1) % 9;
  }
}

*/
