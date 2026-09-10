public class TestBarangAssignment {
    public static void main(String[] args) {
        BarangAssignment brg = new BarangAssignment();
        brg.kode = "BRG01";
        brg.namaBarang = "Sepatu";
        brg.hargaDasar = 200000;
        brg.diskon = 0.15f; // Diskon 15%

        System.out.println("=== DETAIL BARANG ===");
        brg.tampilData();
    }
}