package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ViewTest {

	private View view;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		view = new View("Boulder Dash!", 1, 2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHeight(){
		final int expected = 2;
		assertEquals(expected, view.getHeight());
	}
	
	@Test
	public void testGetWidth(){
		final int expected = 1;
		assertEquals(expected, view.getWidth());
	}
	
	@Test
	public void testGetTitle(){
		final String expected = "Boulder Dash!";
		assertEquals(expected, view.getTitle());
	}

}
