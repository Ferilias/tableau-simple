package tableau;
import java.util.Scanner;
// Autre test exercice 4
public class Tableau04bis {
public static void main(String[] args)
{

int nbre = 0;
int tailletab = 0;
int max = 0;
int min = 0;
boolean croissant = true;

Scanner sc = new Scanner(System.in);
System.out.println("Donnez une taille");
tailletab = sc.nextInt();

int tableauNbre[] = new int [tailletab];

for (int i = 0; i <= tailletab - 1; i++)
{
    System.out.println("Donnez une nombre");
    nbre = sc.nextInt();
    tableauNbre[i] = nbre;
    if (tableauNbre[i] > max)
    {
        max = tableauNbre[i];
    }
   
    if (tableauNbre[i] < min || i == 0)
    {
        min = tableauNbre[i];
    }
    if (i > 0 )
    {
      
        if (tableauNbre[i] < tableauNbre[i-1])
        {  
            System.out.println(tableauNbre[i] +" > "+ tableauNbre[i-1]);
            croissant = false;
        }
    }
    System.out.println("Le nombre est "+nbre+ " le maximum est : "+max+" le minimum "+min+ " le tableau est croissant "+croissant);
}
sc.close();
}

}
