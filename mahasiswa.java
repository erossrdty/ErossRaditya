class mahasiswa {
    String nama_mahasiswa, jenis_kelamin, alamat;
    int id_mahasiswa, no_telp;

    public mahasiswa(int id_mahasiswa, String nama_mahasiswa, String jenis_kelamin, int no_telp, String alamat){
        this.id_mahasiswa = id_mahasiswa;
        this.nama_mahasiswa = nama_mahasiswa;
        this.jenis_kelamin = jenis_kelamin;
        this.no_telp = no_telp;
        this.alamat = alamat;
    }
    int getIdMahasiswa(){
        return id_mahasiswa;
    }
    String getNamaMahasiswa(){
        return "Nama: " + nama_mahasiswa;
    }
    String getJenisKelamin(){
        return "Jenis Kelamin: " + jenis_kelamin;
    }
    int setNoTelp(){
        return no_telp;
    }    
    String setAlamat(){
        return "Alamat: " + alamat;
    }


public class mahasiswaa{
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new  mahasiswa(01, "Eross", "laki-laki", 8423678, "Jember" );
        System.out.println("ID Mahasiswa: " + mahasiswa1.getIdMahasiswa());
        System.out.println(mahasiswa1.getNamaMahasiswa());
        System.out.println(mahasiswa1.getJenisKelamin());
        System.out.println("No Telp: " + mahasiswa1.setNoTelp());
        System.out.println(mahasiswa1.setAlamat());
    }
}
}