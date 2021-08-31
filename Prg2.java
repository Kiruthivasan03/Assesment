package assesment;

public class Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Learning Java";
		//int count=0;
		int countofL=0, countofe=0, countofa=0;
		
		char[] c=text.toCharArray(); 
		
		for(int i=0; i<c.length;i++) {
			
			if(c[i]=='L') {
				
				countofL=countofL+1;				
							
			}
			
			else if(c[i]=='e') {
				
				countofe=countofe+1;
				
								
			}
			
			else if(c[i]=='a') {
				
				countofa=countofa+1;
				
								
			}
			
			
		}
		
		System.out.println("Occurence of L -"+countofL);
		System.out.println("Occurence of e -"+countofe);
		System.out.println("Occurence of a -"+countofa);
		
	}

}
