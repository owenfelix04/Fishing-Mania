package latihan.membuat.fishingmania.Model;

public class Cuaca {
    private int suhu;
    private int tekanaUdara;
    private int indexUv;
    private int kelembapan;

    public Cuaca(int suhu, int tekanaUdara, int indexUv, int kelembapan) {
        this.suhu = suhu;
        this.tekanaUdara = tekanaUdara;
        this.indexUv = indexUv;
        this.kelembapan = kelembapan;
    }

    public int getSuhu(){
        return suhu;
    }
    public void setSuhu(int suhu){
        this.suhu = suhu;
    }

    public int getTekanaUdara(){
        return tekanaUdara;
    }
    public void setTekanaUdara(int tekanaUdara){
        this.tekanaUdara = tekanaUdara;
    }

    public int getIndexUv(){
        return indexUv;
    }
    public void setIndexUv(int indexUv){
        this.indexUv = indexUv;
    }

    public int getKelembapan(){
        return kelembapan;
    }
    public void setKelembapan(int kelembapan){
        this.kelembapan = kelembapan;
    }

}