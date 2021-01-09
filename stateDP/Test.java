package stateDP;

public class Test {

	public static void main(String[] args) {
		Avion avion = new Avion();
		//l'avion au début est au garage
		avion.doAction();
		
        System.out.print("\n ****************************\n  ");

        avion.decoller(); avion.doAction();
        
        System.out.print("\n ****************************\n ");

        avion.entrerAuGarage();avion.doAction();

        System.out.print("\n ****************************\n ");

        avion.sortirDuGarage(); avion.doAction();
        
        System.out.print("\n ****************************\n ");
        
        avion.decoller(); avion.doAction();

        System.out.print("\n ****************************\n ");

        avion.entrerAuGarage(); avion.doAction();
        
        System.out.print("\n ****************************\n ");

        avion.atterir(); avion.doAction();
        
        System.out.print("\n ****************************\n ");

        avion.decoller(); avion.doAction();
        
        System.out.print("\n ****************************\n ");

        avion.entrerAuGarage(); avion.doAction();
        
        System.out.print("\n ****************************\n ");

        avion.atterir(); avion.doAction();
        
        System.out.print("\n ****************************\n ");

        avion.entrerAuGarage(); avion.doAction();
	}
	
}
