/* Assignment 9.2: Program to build any collection containing duplicates. 
   Create its copy with all duplicates removed. Display the new collection.
*/

import java.util.*;

class Mobile implements Comparable{	// Class Mobile with Comparable interface needed for TreeSet
	
	String bname;
	String model;
	double rate;

	public Mobile(String bname, String model, double rate){
		this.bname = bname;
		this.model = model;
		this.rate = rate;
	}

	public int compareTo(Object obj){	// compareTo method to remove duplicates on model field
		Mobile m = (Mobile)obj;
		return this.model.compareTo(m.model);
	}		
}

class CollectionTest {

	public static void main(String[] args){

		ArrayList<Mobile> al = new ArrayList<Mobile>();
		TreeSet<Mobile> ts = new TreeSet<Mobile>();	

		// Data of object type Mobile added
		al.add(new Mobile("Samsung","A500",23000));
		al.add(new Mobile("Samsung","Note",53000));
		al.add(new Mobile("Apple","iPhone6",40000));
		al.add(new Mobile("Apple","iPhone6",35000));
		al.add(new Mobile("Apple","iPhone6",38000));
		al.add(new Mobile("Apple","iPhone7",60000));
		al.add(new Mobile("Apple","iPhone7",70000));
		al.add(new Mobile("Apple","iPhone7",80000));
		al.add(new Mobile("Samsung","Edge",63000));
		al.add(new Mobile("Samsung","Edge",73000));

		System.out.println("\n=======================================");
		System.out.println("===== COLLECTIONS WITH DUPLICATES =====");
		System.out.println("=======================================");
		System.out.println("Brand" + "\t" + "Model" + "\t" + "Rate");
		System.out.println("-----" + "\t" + "-----" + "\t" + "----");
		
		Iterator itr = al.iterator();	// Iterator to read rows from Arraylist al
		while(itr.hasNext()){
			Mobile m = (Mobile)itr.next();
			System.out.println(m.bname + "\t" + m.model + "\t" + m.rate);
			ts.add(new Mobile(m.bname,m.model,m.rate));
		}

		System.out.println("\n==========================================");
		System.out.println("===== DUPLICATES REMOVED VIA TREESET =====");
		System.out.println("==========================================");
		System.out.println("Brand" + "\t" + "Model" + "\t" + "Rate");
		System.out.println("-----" + "\t" + "-----" + "\t" + "----");
		Iterator itr2 = ts.iterator();	// Iterator to read rows from TreeSet ts
		while(itr2.hasNext()){
			Mobile m2 = (Mobile)itr2.next();
			System.out.println(m2.bname + "\t" + m2.model + "\t" + m2.rate);
		}
	}
}