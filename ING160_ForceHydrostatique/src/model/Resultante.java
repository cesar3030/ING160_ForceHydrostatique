package model;
/**
 * Classe qui calcule la résultante de la force hydrostatique
 * @author Cesar Jeanroy
 *
 */
public class Resultante 
{

	/**
	 * Méthode qui calcule la fore (R) résultante de la force hydrostatique
	 * @param ro		 	la masse volumique du liquide
	 * @param g				la constante gravitationnelle
	 * @param y_barre		la position du centroide de la surface immergée
	 * @param aire			l'aire de la surface immergée
	 * @return
	 */
	public static double calcule(double ro, double g, double y_barre, double aire)
	{
		//convertir de mm a m
		y_barre= y_barre * 0.001;
		
		double r= ro * g * y_barre * aire;
		return r;
	}
}
