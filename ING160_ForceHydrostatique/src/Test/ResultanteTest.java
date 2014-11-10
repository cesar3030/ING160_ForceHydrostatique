package Test;

import java.text.DecimalFormat;

import model.Resultante;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.TestCase;
@RunWith(MockitoJUnitRunner.class)
public class ResultanteTest extends TestCase 
{
	private static DecimalFormat df = new DecimalFormat("0.00000");

	@Test
	public void calculeTest()
	{
		double ro=1000;
		double g=9.81;
		double y_barre= 10;
		double aire= 35;
		
		double r=Resultante.calcule(ro,g,y_barre,aire);
	
		assertEquals(r,3433.5000000000005);
	}
}
