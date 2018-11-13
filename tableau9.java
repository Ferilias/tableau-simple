package tableau;
import java.util.Scanner;

public class tableau9 {
public static void main(String[] args)
{

int nbre = 0;
int tailletab = 0;
int max = 0;
int pos = 0;

Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];

for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
}

for (int i = 0; i <= tailletab - 1; i++)
{
    if (tableauNbre[i] > max)
    {
        max = tableauNbre[i];
        pos = i;
    }

}
    System.out.println("Le maximum est "+max+" en position"+pos);
sc.close();
}

}
