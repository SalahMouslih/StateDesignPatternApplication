package stateDP;

public class Piste extends Etat {

	public Piste(Avion avion) {
		super(avion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sortirDuGarage() {
		System.err.println("Avion déja sorti du garage et est sur la piste");

	}

	@Override
	public void entrerAuGarage() {
		System.out.println("Avion va entrer au garage");
		avion.setEtat(new Garage(avion));

	}

	@Override
	public void decoller() {
		System.out.println("Avion va décoller");
		avion.setEtat(new Air(avion));

	}

	@Override
	public void atterir() {
		System.err.println("Avion déja sur la piste!");


	}

	@Override
	public void doAction() {
		System.out.println("Avion est maitenant sur la piste");


	}

}

