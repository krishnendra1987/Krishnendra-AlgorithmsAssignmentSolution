package service;

public class MergeSort {

	public static void mergeSortAscending(double[] compPriceArry, int l, int r) {
		
		if (l<r) {
			
			int m = (l+r)/2;		
			mergeSortAscending(compPriceArry,l,m);
			mergeSortAscending(compPriceArry,m+1,r);		
			
			mergeAscending(compPriceArry,l,m,r);
				    			    	    
		}		
		
		
	}

	public static void mergeAscending(double[] arr, int l, int mid, int r) {
		// merge in ascending order
		
		int llength = mid-l+1;
		int rlength = r-mid;
				
		double Leftarry[] = new double[llength];
		double Rightarry[] = new double [rlength];
		
		for (int i=0; i< llength ; i++) {
			Leftarry[i] = arr[l+i];
		}
		for (int j=0; j< rlength ; j++) {
			Rightarry[j] = arr[mid+1+j];
		}

		int i,j,k ;
		i=0;
		j=0;
		k = l;

		while (i < llength && j < rlength ) {
//check to merge in ascending order			
	     if (Leftarry[i]<= Rightarry[j]) {
	    	 
	    	 arr[k] = Leftarry[i];
	    	 i++;
	    	 
	     }else {
	    	 
	    	arr[k] = Rightarry[j];
	    	j++;
	    	
	     }
		k++;
		}
	     while (i< llength) {
	    	 
	    	 arr[k] = Leftarry[i];
	    	 i++;
	    	 k++;
	    	 
	     }
		
	}

	public static void mergeSortDescending(double[] compPriceArry, int l, int r) {
		// for Descending order sorting
		if (l<r) {
			
			int m = (l+r)/2;		
			mergeSortDescending(compPriceArry,l,m);
			mergeSortDescending(compPriceArry,m+1,r);		
			
			mergeDescending(compPriceArry,l,m,r);
				    			    	    
		}		
		
		
	}

	private static void mergeDescending(double[] arr, int l, int mid, int r) {
		// merge in Descending order 
		int llength = mid-l+1;
		int rlength = r-mid;
				
		double Leftarry[] = new double[llength];
		double Rightarry[] = new double [rlength];
		
		for (int i=0; i< llength ; i++) {
			Leftarry[i] = arr[l+i];
		}
		for (int j=0; j< rlength ; j++) {
			Rightarry[j] = arr[mid+1+j];
		}

		int i,j,k ;
		i=0;
		j=0;
		k = l;

		while (i < llength && j < rlength ) {
//	check for merge in Descending order		
	     if (Leftarry[i]>= Rightarry[j]) {
	    	 
	    	 arr[k] = Leftarry[i];
	    	 i++;
	    	 
	     }else {
	    	 
	    	arr[k] = Rightarry[j];
	    	j++;
	    	
	     }
		k++;
		}
	     while (i< llength) {
	    	 
	    	 arr[k] = Leftarry[i];
	    	 i++;
	    	 k++;
	    	 
	     }
		
	}
	

}
