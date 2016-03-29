package es.meryville.doors;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoorsTest {	
	

	@Test
	public void TestDoorToCertainDeath(){		
		Door door = new Door();		
		door.setToCertainDeath(true);
		boolean youLive= door.enter();		
		assertTrue(!youLive);		
	}
	
	@Test
	public void testDoorAllwaysRight(){		
		Door door = new Door();		
		door.setAllwaysTellsTheTruth(true);
		door.setToCertainDeath(true);	
		boolean response = door.askToCertainDeath();
		assertTrue(response);		
	
	}
	
	@Test
	public void testDoorAskOtherDoor(){		
		Door door = new Door();		
		door.setAllwaysTellsTheTruth(true);
		door.setToCertainDeath(true);			
		assertTrue(door.askToCertainDeath());
		
	
	}
}
