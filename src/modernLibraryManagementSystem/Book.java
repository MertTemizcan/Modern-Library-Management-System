package modernLibraryManagementSystem;

public class Book extends BaseMaterial{
	
	private String author;
	private int pageCount;
	
	
	public Book(String title, String id, boolean isAvailable, String author, int pageCount) {
		super(title, id, isAvailable);
		this.author = author;
		this.setPageCount(pageCount);
	}
	
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPageCount() {
		return this.pageCount;
	}
	
	public void setPageCount(int pageCount) {
		if(pageCount >= 0) {
			this.pageCount = pageCount;
		} else {
			System.out.println("Sayfa sayısı negatif değer alamaz");
		}
	}
	
	@Override
	public void showGeneralInfos() {
		System.out.println();
		super.showGeneralInfos();
		System.out.println("Yazarı: " + getAuthor());
		System.out.println("Sayfa sayısı: " + getPageCount());
	}

}
