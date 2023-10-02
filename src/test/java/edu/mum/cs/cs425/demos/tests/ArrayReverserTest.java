package edu.mum.cs.cs425.demos.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;


import edu.mum.cs.cs425.demos.tests.service.IArrayFlattenerService;


public class ArrayReverserTest
{
	public ArrayReversor arrayReverser;
	public IArrayFlattenerService arrayFlattenerService=mock(IArrayFlattenerService.class);
	
	@Before
	public void setUp() throws Exception 
	{
		this.arrayReverser =new ArrayReversor(arrayFlattenerService);
	}
	

	@After
	public void tearDown() throws Exception 
	{
		this.arrayReverser =null;
	}

	@Test
	public void testReverseFlattenedArray() 
	{
		int[][] inputArray= {{1,2},{3},{4,5,6}};
		when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new int[] {1,2,3,4,5,6});
		int[] actual= arrayReverser.reverseFlattenedArray(inputArray);
		assertThat(actual,is(new int[] {6,5,4,3,2,1}));
	}
	
	@Test
	public void testReverseFlattenedArrayWhenInputNull() 
	{
		arrayFlattenerService.flattenArray(null);
		Mockito.verify(arrayFlattenerService).flattenArray(ArgumentMatchers.isNull());
	}
}
