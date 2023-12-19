package collections;

public class Minimum_number {

	
	
	public static void main(String[] args) {
		
		int []a= {32,56,32,57,89,21,8,45,32,7,8};
	
	int max=0;
	System.out.println(a.length);
	
	for(int i=0;i<11;i++) {
		
		if(a[i]>max) {                     
			max=a[i];                          
			                                                 
			
		}
	}
	
	System.out.println("The min value is "+max);
	
}
}