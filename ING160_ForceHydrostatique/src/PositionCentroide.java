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
	 * @param hauteurTotaleDispositif	la hauteur totale entre le bas du quart de cylyndre et le bras de levier sur lequel les poids sont attaches
	 * @return
	 */
	public static double calcule(double hauteurEau, double hauteurSurfacePlane, double hauteurTotaleDispositif)
	{
		double y;
		
		if(hauteurEau > hauteurSurfacePlane)
		{
			double surPlus =  hauteurTotaleDispositif - hauteurEau;
			y = surPlus + (hauteurSurfacePlane/2);
		}
		else
		{
			y =(hauteurEau/2);
		}
	
		return y;
	}
}
