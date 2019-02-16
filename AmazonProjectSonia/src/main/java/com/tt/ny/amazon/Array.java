package com.tt.ny.amazon;

import java.util.Arrays;

public class Array {
   
	public static void main(String[] args) {
		int[] num=new int[3];
		num[0]=45;
		num[1]=5;
		num[2]=6;
		int sum=num[0]+num[1]+num[2];
	    int[] num1 = {40,56,4,56};
	    int sum1=0;
	    for(int i=0;i<num1.length;i++) {
	    	sum1=sum1+num1[i];
	    }
	   int min=Arrays.stream(num1).min().getAsInt();//to get min number
	    System.out.println(num1.length);
	    System.out.println(sum);
	    System.out.println(sum1);
	    
	    
	}

}
