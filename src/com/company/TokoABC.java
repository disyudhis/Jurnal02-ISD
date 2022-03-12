package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class TokoABC{
        private ArrayList<ATK> listATK = new ArrayList<>();
        private ArrayList<Bag> listBag = new ArrayList<>();

        public void addATK(ATK atk) {
            listATK.add(atk);
            Collections.sort(listATK);
        }

        public void addBag(Bag bag) {
            listBag.add(bag);
            Collections.sort(listBag);
        }

        public void remove(String kode) {
            if (kode.contains("A") || (kode.contains("B"))) {
                for (ATK atk : listATK) {
                    if (atk.getKodeBarang().equals(kode)) {
                        listATK.remove(atk);
                    }
                }
            } else if (kode.contains("C")) {
                for (Bag bag : listBag) {
                    if (bag.getKodeBarang().equals(kode)) {
                        listBag.remove(bag);
                    }
                }
            }
        }

        public void editATK(String kode, ATK atkBaru) {
            for (int i = 0; i < listATK.size(); i++) {
                if (listATK.get(i).getKodeBarang().equals(kode)){
                    listATK.set(i, atkBaru);
                }
            }
        }

        public void editBag(String kode, Bag bagBaru){
            for (int i = 0; i < listBag.size(); i++) {
                if (listBag.get(i).getKodeBarang().equals(kode)){
                    listBag.set(i, bagBaru);
                }
            }
        }


        public void displayATK(){
            Collections.sort(listATK);
            for (ATK atk : listATK) {
                System.out.println(atk);
            }
        }

        public void displayBag(){
            Collections.sort(listBag);
            for (Bag bag : listBag) {
                System.out.println(bag);
            }
        }

    }