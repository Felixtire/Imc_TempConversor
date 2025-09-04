package persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Pessoa;
import service.Cadastro;

import java.io.File;
import java.io.IOException;


public class Repository {

    private  static final String FILE_PATH = "cadastro.json";
    private ObjectMapper mapper = new ObjectMapper();


    public void salvar(Pessoa pessoa) {
        try {
            mapper.writeValue(new File(FILE_PATH), pessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Cadastro carregar() {

            try {
                return mapper.readValue(new File(FILE_PATH), Cadastro.class);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

}
