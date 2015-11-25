
public class TabEntier {

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
			System.out.print(this.tab[i]);
			System.out.print("  ");
		}System.out.println("");
	}

	public int[] getTab() {
		
	 return	this.tab;
	}

	public void setTab(int tab[]) {
		
		this.tab = tab;
	}
	
	
	
}
