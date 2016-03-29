package es.meryville.doors;

public class Door {
	boolean certainDeath;
	boolean allwaysTellsTheTruth;

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
	
		return false;
	}

}
