public class Laptop extends Elektronik {
    private int kapasitasRAM;
    private String jenisProcessor;

    public void setKapasitasRAM(int ram) {
        kapasitasRAM = ram;
    }

    public void setJenisProcessor(String processor) {
        jenisProcessor = processor;
    }

    public void bukaAplikasi(String namaAplikasi) {
        System.out.println("Membuka aplikasi " + namaAplikasi + "...");
    }

    public void installSoftware(String namaSoftware) {
        System.out.println("Menginstall " + namaSoftware + "...");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("RAM : " + kapasitasRAM + " GB");
        System.out.println("Processor : " + jenisProcessor);
        System.out.println("Jenis Perangkat : Laptop");
    }
}
