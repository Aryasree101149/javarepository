package sampleprotector;
public class Sample_Protectected {
	protected void name() {
		System.out.println("the proctedr have similarity with public");
	}
	public static void main(String[]args)
	{
		Sample_Protectected c = new Sample_Protectected();
		c.name();
	}
	}
		
