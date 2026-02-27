package exception;

public class Sample_Thows {

	public static void main(String[] args) throws VotingAgeException  {
		// TODO Auto-generated method stub
      int age=8;
      if(age>18) {
    	  System.out.println("eligible for voting");  
      }
      else {
    	  throw new VotingAgeException("it is a custom exception");
      }
}
}





