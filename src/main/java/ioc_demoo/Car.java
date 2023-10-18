package ioc_demoo;

public class Car {
	
	String color;
	double price;
	String company;

	MusicSystem musicSystem;
	

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", company=" + company + ", musicSystem=" + musicSystem
				+ "]";
	}
	
}

