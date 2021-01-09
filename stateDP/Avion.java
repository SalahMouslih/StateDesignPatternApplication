package stateDP;

public class Avion {
	
	private Etat etat;
	
	public Avion() {
		etat = new Garage(this);
	}
	
	
	public void sortirDuGarage() {
		etat.sortirDuGarage();

	}


	public void entrerAuGarage() {
		etat.entrerAuGarage();

	}

	
	public void decoller() {
		etat.decoller();

	}

	
	public void atterir() {
		etat.atterir();

	}

	
	public void doAction() {
		etat.doAction();
		
	}
	
	public Etat getEtat() {
		return etat;
	}
	
	public void setEtat(Etat etat) {
		this.etat=etat;
	}
}	