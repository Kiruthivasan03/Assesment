package assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prg4 {

	public static void main(String[] args) {
		
		List l1=new ArrayList();
	
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		
		List l2=new ArrayList();
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);
		
		l1.addAll(l2);
		
		for(int i=0; i<l1.size();i++) {
			
			Collections.sort(l1);
			
			System.out.println(l1.get(i));
			
		}
		
		
	}

}
