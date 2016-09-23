package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //Even
	public void testIsEven() {
		MyInteger i = new MyInteger(4);
		assertTrue(i.isEven());
	}
	@Test
	public void testIsEvenFalse() {
		MyInteger i = new MyInteger(5);
		assertFalse(i.isEven());
	}
	
	@Test //Even Static
	public void testIsEvenStatic() {
		assertTrue(MyInteger.isEven(6));
	}
	@Test
	public void testIsEvenStaticFalse() {
		assertFalse(MyInteger.isEven(7));
	}
	
	
	@Test //Odd
	public void testIsOdd() {
		MyInteger i = new MyInteger(3);
		assertTrue(i.isOdd());
	}
	@Test
	public void testIsOddFalse() {
		MyInteger i = new MyInteger(2);
		assertFalse(i.isOdd());
	}
	
	@Test //ODD Static
	public void testIsOddStatic() {
		assertTrue(MyInteger.isOdd(7));
	}
	@Test
	public void testIsOddStaticFalse() {
		assertFalse(MyInteger.isOdd(6));
	}
	 
	@Test //Prime
	public void testIsPrime() {
		MyInteger i = new MyInteger(11);
		assertTrue(i.isPrime());
	}
	@Test
	public void testIsPrimeFalse() {
		MyInteger i = new MyInteger(14);
		assertFalse(i.isPrime());
	} 
	
	@Test //Prime Static
	public void testIsPrimeStatic() {
		assertTrue(MyInteger.isPrime(11));
	}
	@Test
	public void testIsPrimeStaticFalse() {
		assertFalse(MyInteger.isPrime(14));
	}
	
	
	@Test //Equals
	public void testIsEquals() {
		MyInteger i = new MyInteger(2);
		//assertTrue(i.equal()); //TODO figure out how to test equal
	}

}
