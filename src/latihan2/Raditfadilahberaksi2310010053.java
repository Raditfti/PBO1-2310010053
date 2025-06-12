package latihan2;

public class Raditfadilahberaksi2310010053 {
 public class DataDiri {
    String nama;
    String npm;
    String kelas;

    // Constructor
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }
 }
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class DataDiri
        DataDiri RaditFadilah = new DataDiri("RaditFadilah", "2310010053", "TI-4C");

        // Menjalankan method tampilkanData()
        RaditFadilah.tampilkanData();
    }

}
   
}
