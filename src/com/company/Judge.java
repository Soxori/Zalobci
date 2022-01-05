package com.company;

public class Judge {
    final int rok;
    final String zalobce;
    final double castka;

    public Judge(String[] judge) {
        this.rok = Integer.parseInt(judge[0]);
        this.zalobce = judge[1];
        this.castka = Double.parseDouble(judge[2]);
    }
}
