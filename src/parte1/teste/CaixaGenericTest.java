package parte1.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import parte1.generic.Caixa;
import parte1.generic.Caneta;
import parte1.generic.Copo;

public class CaixaGenericTest {

	@Test
	public void deveRetornarOsObjetosDeAcordoComOSeuTipo() {
		Caixa<Caneta> caixaDeCanetas = new Caixa<>();
		Caixa<Copo> caixaDeCopos = new Caixa<>();
		Caneta caneta = new Caneta("Bic", "Azul");
		Copo copo = new Copo("Duralex", 200);
		
		caixaDeCanetas.set(caneta);
		caixaDeCopos.set(copo);
		
		assertEquals(Caneta.class, caixaDeCanetas.get().getClass());
		assertEquals(Copo.class, caixaDeCopos.get().getClass());
	}
	
}
