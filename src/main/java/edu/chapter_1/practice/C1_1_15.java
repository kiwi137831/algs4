package edu.chapter_1.practice;

public class C1_1_15 {
	public static int[] histogram (int []a, int m){
		
		int []b= new int [m];
		
		for (int i=0; i<m;i++){
			for (int j=0;j<a.length;j++){
				if(i==a[j]){
					b[i]++;
					
				}

			}

		}
	  return b;	
		
		
		
	}
	public static int add (int []a){
		int b=0;
		for (int i=0;i<a.length;i++){
			b+=a[i];
			
			
		}
		
		
		
		return b;
		
		
		
	}
	
	public static void main(String[] args){
		//int [] a = new int [6];
		int  a[]= {1,3,3,4,5,6,7};
		
		
		
		System.out.println(add (histogram(a,9)));
		System.out.println(a.length);
		
		
		
		
	}

}
