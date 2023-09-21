import java.util.Scanner;
public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        String merk;
        int harga, jumlah, hal;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan judul buku yang akan dibeli");
        merk=input.next();
        System.out.println("Masukkan jumlah halaman buku");
        hal=input.nextInt();
        System.out.println("Masukkan harga buku yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah buku yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon ");
        dis=input.nextDouble();

        total=harga*jumlah*hal;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Judul buku yang anda beli adalah " + merk);
        System.out.println("Jumlah halaman buku yang anda beli adalah " + hal);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }

}