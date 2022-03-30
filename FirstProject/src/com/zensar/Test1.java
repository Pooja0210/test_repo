package com.zensar;

import java.util.Scanner;

public class Test1 {
	static final int MAX_CHAR = 256;

	static void getCount(String str)  
	{    
	int count[] = new int[MAX_CHAR];  
	int len = str.length();  
	for (int i = 0; i < len; i++)  
	count[str.charAt(i)]++;  
	char ch[] = new char[str.length()];  
	for (int i = 0; i < len; i++)   
	{  
	ch[i] = str.charAt(i);  
	int found = 0;  
	for (int j = 0; j <= i; j++)  
	{  
	if (str.charAt(i)==ch[j])  
	found++;  
	}             
	if (found == 1)   
	System.out.println("Character :: "+ str.charAt(i)+ " : " + count[str.charAt(i)]);  
	}  
	}
	

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a string: ");
	String str= sc.nextLine();
	String str1=str.toLowerCase();
	getCount(str1);
}
}
