
    public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(int k){
        kecepatan = rubahKecepatan(k);
    }

    public void setWaktu(double w){
        waktu = rubahSekon(w);
    }

    private double rubahSekon(double jam){
        return jam * 3600;
    }

    private double rubahKecepatan(double kmh){
        return (kmh * 1000) / 3600;
    }

    public double hitungJarak(){
        return kecepatan * waktu;
    }

    public void displayMessage(){

        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Memiliki warna " + warna);

        double jarak = hitungJarak();
        double jarakKm = jarak / 1000;

        System.out.println("Jarak yang dapat ditempuh adalah " + jarakKm + " km");
    }
}
