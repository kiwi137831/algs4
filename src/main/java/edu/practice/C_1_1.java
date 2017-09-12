package edu.practice;
import edu.princeton.cs.algs4.StdRandom;
public class C_1_1 {
	private static  void TestPrint(boolean[][] a) {
		// TODO Auto-generated method stub
		
		
		
	}

	public static  boolean[][] RandomInitial( boolean [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				{
				if(StdRandom.bernoulli(0.1))
				
					a[i][j]=true;
				else
					a[i][j]=false;
		}
		}
		return a;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a =new int [5][5];
		for (int i=0; i<a.length;i++){
		a[i][0]=1;
		}
		
		print(a);
		exchange(a);
		print(a);
	}
	public static void exchange(int a[][]){
		int m=0;
		
		for (int i=0;i<a.length;i++)
		{	//System.out.println(a.length);
			for (int j=0;j<(i+1)/2;j++){
				m=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=m;
				
	
				
				
				
			}
		}
	
	}
	public static void print (int a[][]){
		for (int i=0;i<a.length;i++)
		{	//System.out.println(a.length);
			System.out.println();
			for (int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
				
				
			}
		}
		
	}
	
	
}
