public class TestSewaGame {
    public static void main(String[] args) {
        SewaGame rent1 = new SewaGame();
        rent1.id = "R001";
        rent1.namaMember = "Rangga";
        rent1.namaGame = "Elden Ring";
        rent1.lamaSewa = 3;
        rent1.hargaPerHari = 20000;

        System.out.println("=== DATA PEMINJAMAN GAME ===");
        rent1.tampilData();
    }
}