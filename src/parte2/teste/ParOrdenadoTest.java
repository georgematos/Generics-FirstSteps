package parte2.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import parte2.Par;
import parte2.ParOrdenado;

public class ParOrdenadoTest {

	@Test
	public void deveVerificarSeOsTiposDasChavesEValoresDosParesSaoDosTiposEsperados() {
		Par<String, Integer> p1 = new ParOrdenado<>("Copo", 200);
		Par<String, String> p2 = new ParOrdenado<>("Caneta", "Azul");
		
		assertEquals(String.class, p1.getKey().getClass());
		assertEquals(Integer.class, p1.getValue().getClass());
		
		assertEquals(String.class, p2.getKey().getClass());
		assertEquals(String.class, p2.getValue().getClass());
	}
	
}
