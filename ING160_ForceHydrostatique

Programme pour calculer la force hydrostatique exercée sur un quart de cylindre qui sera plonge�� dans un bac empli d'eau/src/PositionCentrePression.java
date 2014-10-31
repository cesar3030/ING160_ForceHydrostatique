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
	 * @param hauteur		la hauteur de la surface immergée
	 * @return
	 */
	public static double calcule(float y_centroide, double angle, float base, float hauteur)
	{
		//On cacule l'aire de la surface
		float aire = base*hauteur;
		
		//calcule de l'inertie de section de la surface immergée
		double ig= (1/12) * Math.pow(base,3) * hauteur;
		
		//calcule du centre de pression
		double y= y_centroide+(( ig * Math.pow( Math.sin(angle) ,2) )/(y_centroide*aire));
		
		return y;
	}
}
