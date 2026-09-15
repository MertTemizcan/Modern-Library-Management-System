package modernLibraryManagementSystem;

import java.util.Random;

public class BaseMaterial {

	private final String barcode;
	private String name;
	private String category;
	private double price;
	private boolean isAvailable;
	
	
	public BaseMaterial(String name, String category, double price, boolean isAvailable) {
		this.barcode = generateBarcode();
		setName(name);
		setCategory(category);
		setPrice(price);
		this.isAvailable = isAvailable;
	}

	private String generateBarcode() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < 10; i++) {
			sb.append(random.nextInt(10));
		}

		return sb.toString();
	}

	public String getBarcode() {
		return this.barcode;
	}

	public String getName() {
		return this.name;
	}

	public final void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Materyal adı boş bırakılamaz");
		}

		this.name = name;
	}

	public String getCategory() {
		return this.category;
	}

	public final void setCategory(String category) {
		if(category == null || category.trim().isEmpty()) {
			throw new IllegalArgumentException("Kategori kısmı boş bırakılamaz");
		}

		this.category = category;
	}

	public double getPrice() {
		return this.price;
	}

	public final void setPrice(double price) {
		if(price <= 0) {
			throw new IllegalArgumentException("Fiyat sıfır veya negatif olamaz");
		}

		this.price = price;
	}

	public boolean isAvailable() {
		return this.isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	@Override
	public String toString() {
		return String.format("Barkod Numarası: %s | Adı: %s | Kategorisi: %s | Fiyatı: %.2f | Stok durumu: %b", barcode, name, category, price, isAvailable);
	}
}
