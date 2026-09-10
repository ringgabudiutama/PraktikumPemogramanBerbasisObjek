public class HandPhone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public void setKapasitasBaterai(int baterai) {
        kapasitasBaterai = baterai;
    }

    public void setJumlahKamera(int kamera) {
        jumlahKamera = kamera;
    }

    public void teleponSeseorang(String nama) {
        System.out.println("Menelepon " + nama + "...");
    }

    public void kirimPesan(String nama, String pesan) {
        System.out.println("Mengirim pesan ke " + nama + ": " + pesan);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
        System.out.println("Jumlah Kamera : " + jumlahKamera);
        System.out.println("Jenis Perangkat : HandPhone");
    }
}
