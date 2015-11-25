import java.util.Random;
import java.util.Scanner;


public class Menu {

	public Menu(){
		int x=0;
		int y=0;
		int z=0;
		int a=0;
		Tableau tabl = new Tableau();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1- Creer tableau d'entiers");
			System.out.println("2- Creer tableau de String");

				y = sc.nextInt();
				if(y==1){
					do{
					System.out.println("1- Generer aléatoirement");
					System.out.println("2- Remplir le tableau");
					
						z = sc.nextInt();
						if(z==1){
							Random rand = new Random();
							int tab[]={0,0,0,0,0};
							for(int i=0;i<5;i++){
								tab[i]=rand.nextInt(11);
							}
							
							tabl =  new TabEntier(tab);	
							tabl.afficher();
						}
						else if(z==2){
							int tab[]={0,0,0,0,0};
							for(int i=0;i<5;i++){
								a= sc.nextInt();
								tab[i]=a;
							}
							 tabl = new TabEntier(tab);
						}
						else{
							System.out.println("Erreur, Recommencez !");	
						} 
					}while(z!=1&&z!=2);
				}else if(y==2){
					String tab[]={"","","","",""};
					for(int i=0;i<5;i++){
						tab[i]=sc.nextLine();
					}
					tabl = (Tableau) new TabString(tab);
				}
				else{
					System.out.println("Erreur, Recommencez !");
				}
			}while(y!=1&&y!=2);			
		
			/*----------------------------------*/
			do {
				System.out.println("1- Trier tableau");
				System.out.println("2- Rechercher dans le tableau");
				System.out.println("3- EXIT");
				x = sc.nextInt();
				if(x==1){
					tabl.tri();
					tabl.afficher();
					x=0;
				}
				if(x==3){
					System.exit(0);
				}
			}while(x<1||x>3);
			sc.close();
		}
	}