package example;

public class Product {
	private double price;
	private String description;
	private double weight;

	public Product(double price, String description, double weight) {
		this.price = price;
		this.description = description;
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public double getWeight() {
		return weight;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void displayInfo() {
		System.out.println("Опис: " + description);
		System.out.println("Ціна: " + price);
		System.out.println("Вага: " + weight + " кг");
	}
}
