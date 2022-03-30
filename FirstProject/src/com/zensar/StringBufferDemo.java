package com.zensar;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World"; //String literal declaration
		String str2 = new String("Hello World");
		// Strings are immutable in java - values cant be modified after creation
		
		System.out.println(str.toUpperCase());
		//String is a special data type in java.
		// Only String variables can be declared in both literal declaration & object declaration style.
		//String literals are created in String Constant pool
		//String Objects will be created in heap area.
		System.out.println(str);
		
		System.out.println(str==str2);
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		
		
		StringBuffer strBufferObj = new StringBuffer();
		strBufferObj.append(str2);
		strBufferObj.append(false);
		
		
		
	}

}
