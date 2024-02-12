package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Aula152 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Birth date (dd/mm/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("\nEnter order data");
		System.out.print("Status: ");
		sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		
//		new Date() instancia com o horário do sistema
		Order order = new Order(new Date(), status, client);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nEnter #" + i + " item data");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println("\nOrder Sumary");
		System.out.println(order.toString());
		
		sc.close();
	}

}