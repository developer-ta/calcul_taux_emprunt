package com.company;

public class M_impliment implements CalculFunction_Interface {


    @Override
    public double calculTotal(AppMensualitePayer_moduls mo) {

        double M = calculA(mo) / calculB(mo);
        return M;
    }


    @Override
    public double calculA(AppMensualitePayer_moduls modul) {

        double pow = Math.pow((1 + modul.r), modul.n);
        double resulta = (modul.r * pow) * modul.p;
        return resulta;
    }

    @Override
    public double calculB(AppMensualitePayer_moduls modul) {
        double pow = Math.pow((1 + modul.r), modul.n);
        double resultb = pow - 1;
        return resultb;
    }
}
