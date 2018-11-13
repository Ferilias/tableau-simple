package tableau;
import java.util.Scanner;

public class tableau2 {
public static void main(String[] args)
{

int nbre = 0;
int tailletab = 0;

Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();
int tableauNbre[] = new int [tailletab];
int tableauNbre2[] = new int [tailletab];

for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
    System.out.println("la Valeur numéro "+i+"du tableau est egal a : "+nbre);
    tableauNbre2[tailletab-1-i] = nbre;
}
sc.close();
}

}
