package setmethod;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Sampleiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> p = new HashSet<Integer>();

		p.add(7);
		p.add(9);
		p.add(10);
		p.add(11);
		System.out.println("set one: " +p);

		Iterator<Integer> i = p.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println("set one: " +p);

	}
	

}
