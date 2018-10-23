package test.java;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Item;
import main.java.RandomNumber;
import main.java.SortAlgos;
import main.java.SortDemoData;
import main.java.Main;

public class AlgoTest {

	
	SortDemoData data = new SortDemoData();
	SortDemoData data2 = null;
	SortDemoData data3 = new SortDemoData();
	
	SortDemoData data4 = new SortDemoData();
	SortDemoData data5 = new SortDemoData();
	SortDemoData data6 = new SortDemoData();
	SortDemoData data7 = new SortDemoData();
	SortDemoData data8 = new SortDemoData();
	SortDemoData baddata = new SortDemoData();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		// intializing arrays with all types of inputs
		
		// single data
		data.initializeArray("10");
		
		//0 input
		data3.initializeArray("0");
		
		// random array
		data4.initializeArray("1 3 4 7 10 2");
		
		// sorted array
		data5.initializeArray("1 2 3 4 5 6");
		
		// unsorted array
		data6.initializeArray("9 8 7 6 5");
		
		// same input
		data7.initializeArray("7 7 7 7");
		
		// negative input
		data8.initializeArray("-2 -3 -4");
		//baddata.initializeArray("b a d");
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAllSortingAlgos() {
		
		// testing all the sorting Algorithms with the data inputs initialized above
		// also testing the default switch case in sortDemoTest
		
		data.runAlgo(0);
		data.runAlgo(1);
		data.runAlgo(2);
		data.runAlgo(3);
		data.runAlgo(4);
		data.runAlgo(5);
		data.runAlgo(6);
		data.runAlgo(7);
	
		data4.runAlgo(0);
		data4.runAlgo(1);
		data4.runAlgo(2);
		data4.runAlgo(3);
		data4.runAlgo(4);
		data4.runAlgo(5);
		data4.runAlgo(6);
		data4.runAlgo(7);
		
		data5.runAlgo(0);
		data5.runAlgo(1);
		data5.runAlgo(2);
		data5.runAlgo(3);
		data5.runAlgo(4);
		data5.runAlgo(5);
		data5.runAlgo(6);
		data5.runAlgo(7);
		
		
		data6.runAlgo(0);
		data6.runAlgo(1);
		data6.runAlgo(2);
		data6.runAlgo(3);
		data6.runAlgo(4);
		data6.runAlgo(5);
		data6.runAlgo(6);
		data6.runAlgo(7);
		
		data7.runAlgo(0);
		data7.runAlgo(1);
		data7.runAlgo(2);
		data7.runAlgo(3);
		data7.runAlgo(4);
		data7.runAlgo(5);
		data7.runAlgo(6);
		data7.runAlgo(7);
		
		data8.runAlgo(0);
		data8.runAlgo(1);
		data8.runAlgo(2);
		data8.runAlgo(3);
		data8.runAlgo(4);
		data8.runAlgo(5);
		data8.runAlgo(6);
		data8.runAlgo(7);
	}
	
	// checking with a bad input
	@Test(expected=java.lang.NumberFormatException.class)
	public void testNumberFormatInput() {
		baddata.initializeArray("2 e e 5");
		
	}

	// checking each sorting algos with a null input
	
	@Test(expected=NullPointerException.class)
	public void testNullInputonInsertion() {
		SortAlgos.insertionSort(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullInputonBubble() {
		SortAlgos.bubbleSort(null);
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testNullInputonHeap() {
		SortAlgos.heapSort(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullInputonMerge() {
		SortAlgos.mergeSort(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullInputonQuick() {
		SortAlgos.quickSort(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullInputonSelection() {
		SortAlgos.selectionSort(null);
	}
	
	

}
