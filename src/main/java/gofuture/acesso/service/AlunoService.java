package gofuture.acesso.service;

import gofuture.acesso.pessoa.AlunoRequestDTO;
import gofuture.acesso.repository.AlunoEntity;
import gofuture.acesso.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public void createAluno(AlunoRequestDTO dto){
        var entity = AlunoEntity.builder()
                .login(dto.login())
                .senha(dto.senha())
                .build();

        alunoRepository.save(entity);
    }

    public List<AlunoEntity> findAll(){
       return alunoRepository.findAll();
    }

    public AlunoEntity findByMatricula(int matricula){
        return alunoRepository.findByMatricula(matricula);
    }

     public void deleteByMatricula(int matricula){
        alunoRepository.deleteByMatricula(matricula);
    }

}

