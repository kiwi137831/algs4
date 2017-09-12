package edu.chapter_1.practice;

public class demo {
	
	public static int log(int n){
		int m= 2;
		int k=0;
		for (int j=0;j<n;j++){
			k=m;
			m*=2;
			System.out.println(m);
			
		if(m>n) {
			return j+1;
		}
		}
		
		 return 0;
		
		
	}
	public static String exR1(int n)
	{
	if (n <= 0) return "";
	return exR1(n-3) + n + exR1(n-2) + n;
	}

	public static int mystery(int a, int b)
	{
	if (b == 0) return 0;
	if (b % 2 == 0) return mystery(a*a, b/2);
	return mystery(a*a, b/2) + a;
	}

	
	
	public static void main(String[] args){
		
		//System.out.println(log(100));
		
		System.out.println(mystery(3,3));
	}

}
