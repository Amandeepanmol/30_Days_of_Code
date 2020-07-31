import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.nextLine();
        
        for(int x=0;x<n;x++)
        {
            String s=sc.nextLine();
            char ch[]=s.toCharArray();

            for(int y=0;y<ch.length;y++)
            {
                if(y%2==0)
                {
                    System.out.print(ch[y]);
                }
            }
            
            System.out.print(" ");
        
            for(int y=0;y<ch.length;y++)
            {
                
                if(y%2!=0)
                {
                    System.out.print(ch[y]);
                }
            }
            System.out.println(" ");
        }
    }
}

