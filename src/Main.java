import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Data Pegawai 1");
        System.out.print("Nama             : ");
        String nama1 = sc.nextLine();
        System.out.print("Nip              : ");
        String nip1 = sc.nextLine();
        System.out.print("Jumlah Jam Kerja : ");
        int jam1 = sc.nextInt();
        System.out.println("Masukan Data Pegawai 2");
        System.out.print("Nama             : ");
        sc.nextLine();
        String nama2 = sc.nextLine();
        System.out.print("Nip              : ");
        String nip2 = sc.nextLine();
        System.out.print("Jumlah Jam Kerja : ");
        int jam2 = sc.nextInt();
        Pegawai pegawai1 = new Pegawai(nama1 , nip1);
        pegawai1.setJamKerja(jam1);
        Pegawai pegawai2 = new Pegawai(nama2 , nip2, jam2);
        pegawai1.hitungGajiHarian();
        pegawai2.hitungGajiHarian();
        pegawai1.cetakPenghasilan();
        pegawai2.cetakPenghasilan();

        
    }
}
