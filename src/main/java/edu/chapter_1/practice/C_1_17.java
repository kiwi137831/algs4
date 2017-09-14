package edu.chapter_1.practice;

public class C_1_17 {
	public  static String exR2(int n){
		if (n<=0) return "";
		String s= exR2(n-3)+n+exR2(n-2)+n;
		System.out.println((n-3)+"  "+(n-2));
		
		return s;
		
		
	}

	public static void main(String[] args) {
	
		exR2(3);
		
		
		
	}
	
	
}
