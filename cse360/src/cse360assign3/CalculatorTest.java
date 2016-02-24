package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testCalculator(){
    	Calculator calc = new Calculator();
    	assertNotNull (calc);
    }
    
    @Test
    public void testgetTotal(){
    	Calculator calc = new Calculator();
    	assertEquals(0,calc.getTotal());
    }
    
	@Test
	public void testadd() {
		Calculator calc = new Calculator();
		calc.add(3);
		assertEquals(3,calc.getTotal());
	}
	
	@Test
	public void testsubtract(){
		Calculator calc = new Calculator();
		calc.subtract(10);
		assertEquals(-10,calc.getTotal());
	}
	
	@Test
	public void testmultiply(){
		Calculator calc = new Calculator();
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
		calc.add(-1);
		calc.multiply(-1);
		assertEquals(1,calc.getTotal());
	}
	
	@Test
	public void testdivide(){
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0,calc.getTotal());
		calc.add(-1);
		calc.divide(-1);
		assertEquals(1,calc.getTotal());
	}

	@Test
	public void testgetHistory(){
		Calculator calc = new Calculator();
		assertEquals("0",calc.getHistory());
		calc.add(3);
		calc.subtract(2);
		calc.multiply(4);
		calc.divide(0);
		assertEquals("0 + 3 - 2 * 4 / 0",calc.getHistory());

		
	}
}
