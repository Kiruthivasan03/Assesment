package assesment;

public class Prg3 {

	public static void main(String[] args) {
		String test="maven";
		
		char[] c=test.toCharArray(); 
		
		for(int i=c.length; i>=0;i--) {
		
			if(i%2==0) {
				
				System.out.print(c[i]);
			}

	}

}
}
