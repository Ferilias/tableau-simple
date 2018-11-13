package tableau;
import java.util.Scanner;

public class tableau1 {
public static void main(String[] args)
{

int nbre = 0;
int tailletab = 0;
// on peut le faire avec 10 valeurs.
// int tailletab = 10;

Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");

tailletab = sc.nextInt();
int tableauNbre[] = new int [tailletab];
sc.close();

for (int i = 0; i <= tailletab - 1; i++)
{
    nbre = i;
    tableauNbre[i] = nbre;
    System.out.println(i);
}
}
}
