package superkeyword;

public class Car_Method_Invoke extends Vehicle_Method_Invoke{  
		public void display_colour(String color) {
			super.display_colour("red");
		System.out.println("color of vehicle is"+" "+color);
	}
	public static void main(String args[]) {
		Car_Method_Invoke cmi = new Car_Method_Invoke();
		cmi.display_colour("yellow");
	}
	}

