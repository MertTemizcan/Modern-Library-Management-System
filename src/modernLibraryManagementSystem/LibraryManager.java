package modernLibraryManagementSystem;

import java.util.ArrayList;

public class LibraryManager {
	
	private ArrayList<BaseMaterial> materials;
	
	public LibraryManager() {
		this.materials = new ArrayList<>();
	}

	
	public void addMaterial(BaseMaterial material) {
		materials.add(material);
		System.out.println(material.getTitle() + " sisteme başarıyla yüklendi");
		System.out.println();
	}
	
	public void showAllMaterials() {
		System.out.println("Kütüphane Envanteri");
		for(BaseMaterial m: materials) {
			m.showGeneralInfos();
		}
	}
}
