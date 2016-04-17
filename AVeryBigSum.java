/**
 * Problem: A Very Big Sum
 * Domain: Algorithms > Warmup
 * Created by xiao0720 on 17/04/2016
 */

import java.util.Scanner;

public class AVeryBigSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    long sum = 0;

    for (int i = 0; i < N; i++) {
      sum += in.nextInt();
    }

    System.out.println(sum);
  }
}
