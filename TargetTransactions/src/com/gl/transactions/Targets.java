package com.gl.transactions;

import java.util.Scanner;

public class Targets {
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array ");
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int targetNo = sc.nextInt();
		
		while(targetNo-- !=0) {
			int flag = 0;
			long target;
			
		System.out.println("Enter the value of target");
		target = sc.nextInt();
		
		long sum=0;
		int tar = 0;
		for(int i=0;i<size;i++) {
			
			sum += arr[i];  // 10,20,30
			++tar;
			
			
			if(sum>=target) {
				
				System.out.println("Target achieved after " + tar + " transactions");
				flag =1;				
				break;
			}
			
		}
			
			if(flag == 0) {
				System.out.println("Given target is not achieved");
			}
			
		
		
			
		}
		
	}

}
