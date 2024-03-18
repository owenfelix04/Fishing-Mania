package latihan.membuat.fishingmania.Model;

public class Lokasi {
    //attribut
    private String namaLokasi;
    private int kordinatLokasi;

    public Lokasi(String namaLokasi, int kordinatLokasi){
        this.namaLokasi = namaLokasi;
        this.kordinatLokasi = kordinatLokasi;
    }

    public String getNamaLokasi(){
        return namaLokasi;
    }
    public void setNamaLokasi(String namaLokasi){
        this.namaLokasi = namaLokasi;
    }

    public int getKordinatLokasi(){
        return kordinatLokasi;
    }
    public void setKordinatLokasi(int kordinatLokasi){
        this.kordinatLokasi = kordinatLokasi;
    }
}
