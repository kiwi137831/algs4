package edu.chapter_1.practice;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class C1_21 {
	public static void main(String[] args) {
		String s = "Let's go for lunch!";
		In in = new In("G://a.txt");
	       
       String[] whitelist = in.readAllStrings();//将文件中的字符串读取到数组中
       for(int i=0;i<whitelist.length;i=i+3)
    	   
       {
    	  
    	 StdOut.print(whitelist[i]+"  "+whitelist[i+1]+"  "+whitelist[i+2]+"  ");
    	 double m=Double.parseDouble(whitelist[i+1]);
    	// StdOut.printf(m);
    	 double n=Double.parseDouble(whitelist[i+2]);
    	   StdOut.printf("0.3%",m/n);
    	
    		 StdOut.println("  ");
       }
       }
}
