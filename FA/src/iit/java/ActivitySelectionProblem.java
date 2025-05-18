package iit.java;

public class ActivitySelectionProblem {
	
	
	
	public static void printmaxacctivity(String item[],int s[],int f[],int n) {
		int i,j;
		System.out.println("Acctivity are selected:");
		i=0;
		System.out.print(item[i]+" ->");
		
		for( j=1;j<n;j++) {
			if(s[j]>f[i]) {
				System.out.print(item[j]+" ->");
				i=j;
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item[]= {"A3","A2","A1","A5","A6","A4"};
		int s[]= {1,3,0,5,8,5};
		int f[]= {2,4,6,7,9,9};
		
		int n=s.length;
		
		printmaxacctivity(item,s,f,n);
	}

}
