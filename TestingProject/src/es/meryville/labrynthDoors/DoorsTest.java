package es.meryville.labrynthDoors;

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
		Door doorOne = new Door();		
		doorOne.setAllwaysTellsTheTruth(true);
		doorOne.setToCertainDeath(true);	
		Door doorTwo = new Door();		
		doorTwo.setAllwaysTellsTheTruth(false);
		doorTwo.setToCertainDeath(false);			
		
		assertTrue(doorOne.askToCertainDeath(doorTwo));		
		assertTrue(!doorTwo.askToCertainDeath(doorOne));		
	}
}
