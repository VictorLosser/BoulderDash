package mapdao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {

	private Map map;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		map = new Map(10,"nouvelle map");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		String expected = "nouvelle map" ;
		assertEquals(expected, map.getName());
	}

}
