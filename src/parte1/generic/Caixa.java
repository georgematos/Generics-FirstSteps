package parte1.generic;
/**
 * Versao generica da classe Box
 * @param <T> o tipo do valor sendo colocado na caixa
 */
public class Caixa<T> {

	// T espera pelo "Tipo"
	private T t;
	
	public void set(T t) { this.t = t; }
	public T get() { return t; };
	
}