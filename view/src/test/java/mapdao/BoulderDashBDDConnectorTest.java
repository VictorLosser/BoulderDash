package mapdao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoulderDashBDDConnectorTest {

	BoulderDashBDDConnector boulderDashBDDConnector;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		boulderDashBDDConnector = new BoulderDashBDDConnector();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExecuteUpdate() throws Exception{
		int expected = 1; 
		assertEquals(expected, boulderDashBDDConnector.executeUpdate("INSERT INTO example VALUES (520000, 'le test junit a marche')"));
	}
	
	@Test
	public void testOpen(){
		boolean expected = true;
		assertEquals(expected, boulderDashBDDConnector.open());
	}

}
