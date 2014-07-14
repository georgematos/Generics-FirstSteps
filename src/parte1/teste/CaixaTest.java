package parte1.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import parte1.Caixa;

public class CaixaTest {

	@Test
	public void deveRetornarUmObjetoSemTipo() {
		Caixa caixa = new Caixa();
		Object obj = new Object();
		
		caixa.set(obj);
		
		assertEquals(Object.class, caixa.get().getClass());
	}
	
}
