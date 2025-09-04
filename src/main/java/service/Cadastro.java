package service;


import domain.InvalidInput;
import domain.Pessoa;



import java.math.BigDecimal;
import java.util.Scanner;

public class Cadastro extends Pessoa {
    Scanner sc = new Scanner(System.in);

    public Cadastro() {
        super();
    }

    public Cadastro(Cadastro cadastro) {
        super(); // chama construtor de Pessoa
        setPeso(cadastro.getPeso());
        setAltura(cadastro.getAltura());
        setSexo(cadastro.getSexo());
        setTemperaturaCorporal(cadastro.getTemperaturaCorporal());
    }


    public void cadastrar(){
        while (true) {
            System.out.println("Digite seu sexo (M/F): ");
            String InputSexo = sc.nextLine().toUpperCase();
            try {
                if (!InputSexo.equalsIgnoreCase("M") && !InputSexo.equalsIgnoreCase("F")) {
                    throw new InvalidInput("Sexo inválido");
                }else {
                    setSexo(InputSexo);
                    break;
                }



            } catch (InvalidInput e) {
                System.out.println("Entrada inválida. Por favor, digite 'M' para masculino ou 'F' para feminino.");
            }

        }


            while (true){
                System.out.println("Digite seu peso (kg): ");
                String InputPeso = sc.nextLine().replace(',','.');

                try {
                    if (new BigDecimal(InputPeso).compareTo(BigDecimal.ZERO) > 0){
                        setPeso(new BigDecimal(InputPeso));
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Por favor, digite um número válido para o peso.");
                }

            }

            while (true){
                System.out.println("Digite sua altura (m): ");
                String InputAltura = sc.nextLine().replace(',','.');
                try {
                    if (new BigDecimal(InputAltura).compareTo(BigDecimal.ZERO) > 0){
                        setAltura(new BigDecimal(InputAltura));
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Por favor, digite um número válido para a altura.");
                }
            }
            while (true){
                System.out.println("Digite sua temperatura corporal (°C): ");
                String InputTemperatura = sc.nextLine().replace(',','.');
                try {
                    if (new BigDecimal(InputTemperatura).compareTo(BigDecimal.ZERO) > 0){
                        setTemperaturaCorporal(new BigDecimal(InputTemperatura));
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Por favor, digite um número válido para a temperatura corporal.");
                }
            }








    }


}
