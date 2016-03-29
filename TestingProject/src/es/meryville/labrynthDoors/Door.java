package es.meryville.labrynthDoors;

public class Door {
	private boolean certainDeath;
	private boolean allwaysTellsTheTruth;

	public void setToCertainDeath(boolean b) {
		 this.certainDeath=b ;		
	}

	public boolean enter() {		
		return !certainDeath;
	}


	public void setAllwaysTellsTheTruth(boolean b) {
		this.allwaysTellsTheTruth = b;		
	}

	public boolean askToCertainDeath() {
	    if (allwaysTellsTheTruth){
	    	return certainDeath;
	    }else {
	    	return !certainDeath; 
	    }
		
	}

	public boolean askToCertainDeath(Door doorTwo) {
		if (allwaysTellsTheTruth){
	    	return doorTwo.askToCertainDeath();
	    }else {
	    	return !doorTwo.askToCertainDeath(); 
	    }		
		
	}

}
