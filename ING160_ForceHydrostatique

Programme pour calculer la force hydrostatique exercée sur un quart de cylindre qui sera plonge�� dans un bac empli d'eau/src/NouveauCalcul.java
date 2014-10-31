import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principale qui permet de lancer le projet
 * 
 * @author César Jeanroy
 *
 */

public class NouveauCalcul 
{
	private static int RO=1000;
	private static double G=9.81;

	public static void main(String[] args) 
	{
		ArrayList<Double> hauteurs = new ArrayList<Double>();
		boolean continuerSaisie=true;
		Scanner sc = new Scanner(System.in);
		
		while(continuerSaisie)
		{
			System.out.println("Veuillez saisir une hauteur ex: 19.5 ou écrire fin:");
			String str = sc.nextLine();
			if(str=="fin")
			{
				break;
			}
			else
			{
				double tmp = Double.parseDouble(str);
				hauteurs.add(tmp);
			}			
		}
		
		for(double d : hauteurs)
		{
			System.out.println("hauteur: "+d);
		}
		
		sc.close();
		

	}

}
