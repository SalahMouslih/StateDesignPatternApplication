package stateDP;

public class Air extends Etat {

	public Air(Avion avion) {
		super(avion);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void sortirDuGarage() {
		System.err.println("Action impossible! l'avion est en l'air!");


	}

	@Override
	public void entrerAuGarage() {
		System.err.println("Action impossible! l'avion est en l'air!");

	}

	@Override
	public void decoller() {
		System.err.println("Avion déja en l'air!");

	}

	@Override
	public void atterir() {
		System.out.println("Avion va atterir sur la piste");
		avion.setEtat(new Piste(avion));


	}

	@Override
	public void doAction() {
		System.out.println("Avion est maitenant en l'air");

	}

}
