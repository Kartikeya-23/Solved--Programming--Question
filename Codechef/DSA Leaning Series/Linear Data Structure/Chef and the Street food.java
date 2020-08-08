/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int k = 0; k < t; k++) {
                int n = sc.nextInt();
                sc.nextLine();
                int[][] arr = new int[n][3];
                int maxProfit = 0;
                for (int i = 0; i < n; i++) {
                    int max = 0;
                    for (int j = 0; j < 3; j++) {
                        arr[i][j] = sc.nextInt();
                    }
                    if (arr[i][1] > arr[i][0]) {
                        max = arr[i][1] / (arr[i][0] + 1) * arr[i][2];
                    }
                    if (max >= maxProfit) {
                        maxProfit = max;
                    }
                }
                System.out.println(maxProfit);
            }
        } catch (Exception e) {
            return;
        }
	}
}
