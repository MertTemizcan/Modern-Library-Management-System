package modernLibraryManagementSystem;

public class BaseMaterial {
	
	private String title;
	private String id;
	private boolean isAvailable;
	
	
	public BaseMaterial(String title, String id, boolean isAvailable) {
		this.title = title;
		this.id = id;
		this.isAvailable = isAvailable;
	}
	
	public BaseMaterial(String title, String id) {
		this(title, id, true);
	}
	
	public BaseMaterial(String id, boolean isAvailable) {
		this("Bilgi yok", id, true);
	}
	
	
	
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		if(id != null) {
			this.id = id;
		} else {
			System.out.println("Id değeri boş bırakılamaz");
			return;
		}
	}
	
	public boolean isAvailable() {
		return this.isAvailable;
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void showGeneralInfos() {
		System.out.println("Türü: " + getTitle());
		System.out.println("Id değeri: " + getId());
		System.out.println("Müsaitlik durumu: " + isAvailable());
	}

}
