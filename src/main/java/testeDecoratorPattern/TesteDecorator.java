package testeDecoratorPattern;

import decorator.Pizza;
import decorator.PizzaSimple;
import decorator.Recheio4QueijosDecorator;
import decorator.RecheioCatupiryDecorator;

/** DecoratorPattern
 * 
 *  Definição: O Decorator Pattern anexa responsabilidades adicionais a um objeto
 *             dinamicamente. Os decoradores fornecem uma alternativa flexível de 
 *             subclasse para estender a funcionalidade.**/
public class TesteDecorator {

	public static void main(String[] args) {

		System.out.println("Pizza1");
        Pizza pizza1 = new PizzaSimple(); //-> sem Decorator Pattern.
		pizza1.assar();
		
		////////////////////////////////////
		System.out.println("\nPizza2");
		
		Pizza pizza2 = new RecheioCatupiryDecorator(new PizzaSimple());
		pizza2.assar();
		
		/** Note que o mesmo método é chamando em ambos os casos,  
		 *  porém na segunda pizza o método adicionarReceio() foi acrescentado através
		 *  da classe ReceioCatypiryDecorator.**/
		
		///////////////////////////////////////
		System.out.println("\nPizza3");
		
		/** ->> Adicionando Responsabilidades em cascata. **/ 
		Pizza pizza3 = new RecheioCatupiryDecorator(new Recheio4QueijosDecorator(new PizzaSimple()));
		pizza3.assar();
		
	}
}





