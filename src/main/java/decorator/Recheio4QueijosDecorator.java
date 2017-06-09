package decorator;

public class Recheio4QueijosDecorator extends RecheioDecorator {

	public Recheio4QueijosDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	protected void adicionarRecheio() {
		System.out.println("Adicionar Sabor Quatro Queijos!");
	}

}
