public class mataKuliah {
    String nama_matakuliah;
    int id_matakuliah, jumlah_sks;

    public mataKuliah(int id_matakuliah, String nama_matakuliah, int jumlah_sks){
        this.id_matakuliah = id_matakuliah;
        this.nama_matakuliah = nama_matakuliah;
        this.jumlah_sks = jumlah_sks;
    }
    int getIdMatakuliah(){
        return id_matakuliah;
    }
    String getNamaMatakuiah(){
        return "Nama Matakuliah: " + nama_matakuliah;
    }
    int getJumlahSks(){
        return jumlah_sks;
    }


public class matakuliahh {
    public static void main(String[] args) {
        mataKuliah mataKuliah1 = new mataKuliah(01, "PBO" , 3);
        System.out.println("ID Mata Kuliah: " + mataKuliah1.getIdMatakuliah());
        System.out.println(mataKuliah1.getNamaMatakuiah());
        System.out.println("Jumlah SKS: " + mataKuliah1.getJumlahSks());
    }
}
}