package main.java;
public class MethoGestion {

	public static void main(String[] args) {
		int taille = (int)(Math.random()*10);
		int[] tab = new int[taille];
		TableauEntier a=new TableauEntier(tab,tab.length);
		a.affichageTab(a.getTab(), a.getTaille(a.getTab()));
		a.tabRecherche(a.getTab(), a.getTaille(a.getTab()),5);

	}

}
