package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListStudy {

	public static void main(String[] args) {
LinkedList ll=new LinkedList();

ll.add("ram");
ll.add('B');
ll.add(10);
ll.add(10.10);
ll.add(null);
ll.add(true);
ll.add(null);
ll.add("ram");
System.out.println(ll);
System.out.println(ll.isEmpty());
System.out.println(ll.contains(null));
System.out.println(ll.indexOf("ram"));
ll.remove(null);
System.out.println(ll);
System.out.println("===for===");
for(int i=0;i<=ll.size()-1;i++)
{
	System.out.println(ll.get(i));
	}
System.out.println("=======for EACH===");
for(Object V:ll) 
{
	System.out.println(V);
	}
System.out.println("====iterator===");
 Iterator i = ll.iterator();
 while (i.hasNext())
 {
	 System.out.println(i.next());
 }

	System.out.println("===list iterator===");
	    ListIterator l = ll.listIterator();
	    System.out.println("==hasnewxt===");
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	System.out.println("===has previous===");
	while(l.hasPrevious())
	{
		System.out.println(l.previous());
	}
	
	
	


	}

}
