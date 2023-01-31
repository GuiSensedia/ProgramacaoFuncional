package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class RunProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		// Aumentar o preço de todos os produtos em 10%
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Variável usada nas expressões lambda.
		double porCent = 1.1;
		
		// list.forEach(new PriceUpdate());  -> Implementação por Interface
		// list.forEach(Product :: staticPriceUp); -> Implementação por Método estático.
		// list.forEach(Product :: noStaticPriceUp); -> Implementação por Método não estático.
		// Consumer<Product> cons = p -> {p.setPrice(p.getPrice()*porCent);};
		// list.forEach(cons); -> Implementação com Expressão Lambda.
		// list.forEach(p -> p.setPrice(p.getPrice()*porCent)); -> Expressão Lambda Inline.
		
		
		
		list.forEach(System.out::println);
	}
}
