package iit.java;

import java.util.ArrayList;
import java.util.Collections;

public class FKP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Itemvalue> itemvalues=new ArrayList<Itemvalue>();
   
   Itemvalue itemvalue1=new Itemvalue();
   itemvalue1.setObject(0);
   itemvalue1.setProfit(0);
   itemvalue1.setWeight(0);
   
   
   Itemvalue itemvalue2=new Itemvalue();
   itemvalue2.setObject(0);
   itemvalue2.setProfit(0);
   itemvalue2.setWeight(0);
   
   Itemvalue itemvalue3=new Itemvalue();
   itemvalue3.setObject(0);
   itemvalue3.setProfit(0);
   itemvalue3.setWeight(0);

   Itemvalue itemvalue4=new Itemvalue();
   itemvalue4.setObject(0);
   itemvalue4.setProfit(0);
   itemvalue4.setWeight(0);

   Itemvalue itemvalue5=new Itemvalue();
   itemvalue5.setObject(0);
   itemvalue5.setProfit(0);
   itemvalue5.setWeight(0);

   Itemvalue itemvalue6=new Itemvalue();
   itemvalue6.setObject(0);
   itemvalue6.setProfit(0);
   itemvalue6.setWeight(0);

   Itemvalue itemvalue7=new Itemvalue();
   itemvalue7.setObject(0);
   itemvalue7.setProfit(0);
   itemvalue7.setWeight(0);

   itemvalues.add(itemvalue1);
   itemvalues.add(itemvalue2);
   itemvalues.add(itemvalue3);
   itemvalues.add(itemvalue4);
   itemvalues.add(itemvalue5);
   itemvalues.add(itemvalue6);
   itemvalues.add(itemvalue7);
   
   Collections.sort(itemvalues,new KnapsackComparator());
   
   
   int capacity=15;
   double totalvalue=0.0;
   int remainingCapacity=capacity;
   
   for(Itemvalue item:itemvalues) {
	   if(remainingCapacity==0) {
		   break;
	   }
	   int weight=item.getWeight();
	   int profit=item.getProfit();
	   
	   if(weight<=remainingCapacity) {
		   totalvalue=totalvalue+profit;
		   remainingCapacity=remainingCapacity-weight;
	   }else {
		   double fraction=(double)remainingCapacity/weight;
		   totalvalue=totalvalue+profit*fraction;
		   remainingCapacity=0;
	   }
   }
   System.out.println("TotalProfit"+totalvalue);
   
	}

}


