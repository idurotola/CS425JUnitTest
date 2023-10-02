package edu.mum.cs.cs425.demos.tests;

import edu.mum.cs.cs425.demos.tests.service.IArrayFlattenerService;

public class ArrayReversor {

	public IArrayFlattenerService arrayFlattenerService;
	public static void main(String[] args) 
	{
		//new ArrayReversor().reverseArray();
	}
	
	public ArrayReversor(IArrayFlattenerService arrayFlattenerService )
	{
		this.arrayFlattenerService=arrayFlattenerService;
	}
	
	public int[] reverseFlattenedArray(int[][] nums)
	{
		int[] flattenedArray= arrayFlattenerService.flattenArray(nums);
		
		if(flattenedArray==null) {return null;}
		int[] output = new int[flattenedArray.length];
		
		for(int i=flattenedArray.length-1;i>=0;i--) {
			output[flattenedArray.length-1-i] = flattenedArray[i];
		}
		return output;
	}

}
