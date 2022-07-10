package com.gl.driver;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotesCount noteCount = new NotesCount();
		System.out.println("Enter the size of currency denominations");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] currency = new int[size];
		
		System.out.println("Enter the currency denominations value");
		
		for(int i=0;i<size;i++)
		{
			currency[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		MergeSort sort = new MergeSort();
		sort.sort(currency, 0, currency.length-1);
		System.out.println("Your payment approach in order to give min no of notes will be");
		NotesCount.notesCountImplementation(currency,amount);
		
	}

}
