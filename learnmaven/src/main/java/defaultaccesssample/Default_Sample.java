package defaultaccesssample;

public class Default_Sample {
 void sampledefault() { 
	System.out.println("default limited to package");
}
public static void main(String args[]) {
	Default_Sample y = new Default_Sample();
	y.sampledefault();
}     
}
