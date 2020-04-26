package test;

import static org.junit.Assert.*;

import org.junit.Test;

import evenorodd.EvenOrOdd;

public class EvenOrOddTest {

	 public EvenOrOddTest() {
	    }
	     /**
	     * Test of isEvenNumber method, of class EvenOrOdd.
	     */
	    @Test
	    public void testIsEvenNumber() {
	        EvenOrOdd e = new EvenOrOdd();
	        assertTrue(e.isEvenNumber(4));
	        assertFalse(e.isEvenNumber(3));
	    }  

}
