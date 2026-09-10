public class SewaGame {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaPerHari;

    public double hitungBayar() {
        return lamaSewa * hargaPerHari;
    }

    public void tampilData() {
        System.out.println("ID Transaksi : " + id);
        System.out.println("Nama Member  : " + namaMember);
        System.out.println("Nama Game    : " + namaGame);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Bayar  : Rp " + hitungBayar());
    }
}