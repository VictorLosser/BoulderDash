package worlds;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import states.GameState;
import view.Handler;
import view.View;

public class WorldTest {

	private World world;
	private GameState gamestate;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		Handler handler = null;
		
		GameState gameState = new GameState(handler);
		
        
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testGetWidth(){
		int expected = 40;
		int actual = world.getWidth();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGeHeight(){
		int expected = 22;
		int actual = world.getHeight();
		assertEquals(expected, actual);
	}

}
