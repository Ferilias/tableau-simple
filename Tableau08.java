package tableau;
import java.util.Scanner;

public class Tableau08 {
public static void main(String[] args)
{
	
// Initialisation des variables
int nbre = 0;
int tailletab = 0;
int reste = 0;
int trois = 0;
int no_trois = 0;

// Création du tableau et scanner
Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];

// boucle qui calcule les nombres multiples de 3 et les autres
for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
    reste = nbre % 3;
    if (reste == 0)
    {
        trois = trois +1;
    }
   
    else if (reste != 0)
    {
        no_trois = no_trois +1;
    }
}
    System.out.println("Le nombre de multiple de 3 est "+trois+" et le nombre restant est "+no_trois);
sc.close();
}

}
