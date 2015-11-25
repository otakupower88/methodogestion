
public class TabEntier extends Tableau {

	private int tab[];
	
	public TabEntier(int tab[]){
		this.tab=tab;
	}

	public void tri(){
		
		for(int i=0;i<tab.length;i++){
			int x;
			for(int j=0;j<tab.length-1;j++){
				if(tab[j]>tab[j+1]){
					x=tab[j];
					tab[j]=tab[j+1];
					tab[j+1]=x;
				}
			}
		}
	}
	
	public void afficher(){
		for(int i=0;i<5;i++){
			System.out.println(this.tab[i]);
		}
	}

	public int[] getTab() {
		
		return tab;
	}

	public void setTab(int tab[]) {
		
		this.tab = tab;
	}
	
	
	
}
