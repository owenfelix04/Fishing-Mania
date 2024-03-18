package latihan.membuat.fishingmania.Model;

public class User {
    private String nama;
    private String jenisKelamin;
    private int nomorTelepon;
    private String tanggalLahir;
    private String email;
    private int nik;
    private String password;

    public User(String nama, String jenisKelamin, int nomorTelepon, String tanggalLahir, String email, int nik, String password) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nomorTelepon = nomorTelepon;
        this.tanggalLahir = tanggalLahir;
        this.email = email;
        this.nik = nik;
        this.password = password;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public int getNomorTelepon(){
        return nomorTelepon;
    }
    public void setNomorTelepon(int nomorTelepon){
        this.nomorTelepon = nomorTelepon;
    }

    public String getTanggalLahir(){
        return tanggalLahir;
    }
    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getNik(){
        return nik;
    }
    public void setNik(int nik){
        this.nik = nik;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
