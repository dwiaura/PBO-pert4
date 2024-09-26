public class Main {
    public static void main(String[] args) {
        //Membuat array dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        //Isi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new SmartPhone("Samsung", "Galaxy S24");
        daftarHandphone[1] = new FeaturePhone("Nokia", "3310");

        //Loop untuk memanggil metode dengan polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.telepon("08123456789");
            hp.matikan();
            System.out.println();
        }

        //Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof SmartPhone) {
                ((SmartPhone) hp).aksesInternet();
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }
    }
    
}