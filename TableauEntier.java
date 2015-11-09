import java.lang.Math;

public class TableauEntier {
	
	private int tab[];	
	
	public TableauEntier(int[] tab, int taille){
		this.tab = tab; 
		int i;
		for(i=0;i<taille;i++)
			tab[i]=(int)(Math.random()*10);
	}
	
	public int getTaille(int [] tab){
		return tab.length;
	}

	public int[] getTab() {
		return tab;
	}

	public void setTab(int[] tab) {
		this.tab = tab;
	}
	
	public void affichageTab(int[] tab, int taille) {
		int i;
		for(i=0;i<taille;i++){
			System.out.println("Case @ " + i + " : " + tab[i] + ".");
		}
	}
	
	public int tabRecherche(int[] tab, int taille, int a){
		int i;
		for(i=0;i<taille;i++){
			if(tab[i] == a){
				System.out.println("Le nombre que vous cherchez existe il est à la place : " + i  );
				return 0;
			}
		}
		
	 System.out.println("Ce nombre n'existe pas dans le tableau");
	 return 0;
	
	}
}
