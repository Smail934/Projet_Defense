package Towers;


public class ExecutionTourelle extends Tourelle {
	
	private static int newPrix = 350;
	private static int newPrixRemboursement = 280;
	private static int newCoutAmelioration = 300;
	private static double newTmpsRechargement= 4;
	private static double newDegats = 70;
	private static double newRange = 180;
	
	public ExecutionTourelle(int x,int y) {
		super(x,y);
		this.Prix=newPrix;
		this.PrixRemboursement=newPrixRemboursement;
		this.CoutAmelioration=newCoutAmelioration;
		this.TmpsRechargement=newTmpsRechargement;
		this.Degats=newDegats;
		this.Range=newRange;
		this.typetower = type.EXECUTION;
		
	}
}
