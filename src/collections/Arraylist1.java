package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import arryStudy.intArray;
import generalization.shubhangi;
import loops.whilelloopstudy;
import practise.forStudy;

public class Arraylist1 {
	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add("shubhangi"); //index-0
al.add(null);		//i=1
al.add("shubhangi");//i=2
al.add(null);		//i=3;
al.add(100.0);      //i=4
al.add('A');        //i=5
al.add(true);	     //i=6	
al.add(777.88);		//i=7
al.add(false);	//i=8
System.out.println(al);		
System.out.println("size of arraylist is= "+al.size());		
	System.out.println("index of false is "+al.indexOf(false));
	al.remove(3);//to remove element
	System.out.println(al);
	System.out.println(al.isEmpty());
	System.out.println(al.contains("shubhangi"));
	System.out.println(al.get(2));
          al.add(3, null);	//to add particular index element element
System.out.println(al);
System.out.println("=======forloop====");
for(int i=0;i<=al.size()-1;i++)
{
	System.out.println(al.get(i));
	}
System.out.println("=======forEACHloop====");
for( Object a:al)
{
	System.out.println(a);
	}
System.out.println("=======ITERATOR====");
 Iterator it = al.iterator();

 while(it.hasNext())
 {
	 System.out.println(it.next());
 }
 System.out.println("===list iterator===");
 
ListIterator l2 = al.listIterator();
 System.out.println("==hasnewxt===");
while(l2.hasNext())
{
	System.out.println(l2.next());
}
System.out.println("===has previous===");
while(l2.hasPrevious())
{
	System.out.println(l2.previous());
}


}
}