package tableau;
import java.util.Scanner;

public class Tableau09 {
public static void main(String[] args)
{
	
// Initiaslisation des varibles
int nbre = 0;
int tailletab = 0;
int max = 0;
int pos = 0;

// Création du scanner et du tableau
Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];
// Boucle qui remplie le tableau
for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
}

// Boucle qui change en cherchant, le maximum et sa position
for (int i = 0; i <= tailletab - 1; i++)
{
    if (tableauNbre[i] > max)
    {
        max = tableauNbre[i];
        pos = i;
    }

}
    System.out.println("Le maximum est "+max+" en position "+pos);
sc.close();
}

}
