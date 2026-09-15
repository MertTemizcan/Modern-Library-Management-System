package modernLibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
	
	private final List<BaseMaterial> materials;
	
	public LibraryManager() {
		this.materials = new ArrayList<>();
	}

	
	public void addMaterial(BaseMaterial material) {
		materials.add(material);
		System.out.println(material.getName() + " sisteme başarıyla eklendi");
		System.out.println();
	}
	
	public void showAllMaterials() {
		System.out.println("Kütüphane Envanteri");
		for(BaseMaterial m: materials) {
			System.out.println(m);
		}
	}
}
