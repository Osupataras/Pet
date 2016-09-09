package com.company;

/**
 * Created by Taras on 07.09.2016.
 */
public class TemperatureConverter {
    public double convertTemp (double temperature, char convertTo){
        double newtemperature=0;
        if (convertTo == 'F'){
            System.out.println("Температура должна быть конвертирована в Фарангейты");
            newtemperature=1.8*temperature+32;
            System.out.println(+temperature+" градусов,в фарангейтах это "+newtemperature);
        }
        else if (convertTo == 'C'){
            System.out.println("Температура должна быть конвертирована в Цельсии");
            newtemperature=0.55*(temperature-32);
            System.out.println(+temperature+" градусов, в Цельсиях это "+newtemperature );
        }
        else{
            System.out.println("Такой системы нет!");
        }
    return newtemperature;
    }

}
