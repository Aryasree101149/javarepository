package sampleabstraction;

public class Abstractionchild2 extends Abstractionparent{
	public void method1() {
		System.out.println("inside abstract child");
		
	}
	

	public static void main(String args[]) {
		Abstractionchild2 ab = new  Abstractionchild2();
		 ab.method1();
		 ab.display();
		ab.show();
	}
//@override
	public void display() {
		System.out.println("inside main method");
	}
}
