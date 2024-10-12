package gofuture.acesso.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PessoasApplication {

    /**O Service encapsula a lógica de negócio da aplicação. Ele é responsável por manipular as regras de negócio de
    maneira desacoplada do Controller e do Repository**/

    public static void main(String[] args) {
        SpringApplication.run(PessoasApplication.class, args);

    }
}
