/**
 * Classe qui calcule le moment de force créé par une pression hydrostatique
 * @author Cesar Jeanroy
 *
 */
public class MomentDeForce 
{
	/**
	 * Classe qui calcule le moment de force créé par une pression hydrostatique
	 * @param distancePointApplication		la plus coute distance entre la resultante et le point d'application
	 * @param resultante					la valeur de la resultante.
	 * @return
	 */
	public static double calcule(double distancePointApplication, double resultante)
	{
		double moment = distancePointApplication * resultante;
		
		return moment;
	}
}
