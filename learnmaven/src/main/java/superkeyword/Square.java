package superkeyword;

public class Square extends Area{
	public Square() {
		super(10);
		System.out.println("This is the area of square");
	}

	public static void main(String args[]) {
		Square s = new Square();
	}
}
