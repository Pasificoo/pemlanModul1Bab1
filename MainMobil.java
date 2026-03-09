import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mobil m1 = new Mobil();

        System.out.print("Masukkan manufaktur mobil: ");
        String manufaktur = input.nextLine();

        System.out.print("Masukkan nomor plat mobil: ");
        String noPlat = input.nextLine();

        System.out.print("Masukkan warna mobil: ");
        String warna = input.nextLine();

        System.out.print("Masukkan kecepatan mobil (km/jam): ");
        int kecepatan = input.nextInt();

        System.out.print("Masukkan waktu tempuh (jam): ");
        double waktu = input.nextDouble();

        m1.setManufaktur(manufaktur);
        m1.setNoPlat(noPlat);
        m1.setWarna(warna);
        m1.setKecepatan(kecepatan);
        m1.setWaktu(waktu);

        m1.displayMessage();

        input.close();
    }
}

