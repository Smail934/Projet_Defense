package Towers;


public class GelTower extends Tourelle {
	private static int newPrix = 200;
	private static int newPrixRemboursement = 180;
	private static int newCoutAmelioration = 180;
	private static int newTmpsRechargement= 4;
	private static int newDegats = 10;
	private static double newRange = 80;
	
	public GelTower(int x,int y) {
		super(x,y);
		this.Prix=newPrix;
		this.PrixRemboursement=newPrixRemboursement;
		this.CoutAmelioration=newCoutAmelioration;
		this.TmpsRechargement=newTmpsRechargement;
		this.Degats=newDegats;
		this.Range=newRange;
		this.typetower = type.GEL;
	}
}
