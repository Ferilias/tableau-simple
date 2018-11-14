package tableau;
import java.util.Scanner;

public class Tableau10 {
public static void main(String[] args)
{
	
// initialisation des variables
int nbre = 0;
int tailletab = 0;
int moyenne = 0;
int nombreSup = 0;

// création du tableau et scanner
Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];

// boucle qui calcule la somme des notess
for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
    moyenne = moyenne + nbre;
}
moyenne = moyenne / tailletab;
// boucle qui cherche les nombres supérieurs à la moyenne 
for (int i = 0; i <= tailletab - 1; i++)
{
    if (tableauNbre[i] > moyenne)
    {
        nombreSup++;
    }

}
    System.out.println("La moyenne est "+moyenne+" les notes qui en sont au dessus sont au nombre de "+nombreSup);
sc.close();
}

}
