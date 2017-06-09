package decorator;

public class RecheioCatupiryDecorator extends RecheioDecorator {

	public RecheioCatupiryDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	protected void adicionarRecheio() {
		System.out.println("Adicionar Sabor Catupiry!");
	}

}
