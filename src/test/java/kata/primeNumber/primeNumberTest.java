package kata.primeNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class primeNumberTest {

	PrimeNumber primeNumber;

	@Before
	public void setUp() {
		primeNumber = new PrimeNumber();
	}

	@After
	public void tearDown() {
		primeNumber = null;
	}

	@Test
	public void firstPrimeNumber() {
		assertEquals("El primer numero primo", true, primeNumber.isPrimeNumber(2));
	}

	@Test
	public void secondPrimeNumber() {
		assertEquals("El segundo numero primo", true, primeNumber.isPrimeNumber(3));
	}

	@Test
	public void thirdPrimeNumber() {
		assertEquals("El tercer numero primo", true, primeNumber.isPrimeNumber(5));
	}

	@Test
	public void fourthPrimeNumber() {
		assertEquals("El cuarto numero primo", true, primeNumber.isPrimeNumber(7));
	}

	@Test
	public void fifthPrimeNumber() {
		assertEquals("El quinto numero primo", true, primeNumber.isPrimeNumber(11));
	}

	@Test
	public void twentySixthPrimeNumber() {
		assertEquals("El numero primo numero ventiseis", true, primeNumber.isPrimeNumber(101));
	}

	@Test
	public void numberZeroNotPrime() {
		assertEquals("El cero no es numero primo", false, primeNumber.isPrimeNumber(0));
	}

	@Test
	public void numberOneNotPrime() {
		assertEquals("El numero uno no es numero primo", false, primeNumber.isPrimeNumber(1));
	}

	@Test
	public void numberFourNotPrime() {
		assertEquals("El cuartro no es numero primo", false, primeNumber.isPrimeNumber(4));
	}
	
	@Test(expected=NegativeNumberException.class)
	public void negativeNumberExceptionThrow(){
		primeNumber.isPrimeNumber(-1);
	}
}
