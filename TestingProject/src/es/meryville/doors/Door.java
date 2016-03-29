package es.meryville.doors;

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

}
