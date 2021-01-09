package stateDP;

public class Garage extends Etat {

	public Garage(Avion avion) {
		super(avion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sortirDuGarage() {
		System.out.println("Avion va sortir du garage");
		avion.setEtat(new Piste(avion));


	}

	@Override
	public void entrerAuGarage() {
		System.err.println("Avion déja au garage!");

	}

	@Override
	public void decoller() {
		System.err.println("Avion ne peut pas décoller! Il est déja au garage!");

	}

	@Override
	public void atterir() {
		System.err.println("Avion ne peut pas atterir! Il est déja au garage!");


	}

	@Override
	public void doAction() {
		System.out.println("Avion est maitenant au garage");

	}


}
