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
	
	View view;
	
	Handler handler;
	
	GameState gameState;
	
	World world;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		view = new View("Boulder Dash", 1900, 1200);
		
		handler = new Handler(view);
		
		gameState = new GameState(handler);
		
		world = new World(handler, gameState.getMapById(4).toString());
        
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testGetWidth(){
		int expected = 40;
		assertEquals(expected, world.getWidth());
	}
	
	@Test
	public void testGeHeight(){
		int expected = 22;
		assertEquals(expected, world.getHeight());
	}

}
