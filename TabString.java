
public class TabString extends Tableau {
	
	private String tab[];
	
	public TabString(String tab[]){
		this.tab=tab;
	}
	
	public void tri(){
		
		String x;
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab.length-1;j++){
				if(tab[j].compareTo(tab[j+1])>0){
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

	public String[] getTab() {
		return tab;
	}

	public void setTab(String tab[]) {
		this.tab = tab;
	}

}
