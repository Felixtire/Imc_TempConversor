package cli;

import persistence.Repository;
import service.Cadastro;
import service.Conversor_Temp;
import service.Imc;

public class CliParsing {
    public static void main(String[] args) {

        Repository repository =new Repository();
        Cadastro cadastro = repository.carregar();
        if (cadastro == null) {
            cadastro = new Cadastro();
        }
        Conversor_Temp conversorTemp = new Conversor_Temp(cadastro);


        if (args.length == 0){
            System.out.println("Bem-vindo ao programa de cálculo de IMC e conversão de temperatura!");
            return;
        }

        String comando = args[0].toLowerCase();

        switch (comando) {
            case "cadastrar" -> {
                System.out.println("Cadastre-se");
                cadastro.cadastrar();
                repository.salvar(cadastro);
                System.out.println(cadastro.toString());


            }

            case "imc" ->{
                if (cadastro.getAltura() ==null || cadastro.getPeso() ==null){
                    System.out.println("Por favor, cadastre-se primeiro usando o comando 'cadastrar'.");

                }else {
                    Imc imc= new Imc(cadastro);
                    imc.categoria();
                    imc.calcularImc();

                }

            }


            case "converter" -> conversorTemp.converterCelsius();

            default ->
                    System.out.println("Comando não reconhecido. Use 'cadastrar', 'imc', 'categoria' ou 'converter'.");


        }






    }
}
