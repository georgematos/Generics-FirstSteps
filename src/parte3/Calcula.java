package parte3;

import java.util.List;

public class Calcula {

	/**
	 * Tipos Coringa, o método pode receber qualquer filho da classe Number.
	 * Caso quisesse o contrario, ou seja, aceitar receber apenas os pais,
	 * usaria super no lugar de extends.
	 * @param lista
	 * @return
	 */
	public double soma(List<? extends Number> lista) {
		double total = 0;
		for (Number n : lista) {
			total += n.doubleValue();
		}
		return total;
	}
	
}
