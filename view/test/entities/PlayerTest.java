package entities;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import graphics.Assets;
import view.Handler;

public class PlayerTest extends CreatureTest {

	private Player player;
	private Creature creature;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Handler handler = null;
		this.creature = new Player(handler, 0.0f,0.0f);
		

		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetxMove() throws Exception{
		super.testGetxMove();
		final float expected = 0;
		final float xMove = this.creature.getxMove();
		assertEquals(expected, xMove);
	}
}
