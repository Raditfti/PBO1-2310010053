package pertemuan3;

public class Mahasiswa {
    //membuat atribut
    String nama, npm;
    int umur;
    
    //method construktor
    //1. nama harus sama dengan mana class
    //2. tidak menggunakan kata kunci  return dan void
    public Mahasiswa(String namaMhs,String npmMhs, int umurMHS){
        nama = namaMhs;
        npm = npmMhs;
        umur = umurMhs;
    }  
    
    public void info(){
        System.out.println("Nama mahasiswa: "+nama);
        System.out.println("NPM mahasiswa: "+npm);
        System.out.println("Umur mahasiswa: "+umur);
    }
    
}
