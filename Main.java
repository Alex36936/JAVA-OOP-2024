package example;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product(199.99, "Смартфон з дисплеєм 6.5 дюймів", 0.175);
		Product product2 = new Product(49.99, "Бездротові навушники", 0.05);

		System.out.println("Інформація про товар 1:");
		product1.displayInfo();

		System.out.println("\nІнформація про товар 2:");
		product2.displayInfo();

		product1.setPrice(189.99);
		product1.setDescription("Смартфон з оновленим дисплеєм 6.5 дюймів");
		product1.setWeight(0.180);

		System.out.println("\nОновлена інформація про товар 1:");
		product1.displayInfo();
	}
}
