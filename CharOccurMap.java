package assesment;

import java.util.HashMap;
import java.util.Map;

public class CharOccurMap {

	public static void main(String[] args) {
		String str = "Java";

		char[] char_array =str.toCharArray();
		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);
			} 
			else{
				charCounter.put(ch, 1);
			}
		}
			
		 for(Character key:charCounter.keySet())
	       {
	           System.out.println("Occurance of "+key+" is - "+charCounter.get(key));
	       }
	}

}
