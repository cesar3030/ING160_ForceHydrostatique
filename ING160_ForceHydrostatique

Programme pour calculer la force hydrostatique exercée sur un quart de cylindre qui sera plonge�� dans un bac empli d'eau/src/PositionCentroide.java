/**
 * Classe qui calcule la postion du centroide.
 * @author Cesar Jeanroy
 *
 */
public class PositionCentroide 
{

	/**
	 * Methode qui calcule la postion du centroide de la surface immergée.	
	 * @param hauteurSurfacePlane		hauteur de la surface immergée
	 * @param distanceDeLaSurface		distance entre la partie suppérieure de la surface immergée et la surface de l'eau
	 * @return
	 */
	public static double calcule(float hauteurSurfacePlane, float distanceDeLaSurface)
	{
		double y= distanceDeLaSurface+(hauteurSurfacePlane/2);
		return y;
	}
}
