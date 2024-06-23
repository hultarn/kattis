// https://open.kattis.com/problems/3dprinter

package solutions;

import java.util.Scanner;

public class ThreeDPrintedStatues 
{
    static int numberOfPrinters = 1;
    static int statueToPrint;
    
    public static void main(String[] args)
    {       
        Scanner sc = new Scanner(System.in);
        statueToPrint = sc.nextInt();
        sc.close();
        int half = statueToPrint / 2;
        int count = 0;
        while(true)
        {
            if(numberOfPrinters < half)
                numberOfPrinters *= 2;
            else
                statueToPrint -= numberOfPrinters;
            
            count++;
            if(statueToPrint <= 0)
            {
                System.out.print(count);
                break;
            }
        }
    }   
}