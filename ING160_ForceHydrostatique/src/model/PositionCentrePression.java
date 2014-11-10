package model;
/**
 * Classe qui calcule la possition du centre de pression
 * @author Cesar Jeanroy
 *
 */
public class PositionCentrePression 
{

	/**
	 * Méthode qui retourne la position du centre de pression.
	 * @param y_centroide	position de=u centroide de la surface immergée
	 * @param angle			angle entre la surface de l'eau et la surface immergée
	 * @param base			la base de la surface immergée
	 * @param hauteur		la hauteur d'eau sur la surface immergée
	 * @return
	 */
	public static double calcule(double y_centroide, double angle, double base, double hauteur)
	{
		//calcule de l'inertie de section de la surface immergée
		double ig = 0.083333 * hauteur * hauteur * hauteur * base;
		
		//calcule du centre de pression
		double y= y_centroide+(( ig * Math.pow( Math.sin(Math.toRadians( angle )) ,2) )/(y_centroide*base*hauteur));
		
		
		return y;
	}
}
