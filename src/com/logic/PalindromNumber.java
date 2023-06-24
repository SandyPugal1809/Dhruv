package com.logic;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int num=515,res=0,rem=0,temp=num;
		
		while (num>0) {
			
			rem=num%10;
			res=res*10+rem;
			num=num/10;
			
			System.out.println(temp);
			
		
		}
		
		if (res==temp) {
			
			System.out.println("palindrom number");
			
		} else {

			System.out.println("not palindrom number");
		}
	}

}
