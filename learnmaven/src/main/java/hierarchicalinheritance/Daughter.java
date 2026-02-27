package hierarchicalinheritance;
 

public class Daughter extends Father{
	public void daughter_character() {
		System.out.println("duaghter is cool");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter dn=new Daughter();
		dn.daughter_character();
		dn.father_character();
	}
}
