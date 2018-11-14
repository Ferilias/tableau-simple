package tableau;
import java.util.Scanner;

public class Tableau13 {
public static void main(String[] args)
{
	//initialisation des valeurs
int min = 0;
int max = 20;
int range = max - min;
int resultat = 0;
int tailletab = 0;

// création tableau et du scanner
Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];
int tableauNbre2[] = new int [tailletab];

// remplissage des deux tableaux
for (int i = 0; i <= tailletab - 1; i++)
{
	tableauNbre[i]= (int)((Math.random() *range)- (min));
    System.out.println("La valeur du tableau 1 est "+tableauNbre[i]);
	tableauNbre2[i]= (int)((Math.random() *range)- (min));
    System.out.println("La valeur du tableau 2 est "+tableauNbre2[i]);
}
System.out.println(" ");
// affiche et effectue des calcules
for (int i = 0 ; i < tableauNbre.length; i++)
{
	for(int j = 0; j < tableauNbre2.length; j++)
	{
    resultat = resultat + (tableauNbre2[j] * tableauNbre[i]);
   System.out.print(tableauNbre2[j]+" * "+ tableauNbre[i]);
    if (j < tableauNbre2.length-1)
   {
    System.out.print(" + ");
   }

}
}
System.out.print(" = " + resultat);
sc.close();
}
}