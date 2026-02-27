package polymorphismsample;

public class Sample_Polymorphism {
	public  void sum(int a,int b) {
		int add =a+b;
		System.out.println("first method printing" +add);

	}
	public  void sum() {
		System.out.println("second method printing");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_Polymorphism sm =new Sample_Polymorphism ();
		sm.sum();
		sm.sum(3,8);
		
	}

}
