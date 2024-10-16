package gofuture.acesso.controller;

import gofuture.acesso.pessoa.AlunoRequestDTO;
import gofuture.acesso.repository.AlunoEntity;
import gofuture.acesso.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//C-CREATE R-READ U-UPDATE D-DELETE
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@RestController
public class AlunoController {

    private final AlunoService service;

    @PostMapping
    public void createAluno(@RequestBody AlunoRequestDTO dto){
        service.createAluno(dto);
    }

    @GetMapping
    public List<AlunoEntity> entityList(){
      return service.findAll();
    }




}
