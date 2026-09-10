public class Kulkas {
    private String merk;
    private int kapasitas;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setKapasitas(int liter) {
        kapasitas = liter;
    }

    public void dinginkan() {
        System.out.println("Kulkas " + merk + " sedang mendinginkan...");
    }

    public void bukaPintu() {
        System.out.println("Pintu kulkas " + merk + " dibuka.");
    }

    public void cetakInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Kapasitas : " + kapasitas + " liter");
        System.out.println("Jenis Objek : Kulkas");
    }
}
