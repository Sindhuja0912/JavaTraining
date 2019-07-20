package packageone;

import java.util.HashMap;

public class SettwoProgone {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	       String inputString = "sandeep";
	    char[] strArray = inputString.toCharArray();
	    for (char c : strArray)
	    {
	        if(hm.containsKey(c))
	        {
	            hm.put(c, hm.get(c)+1);
	        }
	        else
	        {
	            hm.put(c, 1);
	        }
	    }

	    System.out.println(hm);      

	}

}
