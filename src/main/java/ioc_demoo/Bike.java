package ioc_demoo;



public class Bike {
	String color;
	double price;
	String company;

	MusicSystem musicSystem;

	public Bike(String color, double price, String company, MusicSystem musicSystem) {
		super();
		this.color = color;
		this.price = price;
		this.company = company;
		this.musicSystem = musicSystem;
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", price=" + price + ", company=" + company + ", musicSystem=" + musicSystem
				+ "]";
	}
	
	
	
}
	



