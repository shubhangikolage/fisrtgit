package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import StringMethod.string1;

public class linkedListSir {

	public static void main(String[] args) {
		LinkedList <Object>l=new LinkedList<Object>();
		System.out.println(l.poll());
		//System.out.println(l.pop());

		l.add("pune");
		l.add("pune");
		l.add(123);
		l.add(1.1);
		l.add(null);
		l.add('a');
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println(l.peek());//1st element
		System.out.println(l);
		System.out.println(l.poll());//remove 1string1 element
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);

		System.out.println("************************");

		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("************************");
		Iterator<Object> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("************************");

		ListIterator<Object> lit = l.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}

		System.out.println("************************");

		for(Object A:l)
		{
			System.out.println(A);
		}
	}

}
