package exception;

public class Sample_Exception {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub    
     try {
    	 int a[] = new int[5];
    	 a[5]=10/2;
    	 System.out.println(a[5]);
    	 int r=5/0;
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println(e);
     }
     catch(ArithmeticException a) {
    	 System.out.println(a);
     }
	} 
	

}
     