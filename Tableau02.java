package tableau;

import java.util.*;

public class Tableau02 {

	public static void main(String[] args) {
// initialisaiton des variables
		int nbre = 0;
		int tailletab = 0;
		int moyenne = 0;

		// Création du tableau et du scanner pour la taille
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez une taille");
		tailletab = sc.nextInt();

		int tableauNbre[] = new int[tailletab];

		// Boucle pour remplir le tableau et calculé la moyenne
		for (int i = 0; i <= tailletab - 1; i++) {
			System.out.println("Donnez une nombre");
			nbre = sc.nextInt();
			tableauNbre[i] = nbre;
			moyenne = moyenne + nbre;
		}
		// affichage de la somme avec "moyenne" puis calcule de la moyenne
		System.out.println("La somme est " + moyenne);
		moyenne = moyenne / tailletab;

		System.out.println("La moyenne est " + moyenne);
		sc.close();
	}

}
