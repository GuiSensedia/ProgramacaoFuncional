package entities;

public class Product {
	

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	// Metodo estático trabalho com o Produto passado como argumento.
//	public static boolean staticProductPredicate(Product p) {
//		return p.getPrice() >= 100;
//	}
	// Método NÃO estático trabalha com junto com a instância do objeto
	// Com o prórpio objeto em que o método está implementado.
	
	public boolean noStaticProductPredicate(Product p) {
		return price >= 100;
	}
	
	@Override
	public String toString() {
		return "Product [name = " + name + " | price = U$" + price + "]";
	}
}


