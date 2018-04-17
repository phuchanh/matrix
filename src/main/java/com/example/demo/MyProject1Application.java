package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProject1Application {

	public static void main(String[] args) throws Exception 
	{
		SpringApplication.run(MyProject1Application.class, args);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m:");
		String m = br.readLine();
		int m1 = Integer.parseInt(m);
		System.out.println("Enter n:");
		String n = br.readLine();
		int n1 = Integer.parseInt(n);
		Matrix ma = new Matrix(m1,n1);
		ma.RandomizeAndSave("E:\\test.txt");
		//System.out.println(m.toString());		
	}
}
