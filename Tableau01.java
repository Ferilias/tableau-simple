package tableau;

public class Tableau01 {
public static void main(String[] args)
{
	
// initialisation variables
int nbre = 0;
int tailletab = 10;

// création du tableau
int tableauNbre[] = new int [tailletab];

// Boucle d'impression et remplissage du tableau
for (int i = 0; i <= tailletab - 1; i++)
{
    nbre = i;
    tableauNbre[i] = nbre;
    System.out.println(i);
}
}
}
