package test.java;
import static org.junit.Assert.*;

import main.java.TableauEntier;

import org.junit.Test;


public class TableauEntierTest {


	@Test
	public void testTabRecherche() {
		int taille = (int)(Math.random()*10);
		int[] tab = new int[taille];
		TableauEntier a=new TableauEntier(tab,tab.length);
		
			int i;
			int b=(int)(Math.random()*10);
			boolean j;
			j=false;
			i=0;
			for(i=0;i<tab.length;i++){
				if(tab[i]==b){
					j=true;
				}
				
			}
			if(a.tabRecherche(tab, taille, b)!=j){
				fail();
				
			}
	}

	

}
