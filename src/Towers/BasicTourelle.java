package Towers;


public class BasicTourelle extends Tourelle {
	private static int newPrix = 100;
	private static int newPrixRemboursement = 70;
	private static int newCoutAmelioration = 110;
	private static double newTmpsRechargement= 0.3;
	private static double newDegats = 35;
	private static double newRange = 100;
	
	public BasicTourelle(int x,int y) {
		super(x,y);
		this.Prix=newPrix;
		this.PrixRemboursement=newPrixRemboursement;
		this.CoutAmelioration=newCoutAmelioration;
		this.TmpsRechargement=newTmpsRechargement;
		this.Degats=newDegats;
		this.Range=newRange;
		this.typetower = type.BASIC;
	}
	
	
	
}
