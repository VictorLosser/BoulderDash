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
	public void testGetxMove() throws Exception{
		final float expected = 0.0f;
		final float xMove = creature.getxMove();
		System.out.println(xMove);
		assertEquals(expected, xMove, 0.0);
	}
}
