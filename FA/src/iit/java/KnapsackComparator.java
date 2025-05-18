package iit.java;

import java.util.Comparator;

public class KnapsackComparator implements Comparator<Itemvalue> {

	@Override
	public int compare(Itemvalue item1, Itemvalue item2) {
		// TODO Auto-generated method stub
		
		double cpr1=(double) item1.getProfit()/item1.getWeight();
		double cpr2=(double) item2.getProfit()/item2.getWeight();
		
		if(cpr1<cpr2)
			return 1;
		else
		return -1;
	}

}
