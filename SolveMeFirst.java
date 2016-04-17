/**
 * Problem: Solve Me First
 * Domain: Algorithms > Warmup
 * Created by xiao0720 on 17/04/2016.
 */

import java.util.Scanner;

public class SolveMeFirst {
  static int solveMeFirst(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), b = in.nextInt();
    System.out.print(solveMeFirst(a, b));
  }
}
