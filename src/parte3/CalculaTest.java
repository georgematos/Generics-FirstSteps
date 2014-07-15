package parte3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculaTest {

	@Test
	public void deveRetornarASomaDosValoresDosObjetosDaLista() {
		
		List<Number> lista = new ArrayList<>();
		Calcula calcula = new Calcula();
		
		lista.add(new Integer(4));
		lista.add(new Double(5.3));
		
		assertEquals(9.3, calcula.soma(lista), 0.00001);
		
	}
	
}
