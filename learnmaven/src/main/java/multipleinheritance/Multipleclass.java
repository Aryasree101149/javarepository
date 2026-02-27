package multipleinheritance;

import multilevelinheritance.tree;

public class Multipleclass  implements Multipleparent1,Multipleparent2{
	
	public void display2() {
		System.out.println("show multiple class data");
		
	}

	public static void main(String args[]){
		Multipleclass tr = new Multipleclass();
		tr.show();
	    tr.display();
	    tr.display2();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show parent2 data");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("show parent1 data");
	}

}
