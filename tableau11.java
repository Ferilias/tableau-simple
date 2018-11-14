package tableau;

public class Tableau11 {
	public static void main(String[] args) {
// initialisation des variables et du tableau manuellement
		int valeurtemp = 0;
		boolean permute = true;
		int[] tab = { 12, 15, 11, 22, -1, -2, 32, 8 };
		
		// boucle tri
		while (permute == true) {
			permute = false;
			for (int i = 0; i < tab.length -1; i++) {
				if (tab[i] > tab[i + 1]) {
					valeurtemp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = valeurtemp;
					permute = true;
				}
			}
		}
		afficheTableau(tab);
		// boucle qui ajoute 1 à tous les nombre du tableau 
		for (int i =0; i < tab.length; i++) {
			tab[i]=tab[i]+1;
		}
		afficheTableau(tab);
	}
	public static void afficheTableau(int[] tableau)
	{
		for (int i = 0; i < tableau.length; i++)
		{
			System.out.print(tableau[i] + " ");
		
		}
		
		System.out.println();
	}
}
