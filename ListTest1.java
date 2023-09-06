package collection1;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
	
		// list objects created
		ArrayList<Double> arrLists = new ArrayList<Double>();
		
		System.out.println(arrLists);
		
		arrLists.add(10.4);
		arrLists.add(10.4);
		arrLists.add(10.4);
		arrLists.add(10.4);
		
		System.out.println(arrLists);
		
		
		double tot=0;
		for(double arrList : arrLists) {
			tot += arrList;
		}
		System.out.println(tot);
		
		
		double avg=tot / arrLists.size();
		System.out.println(avg);
		
	}

}
