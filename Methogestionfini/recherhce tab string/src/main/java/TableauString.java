package main.java;

public class TableauString {
	

	public int rechercheDicho(String tab1[], String val) {

		boolean trouve;
		int id;
		int ifin;
		int im;

		trouve = false;
		id = 0;
		ifin = tab1.length;

		while (!trouve && ((ifin - id) > 1)) {

			im = (id + ifin) / 2;

			trouve = (tab1[im].compareTo(val) == 0);

			if (tab1[im].compareTo(val) > 0) {
				ifin = im;
			} else {
				id = im;
			}
		}
		
		if (tab1[id].compareTo(val) == 0) {
			System.out.println("la valeur est dans le tableau à l'indice: "
					+ id);
			return 1;
		} else {
			System.out.println("la valeur n'est pas dans le tableau ");
			return -1;

		}
	}
}
