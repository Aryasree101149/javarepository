package inheritance;

public class Daughter extends Mother{
	public void showresult(){
		System.out.println("the final result is");
	}
public static void main(String args[]){
	Daughter inr = new Daughter();
    inr.showresult();
    inr.sum();
}
}