package latihan2;

public class Raditfadilah2310010053 {
  public class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    public Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Radit", "2310010053", "TI-1A");
        mhs.tampilkanData();
    }
}
  
}
