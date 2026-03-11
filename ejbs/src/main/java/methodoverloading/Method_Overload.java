package methodoverloading;

public class Method_Overload {
	public void text() {
		System.out.println("print first method");
	}
	public void text(int a,int b) {
		int c =a+b;
		System.out.println(c);
		
	}
	public void text(float c,int d) {
		float f =c*d;
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overload sm= new Method_Overload();
          sm.text();
          sm.text(3,5);
          sm.text(3,7);
	}

}
