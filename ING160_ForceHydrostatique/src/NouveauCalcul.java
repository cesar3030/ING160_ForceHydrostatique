import java.text.DecimalFormat;
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
	//Hauteur en mm
	private static double hauteurTotaleDispositif=200;
	//Hauteur en mm
	private static double hauteurSurfacePlane=100;
	//Largeur en mm
	private static double baseSurfacePlane=74;
	//Angle entre la surface de l'eau et le surface plane (en degres) 
	private static double angle=90;
	//Format d'affichage des doubles
	private static DecimalFormat df = new DecimalFormat("0.00000");

	public static void main(String[] args) 
	{
		ArrayList<Double> hauteurs = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Veuillez saisir une hauteur ex: 19.5 ou écrire fin:");
			String str = sc.nextLine();
			if(str.equals("fin"))
			{
				break;
			}
			else
			{
				double tmp = Double.parseDouble(str);
				//hauteurs.add(tmp);
				effectuerCalculs(tmp);
				
			}			
		}
		
		
		
		sc.close();
		System.exit(0);
	}
	
	/**
	 * Methode qui fait tous les calculs avec la hauteur passee en parametre
	 * @param hauteurEau	
	 */
	private static void effectuerCalculs(double hauteurEau)
	{
		double r,y_barre,yc,mo,aire,distancePointApplication;
		
		//calcule de l'aire en m
		if(hauteurEau > hauteurSurfacePlane)
			aire = (hauteurSurfacePlane* 0.001) * (baseSurfacePlane* 0.001);
		else
			aire = (hauteurEau* 0.001) * (baseSurfacePlane* 0.001);
		
		System.out.println("Hauteur d'eau: "+ df.format(hauteurEau)+" mm");
		
		if(hauteurEau > hauteurSurfacePlane)
			y_barre= PositionCentroide.calcule(hauteurEau,hauteurSurfacePlane, hauteurTotaleDispositif);
		else
			y_barre= PositionCentroide.calcule(hauteurEau,hauteurEau, hauteurTotaleDispositif);
		System.out.println("Centroide: "+ df.format(y_barre)+" mm");
		
		r=Resultante.calcule(RO, G, y_barre, aire);
		System.out.println("Force résultante R: "+r);
		
		if(hauteurEau > hauteurSurfacePlane)
			yc=PositionCentrePression.calcule(y_barre, angle, baseSurfacePlane, hauteurSurfacePlane);
		else
			yc=PositionCentrePression.calcule(y_barre, angle, baseSurfacePlane, hauteurEau);
		
		System.out.println("Position du centre de pression Yc: "+df.format(yc)+" mm");
		
		//calcule de la distance entre la position du centre de pression et le haut du dispositif
		distancePointApplication= hauteurTotaleDispositif - yc;
		
		mo=MomentDeForce.calcule(distancePointApplication,r);
		System.out.println("Moment de force: -"+df.format(mo)+"\n\n");
		
	}

}
