package com.company;


public class Main {

    public static void main(String[] args) {
        TokoABC toko = new TokoABC();

        ATK pensil = new ATK("A001", "Pensil", "Alat Tulis", 6);
        ATK pulpen = new ATK("A002", "Pulpen", "Alat Tulis", 10);
        ATK hvs    = new ATK("B001", "HVS", "Kertas", 100);
        ATK karton = new ATK("B002", "Karton", "Kertas", 50);

        Bag bodypack = new Bag("C001", "Bodypack", "Tas", 5);
        Bag tempatPensil = new Bag("C002", "Tempat Pensil", "Tas", 10);

        toko.addATK(pensil);
        toko.addATK(pulpen);
        toko.addATK(karton);
        toko.addBag(bodypack);
        toko.addATK(hvs);
        toko.addBag(tempatPensil);

//        toko.displayATK();


        toko.editATK("B001", new ATK("B003", "Koran", "Kertas", 4));
        toko.editBag("C001", new Bag("C001", "EXSPORT", "Tas", 5));

        toko.remove("B002");

        toko.displayATK();
        toko.displayBag();

    }
}

