package latihan.membuat.fishingmania.Model;

public class Informasi_Ikan {
    private String jenisIkan;
    private String lokasiIkan;
    private String deskripsiIkan;
    private String historiIkan;

    public Informasi_Ikan(String jenisIkan, String lokasiIkan, String deskripsiIkan, String historiIkan) {
        this.jenisIkan = jenisIkan;
        this.lokasiIkan = lokasiIkan;
        this.deskripsiIkan = deskripsiIkan;
        this.historiIkan = historiIkan;
    }

    public String getJenisIkan(){
        return jenisIkan;
    }
    public void setJenisIkan(String jenisIkan){
        this.jenisIkan = jenisIkan;
    }

    public String getLokasiIkan(){
        return lokasiIkan;
    }
    public void setLokasiIkan(String lokasiIkan){
        this.jenisIkan = jenisIkan;
    }

    public String getDeskripsiIkan(){
        return deskripsiIkan;
    }
    public void setDeskripsiIkan(String deskripsiIkan){
        this.deskripsiIkan = deskripsiIkan;
    }

    public String getHistoriIkan(){
        return historiIkan;
    }
    public void setHistoriIkan(String historiIkan){
        this.historiIkan = historiIkan;
    }

}
