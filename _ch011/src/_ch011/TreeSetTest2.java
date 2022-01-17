package _ch011;

import java.util.*;

public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score= {80,89,64,32,50,85,75,99,100};
		
		for(int i=0;i<score.length;i++) {
			set.add(score[i]);
			
		}
		System.out.println("50보다 작은 값: "+set.headSet(50));
		System.out.println("50보다 큰 값: "+set.tailSet(50));
		System.out.println("30과 85사이의 값: "+set.subSet(30, 85));
		
		
	}
}

