package pertemuan2;

public class MobilBeraksi {
    public static void main(String[] args){
        //membuat objek
        Mobil mobilku = new Mobil();
        
        //mengisi atribut
        mobilku.warna = "Hitam";
        mobilku.tahunproduksi = 2020;
        
        //menampilkan nilai
        System.out.println("warna: "+mobilku.warna);
        System.out.println("Tahun Produksi:"+mobilku.tahunproduksi);
        
        Mobil Mobilandi = new Mobil();
        
        Mobilandi.warna = "Merah";
        Mobilandi.tahunproduksi = 2015;
        
        System.out.println("warna: "+Mobilandi.warna);
        System.out.println("Tahun Produksi:"+Mobilandi.tahunproduksi);
        
        
        
        
    }
}
