package gofuture.acesso.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer> {

    AlunoEntity findByMatricula(int matricula);
    AlunoEntity deleteByMatricula(int matricula);
}
