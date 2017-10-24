package assignment3.Bruce;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class CalcImplTest extends TestCase {

	CalcImpl obj;
	int a,b;
	
	protected void setUp() throws Exception {
		obj = new CalcImpl();
		a = 4;
		b = 7;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(a,b)).thenReturn(a+b);
		when(mockObj.subtract(a,b)).thenReturn(a-b);
		when(mockObj.multiply(a,b)).thenReturn(a*b);
		when(mockObj.divide(a,b)).thenReturn((double) a/b);
		obj.setIntObj(mockObj);
	}

	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}

	public void testAdd() {
		assertEquals(11, obj.add(a, b));
	}

	public void testSubtract() {
		fail();
//		assertEquals(-3, obj.subtract(a, b));
	}

	public void testMultiply() {
		fail();
//		assertEquals(28, obj.multiply(a, b));
	}

	public void testDivide() {
		fail();
//		assertEquals((double) 4/7, (double) obj.divide(a, b));
	}

}
