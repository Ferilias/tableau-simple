package tableau;
import java.util.Scanner;

public class Tableau03 {
public static void main(String[] args)
{
// initialisation des variables
int nbre = 0;
int tailletab = 0;

// Création du scanner et du tableau
Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();
int tableauNbre[] = new int [tailletab];
int tableauNbre2[] = new int [tailletab];

// Boucle qui remplis les deux tableaux avec des saisies
for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
    tableauNbre2[tailletab-1-i] = nbre;
}
// Affichage des deux tableaux pour voir les différences .
for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("la Valeur numéro "+i+" du tableau 1 est egal a : "+tableauNbre[i]);
    System.out.println("la Valeur numéro "+i+" du tableau 2 est egal a : "+tableauNbre2[i]);
}
sc.close();
}

}
