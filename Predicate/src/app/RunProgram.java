package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class RunProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		System.out.println("Before Implements Interface Predicate: ");
		for(Product p : list) {
			System.out.println(p);
		}
		
	//	list.removeIf(new ProductPredicate()); // IMPREMENTAÇÃO POR INTERFACE.
	//	list.removeIf(Product :: staticProductPredicate); - IMPLEMENTAÇÃO POR REFERÊNCIA PARA METODO ESTÁTICO.
	//	list.removeIf(Product :: noStaticProductPredicate); - IMPLEMENTAÇÃO COM METODO NÃO ESTÁTICO.
	//	Predicate<Product> predicate = p -> p.getPrice() >= 100.0; - IMPLEMENTAÇÃO COM EXPRESSÃO LAMBDA DECLARADA.
	//	list.removeIf(predicate);
		
		System.out.println();
		System.out.println("After Implements Interface Predicate: ");
		for(Product p : list) {
			System.out.println(p);
		}

		
	}
}
