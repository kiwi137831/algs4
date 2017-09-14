package edu.chapter_1.practice;
import java.lang.Math;

public class C_1_20 {
	
	
	public static double  loge( int i ){
		double m=0;
		for (int j=1;j<=i;j++){
			m+=Math.log(j);
			
		}
		
		return m;
	}
	
	
	public static void main(String [] args){
		
		int i = 6;
		System.out.println(loge(i));
		System.out.println(Math.log(720));
		
		
		
		
	}

}
