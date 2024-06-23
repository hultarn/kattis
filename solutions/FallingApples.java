// https://open.kattis.com/problems/apples

package solutions;

import java.util.Scanner;

public class FallingApples 
{
    static char[][] arr = new char[50000][10];
    static int a, b;
    static StringBuilder sb = new StringBuilder();
    static int[] buffer = new int[10];
    
    public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt();
        sc.nextLine();
        String s;
        char tmp;
        int c = 0;

        while(a > c)
        {
            s = sc.nextLine();
            for(int j = 0; j < b; j++)
            {
                tmp = s.charAt(j);
                if(tmp == 'a')
                buffer[j]++;
                else if(tmp == '.') {}
                else
                {
                    arr[c][j] = '#';
                    func(j, c);
                }
            }
            c++;
        }
        sc.close();
        c = 0;
        for(int i : buffer)
        {
            for(int j = a-1; true ; j--)
            {
                if(i <= 0)
                    break;
                
                arr[j][c] = 'a';
                i--;
            }
            c++;
        }
        
        for(int i = 0; i < a ; i++)
        {           
            for(int j = 0; j < b; j++)
            {
                tmp = arr[i][j];
                if(tmp != 'a' && tmp != '#')
                {
                    sb.append(".");
                }
                else
                    sb.append("" + arr[i][j]);    
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }

    private static void func(int col, int row) 
    {
        int i = buffer[col];
        for(int j = row; true; j--)
        {
            if(i <= 0)
            {
                buffer[col] = 0;
                break;
            }
            
            arr[j-1][col] = 'a';
            i--;
        }
    }
}