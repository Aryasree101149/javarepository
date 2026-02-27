package runtimepoly;

public class Child_Run extends Parent_Run{
	public void sum(int a ,int b) {
		int add =a*b;
		 System.out.println("Child method: " + add);
	}
	public static void main(String[] args) {
	Parent_Run rn=new Child_Run();
		rn.sum(3,7);	
		rn.sum(3,8);
		
  
}
}