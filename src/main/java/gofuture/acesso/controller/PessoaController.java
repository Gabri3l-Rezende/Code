package gofuture.acesso.controller;

import gofuture.acesso.pessoa.Aluno;
import gofuture.acesso.pessoa.AlunoRequestDTO;
import gofuture.acesso.pessoa.AlunoResponseDTO;
import gofuture.acesso.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**O Controller lida com as requisições e respostas
 (geralmente uma interface gráfica ou API) e a lógica de negócio. **/

//@RestController indica para o framework Spring que essa classe é um controller da nossa aplicacao
@RestController

//@RequestMapping esta mapeando os ENDPOINT relacionados a pessoas.
@RequestMapping("pessoa")
public class PessoaController {

    //@Autowired ele faz a injecao de dependencia porque nao estamos instanciando
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void saveAluno(@RequestBody AlunoRequestDTO data){
        Aluno alunoData = new Aluno(data);
        repository.save(alunoData);

    }

    //O metodo GET significa "Pegar", ou seja, ele vai pegar no banco de dados.
    @GetMapping
    public List<AlunoResponseDTO> getAll(){


        List<AlunoResponseDTO> pessoaList = repository.findAll().stream().map(AlunoResponseDTO:: new).toList();
        return pessoaList;
    }
}
