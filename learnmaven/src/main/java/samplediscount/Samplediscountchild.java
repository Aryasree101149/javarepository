package samplediscount;

public class Samplediscountchild extends Samplediscountparent {
	public   void discount(double amount) {   // 5% discount
        double finalAmount = amount - (amount * 0.50);
        System.out.println("discount Season Final Amount (50% Discount): " + finalAmount);
    }

public static void main(String args[]){
	Samplediscountchild sm = new Samplediscountchild();
	sm.discount(1000);
	
	Samplediscountparent sd = new Samplediscountparent();
	sd.discount(1000);

}
}