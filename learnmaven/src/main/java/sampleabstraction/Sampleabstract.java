package sampleabstraction;

public class Sampleabstract implements Abstactioninterface {
	public void show() {
		System.out.println("inside abstract child class");
	}
	
	public static void main(String args[]) {
		Sampleabstract sa = new Sampleabstract();
		sa.display();
		sa.show();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("inside abstract interface parent method");
	}
	}

