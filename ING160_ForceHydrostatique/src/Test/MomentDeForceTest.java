package Test;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import model.MomentDeForce;
import junit.framework.TestCase;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MomentDeForceTest extends TestCase
{
	@Test
	public void calculeTest()
	{
		double distancePointApplication = 2;
		double resultante = 1000;
		
		double moment= MomentDeForce.calcule(distancePointApplication,resultante);
		
		assertEquals(moment,2.0);
	}

}
