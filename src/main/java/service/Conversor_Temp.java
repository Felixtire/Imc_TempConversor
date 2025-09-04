package service;

import java.math.BigDecimal;

public class Conversor_Temp  extends  Cadastro{

    public Conversor_Temp(Cadastro cadastro){
        super(cadastro);
    }


    public void converterCelsius(){
        BigDecimal tempCelsius = getTemperaturaCorporal();
        BigDecimal tempFahrenheit = tempCelsius.multiply(new BigDecimal("9")).divide(new BigDecimal("5"),
                2, BigDecimal.ROUND_HALF_UP).add(new BigDecimal("32"));

        System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit + " °F");

    }



}
