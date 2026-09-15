package modernLibraryManagementSystem;

public class Book extends BaseMaterial{
	
	private String author;
	private int numberOfPages;
	
	
	public Book(String name, String category, double price, boolean isAvailable,  String author, int numberOfPages) {
		super(name, category, price, isAvailable);
		setAuthor(author);
		setNumberOfPages(numberOfPages);
	}
	
	
	public String getAuthor() {
		return this.author;
	}
	
	public final void setAuthor(String author) {
		if(author == null || author.trim().isEmpty()) {
			throw new IllegalArgumentException("Yazar boş bırakılamaz");
		}

		this.author = author;
	}
	
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	
	public final void setNumberOfPages(int numberOfPages) {
		if(numberOfPages <= 0) {
			throw new IllegalArgumentException("Sayfa sayısı sıfır veya negatif olamaz");
		}

		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" | Yazar: %s | Sayfa Sayısı: %d", author, numberOfPages);
	}

}
