package service;

import domain.Categoria;
import domain.Pessoa;

import java.math.BigDecimal;

public class Imc extends Cadastro {

    public Imc(Cadastro cadastro) {
        super(cadastro);
    }

    public BigDecimal calcularImc() {

        BigDecimal imc = getPeso().divide(getAltura().multiply(getAltura()), 2, BigDecimal.ROUND_HALF_UP);

        return imc;
    }


    public void categoria() {
        Categoria categoria = null;
        BigDecimal imc = calcularImc();
        System.out.println("Seu IMC é: " + imc);


        if (imc.compareTo(new BigDecimal("18.5")) < 0) {
            System.out.println("Você está: " +categoria.ABAIXO_DO_PESO);

        } else if (imc.compareTo(new BigDecimal("18.5")) >= 0 && imc.compareTo(new BigDecimal("24.9")) <= 0) {
            System.out.println("Você está: " +categoria.PESO_NORMAL);
        } else if (imc.compareTo(new BigDecimal("25")) >= 0 && imc.compareTo(new BigDecimal("29.9")) <= 0) {
            System.out.println("Você está: " +categoria.ACIMA_DO_PESO);
        } else if (imc.compareTo(new BigDecimal("30")) >= 0) {
            System.out.println("Você está: " +categoria.OBESIDADE);



        }


    }
}
