package entities;

public class Product {
//	ATRIBUTOS
	private String name;
	private Double price;
	
//	CONSTRUTORES
	public Product() {}
	public Product(String name, Double price) {
		setName(name);
		setPrice(price);
	}
	
//	GETTERS AND SETTERS
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
}