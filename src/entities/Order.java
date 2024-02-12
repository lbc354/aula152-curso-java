package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
//	ATRIBUTOS
	private Date moment;
	private OrderStatus status;
//	relation-1
	private Client client;
//	relation-*
	List<OrderItem> items = new ArrayList<OrderItem>();
	
//	CONSTRUTORES
	public Order() {}
	public Order(Date moment, OrderStatus status, Client client) {
		setMoment(moment);
		setStatus(status);
		setClient(client);
	}
	
//	GETTERS AND SETTERS
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
//	MÉTODOS
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public Double total() {
		double sum = 0.0;
		for (OrderItem oi : items) {
			sum += oi.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append("\nClient: " + client);
		sb.append("\nOrder items:");
		for (OrderItem oi : items) {
			sb.append("\n-> " + oi);
		}
		sb.append("\nTotal price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
}