package Iterators;

import java.util.LinkedList;
import java.util.List;

public class Element {
	
	private char letter;
	
	private int amount;
	
	Element(char letter, int amount){
		if (letter>='a'&&letter<='z')
			this.letter=letter;
		if(amount>0)
			this.amount=amount;
	}
    public static List <Element> merege (List <Element>l1, List <Element> l2){
    	List <Element> union = new LinkedList <Element>();
    	for (int i=0; i<l1.size(); i++) {
    		for (int j=i; j<j+1 && j < l2.size(); j++) {
    			if(l2.get(j).letter<l1.get(i).letter) 
    				union.add(l2.get(j));
    			
    			if(l2.get(j).letter>l1.get(i).letter) 
    				union.add(l1.get(i));
    		}
    	}
    	
    	return union;
    }
     public String tostring() {
	  String ans = "[ ";
	  
	  return ans;
     }
	public static void main(String[] args) {
		 LinkedList <Element> e= new LinkedList <Element>();
		 LinkedList <Element> e1= new LinkedList <Element>();
		 
		 Element a = new Element ('c',5);
		 Element a1 = new Element ('e',4);
		 Element a2 = new Element ('g',7);
		 Element a3 = new Element ('z',2);
		 
		 Element b = new Element ('a',5);
		 Element b1 = new Element ('d',4);
		 Element b2 = new Element ('f',7);
		 Element b3 = new Element ('q',1);
		 
		 e.add(a);e.add(a1);e.add(a2);e.add(a3);
		 e1.add(b);e1.add(b1);e1.add(b2);e1.add(b3);
		 
		 System.out.println(merege(e,e1));
		 
		// System.out.println(e);
		// System.out.println(e1);
	}

}
