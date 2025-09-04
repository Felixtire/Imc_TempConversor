package com.exemplo;

import domain.Pessoa;
import service.Cadastro;
import service.Conversor_Temp;
import service.Imc;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {



        Cadastro cadastro = new Cadastro();
        cadastro.cadastrar();
        System.out.println(cadastro.toString());

        Imc imc = new Imc(cadastro);
        imc.calcularImc();
        imc.categoria();

        Conversor_Temp conversorTemp = new Conversor_Temp(cadastro);
        conversorTemp.converterCelsius();






    }
}
