package stateDP;

public abstract class Etat {
	
	protected Avion avion;
	
	public Etat(Avion avion) {
		this.avion=avion;
	}
	
	public abstract void sortirDuGarage();
	public abstract void entrerAuGarage();
	public abstract void decoller();
	public abstract void atterir();
	public abstract void doAction();


}

