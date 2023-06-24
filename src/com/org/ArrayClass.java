package com.org;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		int a [][]= new int [7][7];
		
		a[0][0]=10;
		a[1][1]=20;
		a[2][2]=30;
		a[3][3]=40;
		a[4][4]=40;
		a[5][5]=50;
		a[6][6]=60;
		
		System.out.println(a[4][4]);
		
		int length = a.length;

		System.out.println(length);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i][i]);
		}
	}
}

//		List<Integer> b = new ArrayList<Integer>();
//		
//		b.add(10);
//		b.add(20);
//		b.add(30);
//		b.add(40);
//		b.add(50);
//		b.add(60);
//		b.add(70);
//		
//		Integer remove = b.remove(3);
//		
//		System.out.println(remove);
//		
//		System.out.println(b);
//		
//		long mobile =75502531932323L;
		
			
//		}
//	}
//
//}
