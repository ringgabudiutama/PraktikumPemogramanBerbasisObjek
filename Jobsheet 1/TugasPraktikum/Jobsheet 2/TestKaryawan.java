public class TestKaryawan {
    public static void main(String[] args) {
        Karyawan kyw1 = new Karyawan();

        kyw1.id = "K001";
        kyw1.nama = "Budi Santoso";
        kyw1.jenisKelamin = "Laki-laki";
        kyw1.jabatan = "Software Engineer";
        kyw1.gaji = 8500000;

        System.out.println("=== DATA KARYAWAN ===");
        kyw1.tampilDataPribadi();
        kyw1.lihatGaji();
    }
}