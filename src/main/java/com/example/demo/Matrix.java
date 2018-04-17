package com.example.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Matrix 
{
	private int m=1,n=1;
	private int a[][] = new int [10][10];
	public Matrix(int m, int n) 
	{
		this.m = m;
		this.n= n;
	}
	public void RandomizeAndSave(String path) throws Exception 
	{
		Writer output = new BufferedWriter(new FileWriter(path));
		for (int i=0; i<m; i++) 
		{
			for(int k=0; k<n;k++)
            {				
				int random = (int )(Math.random() * 100 + 1);
				a[i][k] = random;	
				System.out.print(Integer.toString(a[i][k])+" ");
				output.write(String.valueOf(a[i][k])+"\t");
			}
			System.out.print("\n");	
			output.write("\n");			
		}
		output.close();
	}
	
}
