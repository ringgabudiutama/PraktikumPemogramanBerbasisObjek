public class MejaBelajar {
    private String bahan;
    private int jumlahLaci;

    public void setBahan(String bahanMeja) {
        bahan = bahanMeja;
    }

    public void setJumlahLaci(int laci) {
        jumlahLaci = laci;
    }

    public void taruhBarang(String barang) {
        System.out.println(barang + " diletakkan di atas meja belajar.");
    }

    public void bersihkan() {
        System.out.println("Meja belajar dibersihkan.");
    }

    public void cetakInfo() {
        System.out.println("Bahan : " + bahan);
        System.out.println("Jumlah Laci : " + jumlahLaci);
        System.out.println("Jenis Objek : Meja Belajar");
    }
}
