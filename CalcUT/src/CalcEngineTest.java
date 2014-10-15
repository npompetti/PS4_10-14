import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

import Future_value.Calc;


public class CalcEngineTest extends Calc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public final void CalcTest(){
		double init_invest = 131;
		int years = 2;
		double interest = 10;
		String fv = calc_fv(init_invest, years, interest);
		String ans = calc_fv(init_invest, years, interest);		
		System.out.print(fv);
		//assertEquals("A was not equal to b",1,2);
		
		assertEquals(fv,"$158.51");
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


}
