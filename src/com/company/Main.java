package com.company;

public class Main {

    public static void main(String[] args) {




        AppMensualitePayer_moduls P1=new AppMensualitePayer_moduls();
        P1.p=100_000;
        P1.n=180;
        P1.r= 0.005f;
        M_impliment M=new M_impliment();

        System.out.println(M.calculTotal(P1));

    }

}
