public class Pegawai{
    private String nama;
    private String nip;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jumlahJamKerja;
    

    Pegawai(){
    }
    Pegawai(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }
    Pegawai(String nama, String nip , int jumlahJamKerja){
        this.nama = nama;
        this.nip = nip;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void hitungGajiHarian(){
        if(jumlahJamKerja <= 7){
            gajiPokok = jumlahJamKerja * 2000;
        }
        else{
            double gajiLembur = 2000 * 1.5;
            lembur = gajiLembur * (jumlahJamKerja - 7);
            gajiPokok = 7 * 2000;
            if(jumlahJamKerja >=8){
                uangMakan = 3500;
            }
            if(jumlahJamKerja >= 9){
                transport = 4000;
            }
        }
    }
    public void cetakPenghasilan(){
        System.out.println("=---------------------=");
        System.out.println("Data Penghasilan");
        System.out.println("Nama            : " + nama);
        System.out.println("Nip             : " + nip);
        System.out.println("Gaji Pokok      : " + gajiPokok);
        System.out.println("Gaji Lembur     : " + lembur);
        System.out.println("Uang Makan      : " + uangMakan);
        System.out.println("Uang Transport  : " + transport);
        System.out.println("Take Home Pay   : " + (gajiPokok + lembur + 
            uangMakan + transport));
        System.out.println("=---------------------=");
    }
}