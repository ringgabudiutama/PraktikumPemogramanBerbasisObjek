public class Demo {
    public static void main(String[] args) {

        System.out.println("=== Objek Laptop ===");
        Laptop laptop1 = new Laptop();
        laptop1.setMerk("Asus");
        laptop1.setTahunProduksi(2023);
        laptop1.setKapasitasRAM(16);
        laptop1.setJenisProcessor("Intel Core i7");
        laptop1.nyalakan();
        laptop1.bukaAplikasi("Visual Studio Code");
        laptop1.installSoftware("Java JDK 17");
        laptop1.cetakInfo();
        laptop1.matikan();

        System.out.println();
        System.out.println("=== Objek HandPhone ===");
        HandPhone hp1 = new HandPhone();
        hp1.setMerk("Samsung");
        hp1.setTahunProduksi(2024);
        hp1.setKapasitasBaterai(5000);
        hp1.setJumlahKamera(3);
        hp1.nyalakan();
        hp1.teleponSeseorang("Budi");
        hp1.kirimPesan("Budi", "Halo, apa kabar?");
        hp1.cetakInfo();
        hp1.matikan();

        System.out.println();
        System.out.println("=== Objek Kulkas ===");
        Kulkas kulkas1 = new Kulkas();
        kulkas1.setMerk("LG");
        kulkas1.setKapasitas(300);
        kulkas1.bukaPintu();
        kulkas1.dinginkan();
        kulkas1.cetakInfo();

        System.out.println();
        System.out.println("=== Objek Meja Belajar ===");
        MejaBelajar meja1 = new MejaBelajar();
        meja1.setBahan("Kayu Jati");
        meja1.setJumlahLaci(3);
        meja1.taruhBarang("Buku");
        meja1.bersihkan();
        meja1.cetakInfo();
    }
}
