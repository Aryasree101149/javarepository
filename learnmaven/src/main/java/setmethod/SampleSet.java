package setmethod;

import java.util.HashSet;
import java.util.Set;

public class SampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> s = new HashSet<Integer>();
Set<Integer> s1 = new HashSet<Integer>();
s.add(2);
s.add(4);
s.add(12);
s.add(14);
System.out.println("set one: " +s);
s1.add(1);
s1.add(3);
s1.add(5);
s1.add(6);
System.out.println("set one: " +s1);
s.addAll(s1);
System.out.println("after addall: " +s);
System.out.println(s.size());
System.out.println(s.isEmpty());
System.out.println(s.contains(2));
System.out.println(s.containsAll(s1));
System.out.println(s1.containsAll(s));
s.remove(4);
System.out.println("set one: " +s);
s.removeAll(s1);
System.out.println("set one: " +s);
s1.clear();
System.out.println("set one: " +s1); 

	}

}
