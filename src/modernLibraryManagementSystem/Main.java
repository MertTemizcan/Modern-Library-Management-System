package modernLibraryManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book("Atomik Alışkanlıklar", "Kişisel Gelişim", 250.0, true, "James Clear", 341);
		
		Book book2 = new Book("Nutuk", "Söylev", 300.0, true, "MUSTAFA KEMAL ATATÜRK", 600);

		System.out.println(book1);
		System.out.println();
		System.out.println(book2);

		
		LibraryManager manager = new LibraryManager();
		
		manager.addMaterial(book1);
		manager.addMaterial(book2);
		System.out.println("İşlemler tamamlandı bütün envanter listeleniyor");
		manager.showAllMaterials();
	}

}
