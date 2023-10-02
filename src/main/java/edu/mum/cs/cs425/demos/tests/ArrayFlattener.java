package edu.mum.cs.cs425.demos.tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {
	public static void main(String[] args)
	{
		int[][] nums= {{1,2},{3},{4,5}};
		Object[] output = new ArrayFlattener().flattenArray(nums);
		for(Object n:output) {
			System.out.println(n.toString());
		}
	}
	Object[] flattenArray(int[][]nums) {
		if(nums==null) {return null;}
		int elementCount = 0;
		List<Integer> numberList= new ArrayList<Integer>();
		for(int[] arr:nums) {
			for(int i: arr) {
				numberList.add(i);
			}
		}
		
		return numberList.toArray();
	}	
	
}
