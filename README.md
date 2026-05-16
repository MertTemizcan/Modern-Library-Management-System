📚 Modern Library Management System (Java OOP)
Bu proje, Nesne Yönelimli Programlama (OOP) prensiplerini ve dinamik veri yapılarını temel alan kapsamlı bir kütüphane yönetim otomasyonudur. Yazılımın amacı; sadece kitap kaydetmek değil, genişleyebilir ve sürdürülebilir bir sınıf hiyerarşisi (Class Hierarchy) inşa etmektir.

🛠 Teknik Mimari ve Kullanılan Prensipler
Bu uygulamada, temiz kod (Clean Code) standartlarına sadık kalınarak şu temel yazılım kavramları uygulanmıştır:

1. Inheritance (Kalıtım) Mimarisi
Projenin kalbi olan BaseMaterial sınıfı, sistemdeki tüm eserlerin (kitap, dergi vb.) ortak paydasını temsil eder.

Book sınıfı, BaseMaterial sınıfından türetilmiştir.

super() anahtar kelimesi ile üst sınıf constructor'ına veri aktarımı sağlanarak kod tekrarı (Code Duplication) önlenmiştir.

2. Polymorphism (Çok Biçimlilik)
LibraryManager sınıfı içerisinde kurgulanan liste yapısı, Polymorphism prensibi sayesinde envanterdeki tüm farklı materyal türlerini tek bir referans tipi (BaseMaterial) üzerinden yönetebilmektedir. Bu, sisteme yeni bir materyal türü (örneğin Magazine veya DVD) eklendiğinde mevcut kodun bozulmamasını (Scalability) sağlar.

3. Dynamic Data Management (ArrayList)
Kütüphane envanteri, Java'nın dinamik dizi yapısı olan ArrayList ile yönetilmektedir. Bu sayede:

Bellek yönetimi dinamik olarak optimize edilir.

Çalışma zamanında (Runtime) sınırsız sayıda eser ekleme ve listeleme imkanı sunulur.

4. Encapsulation ve Veri Doğrulama
Tüm sınıf değişkenleri private erişim belirleyicisi ile korunmaktadır.

Veri Güvenliği: Verilere erişim yalnızca kontrollü Getter ve Setter metotları ile sağlanır.

Business Logic: Örneğin, sayfa sayısının negatif değer alması veya ID değerinin boş bırakılması gibi hatalı veri girişleri metot seviyesinde engellenmiştir.

🚀 Proje Yapısı
Bash
├── src
│   └── modernLibraryManagementSystem
│       ├── BaseMaterial.java    # Temel sınıf (Parent)
│       ├── Book.java            # Kalıtım alan çocuk sınıf (Child)
│       ├── LibraryManager.java  # Koleksiyon ve yönetim katmanı (Logic)
│       └── Main.java            # Uygulama giriş noktası
💻 Nasıl Çalıştırılır?
Bu depoyu clone'layın.

Java IDE'niz (Eclipse, IntelliJ vb.) ile projeyi açın.

Main.java dosyasını çalıştırarak kütüphane envanterinin nasıl dinamik olarak oluştuğunu konsol üzerinden izleyin.
