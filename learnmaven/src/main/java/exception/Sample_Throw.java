package exception;

public class Sample_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age=8;
      if(age>18) {
    	  System.out.println("eligible for voting");  
      }
      else {
    	  throw new ArithmeticException("votingageexception");
      }
}
}