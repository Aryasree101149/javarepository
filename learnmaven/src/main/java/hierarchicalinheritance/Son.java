package hierarchicalinheritance;

public class Son extends Father {
	public void son_character() {
		System.out.println("son is cool");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son sn=new Son();
		sn.son_character();
		sn.father_character();

	}

}
