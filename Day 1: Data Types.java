import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int x=scan.nextInt();
        double y=scan.nextDouble();
        scan.nextLine();
        String z=scan.nextLine();

        int sum=i+x;
        double sum1=d+y;
        String s1=s+z;                                            //String s1=s.concat(z);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(s1);

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
