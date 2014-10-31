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
	public static float calcule(float distancePointApplication, float resultante)
	{
		float moment = distancePointApplication * resultante;
		
		return moment;
	}
}
