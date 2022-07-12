package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import arryStudy.intArray;
import loops.whilelloopstudy;
import practise.forStudy;

public class vectorStudy {

	public static void main(String[] args) {
Vector v1=new Vector();

v1.add("hi");
v1.add(null);
v1.add("hi");
v1.add(null);
v1.add('A');
v1.add(12.12);
v1.add(10);
System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.isEmpty());
System.out.println(v1.indexOf(10));
System.out.println(v1.lastIndexOf(null));
v1.remove(1);
System.out.println(v1);
System.out.println(v1.contains(12.12));
System.out.println("=======for===");
for(int i=0;i<=v1.size()-1;i++)
{
	System.out.println(v1.get(i));
	}
System.out.println("=======for EACH===");
for(Object V:v1) 
{
	System.out.println(V);
	}
System.out.println("====iterator===");
 Iterator i = v1.iterator();
 while (i.hasNext())
 {
	 System.out.println(i.next());
 }

System.out.println("=======enumeration===");
           Enumeration e = v1.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	System.out.println("===list iterator===");
	    ListIterator l = v1.listIterator();
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
