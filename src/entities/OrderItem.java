package entities;

public class OrderItem {
//	ATRIBUTOS
	private Integer quantity;
	private Double price;
	private Product product;
	
//	CONSTRUTORES
	public OrderItem() {}
	public OrderItem(Integer quantity, Double price, Product product) {
		setQuantity(quantity);
		setPrice(price);
		setProduct(product);
	}
	
//	GETTERS AND SETTERS
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
//	MÉTODOS
	public Double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProduct().getName() + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Subtotal: $" + String.format("%.2f", subTotal()));
		return sb.toString();
	}
}