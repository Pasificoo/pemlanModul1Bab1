public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double rubahSekon(double waktu) {
        return waktu * 3600;
    }
    private int  rubahKecepatan(int kmh){
        return kmh * 1000 / 3600;
    }
    public double hitungJarak(){
        return kecepatan * waktu;
    }

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(int i){
        kecepatan = rubahKecepatan(i);
    }

    public void setWaktu(double w){
        waktu = rubahSekon(w);
    }

    public void displayMessage(){

        double jarak = hitungJarak();
        double jarakKm = jarak / 1000;
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Memiliki warna " + warna);
        System.out.println("Kecepatan mobil " + kecepatan + " m/s");
        System.out.println("Waktu tempuh " + waktu + " detik");
        System.out.println("Jarak tempuh " + hitungJarak() + " meter");
        System.out.println("Jarak tempuh " + jarakKm + " kilometer");
    }

    }
