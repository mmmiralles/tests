package es.meryville.labrynthDoors;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DoorsTest {	
	
	Door truthfulDoorToCertainDeath;
	
	@Before
	public void CreateTruthfulDoorToCertainDeath(){	
	 truthfulDoorToCertainDeath = new Door();				
	 truthfulDoorToCertainDeath.setToCertainDeath(true);
	 truthfulDoorToCertainDeath.setAllwaysTellsTheTruth(true);
	}
	
	

	@Test
	public void TestDoorToCertainDeath(){		
		
		assertTrue(!truthfulDoorToCertainDeath.enter());		
	}
	
	@Test
	public void testDoorAllwaysTellsTheTruth(){						
		assertTrue(truthfulDoorToCertainDeath.askToCertainDeath());			
	}
	
	@Test
	public void testDoorAllwaysLies(){					
		truthfulDoorToCertainDeath.setAllwaysTellsTheTruth(false);		
		assertTrue(!truthfulDoorToCertainDeath.askToCertainDeath());			
	}
	
	
	@Test
	public void testDoorAskOtherDoor(){		
		
		Door doorTwo = new Door();		
		doorTwo.setAllwaysTellsTheTruth(false);
		doorTwo.setToCertainDeath(false);		
		
		assertTrue(truthfulDoorToCertainDeath.askToCertainDeath(doorTwo));		
		assertTrue(!doorTwo.askToCertainDeath(truthfulDoorToCertainDeath));		
	}
}
