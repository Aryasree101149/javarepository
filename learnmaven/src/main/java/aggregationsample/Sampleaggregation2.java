package aggregationsample;

public class Sampleaggregation2 {
	int c,d;
	Sampleaggregation ag; //entity reference-aggregation//
	public void aggregationmethod2(int c,int d,Sampleaggregation ag)
	{
		this.c=c;
		this.d=d;
		this.ag=ag;
	}
	public void print()
	{
		System.out.println("Value of a: " + ag.a);
		System.out.println("Value of b: " + ag.b);
		System.out.println("Value of c: " + c);
		System.out.println("Value of d: " + d);
	}
	public static void main(String args[]) {
        Sampleaggregation sa = new Sampleaggregation();
        sa.aggregationmethod(3, 5);

        Sampleaggregation2 ad = new Sampleaggregation2();
        ad.aggregationmethod2(10, 20, sa); // passed sa instead of ad
        ad.print();
    }

}