package tableau;
import java.util.Scanner;

public class Tableau12 {
public static void main(String[] args)
{
	
// initialisation des variables
int min = 0;
int max = 20;
int range = max - min;
int tailletab = 0;

// création du tableau et scanner
Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];
int tableauNbre2[] = new int [tailletab];
int tableauNbreSom[] = new int [tailletab];

// boucle qui remplie avec des valeurs aléatoires le tableau
for (int i = 0; i <= tailletab - 1; i++)
{
	tableauNbre[i]= (int)((Math.random() *range)- (min));
    System.out.println("La valeur du tableau 1 est "+tableauNbre[i]);
}
System.out.println(" ");
//boucle qui remplie avec des valeurs aléatoires le tableau
for (int i = 0; i <= tailletab - 1; i++)
{
	tableauNbre2[i]= (int)((Math.random() *range)- (min));
    System.out.println("La valeur du tableau 2 est "+tableauNbre2[i]);
}
System.out.println(" ");
// boucle qui calcule la somme des deux tableaux
// ils doivent être égales en nombre de cases mémoires
for (int i = 0; i <= tailletab - 1; i++)
{
	tableauNbreSom[i]= tableauNbre[i] + tableauNbre2[i];
    System.out.println("La valeur du tableau des sommes est "+tableauNbreSom[i]);
}
sc.close();
}

}

