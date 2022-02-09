package com.company;

public class M_impliment implements CalculFunction_Interface {


    @Override
    public double calculTotal(AppMensualitePayer_moduls mo) {

        return calculA(mo) / calculB(mo);
    }


    @Override
    public double calculA(AppMensualitePayer_moduls modul) {

        double pow = Math.pow((1 + modul.r), modul.n);
        return (modul.r * pow) * modul.p;
    }

    @Override
    public double calculB(AppMensualitePayer_moduls modul) {
        double pow = Math.pow((1 + modul.r), modul.n);
        return pow - 1;
    }
}
