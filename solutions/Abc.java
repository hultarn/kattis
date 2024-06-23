// https://open.kattis.com/problems/abc

package solutions;

import java.util.Scanner;

public class Abc 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int fi = sc.nextInt(); int se = sc.nextInt(); int th = sc.nextInt();
        
        for(char c : sc.next().toCharArray())
            System.out.print((c == 'A' ? fi < se ? fi < th ? fi : th : se < th ?  se : th : c == 'B' ? fi > se ? fi > th ? th > se ? th : se : fi : fi > th ?  fi : th > se ? se : th : fi > se ? fi > th ? fi : th : se > th ?  se : th) + " ");
        
        sc.close();        
    }
}
