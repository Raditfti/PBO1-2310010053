package pertemuan3;

public class SepedaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Sepeda sepedaku = new Sepeda();
        
        sepedaku.setGIr(1);
        
        System.out.println("Gir saat ini : "+sepedaku.getGir());
        
        sepedaku.setGIr(3);
        
        System.out.println("Gir saat ini: "+sepedaku.getGir());
        
        
    }
}
