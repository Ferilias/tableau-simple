package tableau;

public class Tableau04 {

	public static void main(String[] args) {
		// initialisation des variables
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int courant = Integer.MIN_VALUE;
		boolean croissantP = true;
		
		// création du tableau manuellement
		int[] tableau = {0, 2, 4, 3, 7, 10, 15};
		// boucle qui compare, le minimum, maximum et si c'est croissant
		for (int i = 0; i < tableau.length; i++)
		{
			if (tableau[i] > max)
			{
				max = tableau[i];
			}
			
			if (tableau[i] < min)
			{
				min = tableau[i];
			}
			
			
			if (tableau[i] < courant)
			{
				croissantP = false;
				
			}
			
			courant = tableau[i];
		}
		// affichage des valeurs demandées
		System.out.println("max => " + max);
		System.out.println("min => " + min);
		System.out.println("croissant => " + croissantP);
		
		afficheTableau(tableau);
	}
	
	// méthode d'affichage du tableau
	public static void afficheTableau(int[] tableau)
	{
		for (int i = 0; i < tableau.length; i++)
		{
			System.out.print(tableau[i] + " ");
		
		}
		
		System.out.println();

	}

}
