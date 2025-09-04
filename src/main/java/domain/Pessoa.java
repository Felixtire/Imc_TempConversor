package domain;

import java.math.BigDecimal;

public class Pessoa {
    private BigDecimal peso, altura, temperaturaCorporal;
    private String sexo;



    public Pessoa(BigDecimal peso, BigDecimal altura, BigDecimal temperaturaCorporal, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.temperaturaCorporal = temperaturaCorporal;
        this.sexo = sexo;

    }

    public Pessoa() {
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(BigDecimal temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", temperaturaCorporal=" + temperaturaCorporal +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
