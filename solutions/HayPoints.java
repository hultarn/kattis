// https://open.kattis.com/problems/haypoints

package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HayPoints 
{
    int value = 0;
    String word = "";
    
    HayPoints(String word, int value) 
    {
        this.word = word;
        this.value = value;
    }
    
    public static void main(String[] args) 
    {          
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); sc.nextInt();
    	Map<String, Integer> map = new HashMap<String, Integer>();       
        var hp = new HayPoints[a];
        
        for(int i = 0; i < a; i++)
            hp[i] = new HayPoints(sc.next(), sc.nextInt());

        String s = ""; 
        int tot = 0;
        while(sc.hasNext())
        {
        	s = sc.next();
        	if(s.equals("."))
        	{
        		for(HayPoints o : hp)
        			tot += map.get(o.word) == null ? 0 : map.get(o.word) * o.value;
   		
        		System.out.println(tot);
        		tot = 0;
        		map = new HashMap<String, Integer>();
        	}
        	map.put(s, (map.get(s) == null) ? 1 : map.get(s) + 1);      	
        }

        sc.close();
    }
}
