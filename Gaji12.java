import java.util.Scanner;
public class Gaji12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, Gaji, PotGaji;

        System.out.println("Masukkan Jumlah Hari Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan Gaji Anda ");
        Gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        PotGaji=input.nextInt();

        TotGaji=(jmlMasuk*Gaji)-(JmlTdkMasuk*PotGaji);
        System.out.println("Gaji Yang Anda Terima Adalah " +TotGaji);
    }
}