package Towers;

import jeux.Joueur;
import Mob.Ennemy;

public abstract class Tourelle {
	public enum type{GEL,BASIC,EXECUTION}
	protected int PosX;
	protected int PosY;
	protected double Range;
	protected double Degats;
	protected int Prix;
	protected int PrixRemboursement;
	protected Ennemy target;
	protected int CoutAmelioration;
	protected double TmpsRechargement;
	protected long DerniereAttaque;
	protected int level=1;
	protected static int lvlMax = 4;
	protected double angleDeRotation;
	protected boolean GelTower=false;
	protected double BaseAvant=1.0; // les stats avant augmentation
	protected double BaseApres=1.3; //  les stats après augmentations
	protected type typetower;
	
	public Tourelle(int posX, int posY) {
		PosX = posX;
		PosY = posY;
		DerniereAttaque=0;
		angleDeRotation=0;
		
	}
	
	
	public void Remboursement() {
		Joueur.getJoueur().addMoney(PrixRemboursement);
	}
	
	public boolean canAttaque(){ // renvoie true si la tourelle peut attaquer et false sinon.
		if( (System.currentTimeMillis()-DerniereAttaque)/1000.0 >= TmpsRechargement){

			return true;
		}
		else
			return false;
	}
	
	public boolean upgrade() {
		if(level < lvlMax && Joueur.getJoueur().getMoney()>=CoutAmelioration){
			level++;
			Joueur.getJoueur().addMoney(-1*CoutAmelioration);
			return true;
		}
		return false;
	}
	
	public double getAngleDeRotation() {
		if(target!= null) {
			angleDeRotation=(180/Math.PI)*Math.atan2(target.getPosY()-PosY, target.getPosX()-PosX);
		}
		return angleDeRotation;
	}
	
	public boolean isGelTower(){
		return GelTower;
	}
	
	public double getAmelioration(){
		return (BaseAvant + ((level-1)*BaseApres));
	}


	public int getPosX() {
		return PosX;
	}


	public void setPosX(int posX) {
		PosX = posX;
	}


	public int getPosY() {
		return PosY;
	}


	public void setPosY(int posY) {
		PosY = posY;
	}


	public double getRange() {
		return Range*getAmelioration();
	}


	public void setRange(double range) {
		Range = range;
	}


	public double getDegats() {
		return Degats*getAmelioration();
	}


	public void setDegats(double degats) {
		Degats = degats;
	}


	public int getPrix() {
		return Prix;
	}


	public void setPrix(int prix) {
		Prix = prix;
	}


	public int getPrixRemboursement() {
		return PrixRemboursement;
	}


	public void setPrixRemboursement(int prixRemboursement) {
		PrixRemboursement = prixRemboursement;
	}


	public Ennemy getTarget() {
		return target;
	}


	public void setTarget(Ennemy target) {
		this.target = target;
	}


	public int getCoutAmelioration() {
		return CoutAmelioration;
	}


	public void setCoutAmelioration(int coutAmelioration) {
		CoutAmelioration = coutAmelioration;
	}


	public long getDerniereAttaque() {
		return DerniereAttaque;
	}


	public void setDerniereAttaque(long derniereAttaque) {
		DerniereAttaque = derniereAttaque;
	}


	public int getLevel() {
		return level;
	}
	public type getType(){
		return this.typetower;
	}
	
	
}
