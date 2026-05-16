package modernLibraryManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		BaseMaterial book1 = new BaseMaterial("Science Fiction", "12985963", true);
		
		Book book2 = new Book("Nutuk", "12031921", true, "Mustafa Kemal Atatürk", 320);
		
		book1.showGeneralInfos();
		book2.showGeneralInfos();
		System.out.println();
		
		LibraryManager manager = new LibraryManager();
		
		manager.addMaterial(book1);
		manager.addMaterial(book2);
		System.out.println("İşlemler tamamlandı herşey listeleniyor");
		manager.showAllMaterials();
	}

}
