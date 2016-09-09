package com.company;

public class Main {

    public static void main (String[] args){
        TemperatureConverter TC = new TemperatureConverter();
        TC.convertTemp(30,'F');
        TC.convertTemp(40,'F');
        TC.convertTemp(50,'F');
        TC.convertTemp(30,'C');
        TC.convertTemp(40,'C');
        TC.convertTemp(50,'C');
        TC.convertTemp(60,'R');

    }


}


