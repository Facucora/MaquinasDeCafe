package maquinascafe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaquinasPremiumTest {
	
	MaquinaDeCafe maquina;

	@Before
	public void setUp() {
		maquina = new MaquinaPremium();
	}
	
	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertNotNull(vaso);
	}
	
	@Test
	public void quePuedeServirUnCafe() {
		maquina.servirCafe();
		Assert.assertTrue(maquina.puedeServir());
	}
	
	@Test
	public void queSeAgotaElCafe() {
		for(int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		Assert.assertFalse(maquina.puedeServir());
	}
	
	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for(int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertFalse(vaso.estaLleno());
	}
}
