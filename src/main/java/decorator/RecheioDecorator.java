package decorator;

/** DecoratorPattern
 * 
 *  Definição: O Decorator Pattern anexa responsabilidades adicionais a um objeto
 *             dinamicamente. Os decoradores fornecem uma alternativa flexível de 
 *             subclasse para estender a funcionalidade.**/
public abstract class RecheioDecorator implements Pizza {

	/** Pizza - Interface que será decorada. **/
	private Pizza pizza;
	
	public RecheioDecorator(Pizza pizza) {
		this.pizza = pizza;//-> recebe o objeto que será decorado.
	}
	
	@Override
	public void assar() {
		/** Nesta parte pode-se acrescentar novas responsabilidades. 
		 *  A Responsabilidade de Rechear a pizza foi adicionada.**/
		
		adicionarRecheio();
		pizza.assar();
	}
	
	/** Método/Responsabilidade adicionada. **/
	protected abstract void adicionarRecheio();

}
