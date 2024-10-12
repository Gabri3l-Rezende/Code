package gofuture.acesso.repository;


import gofuture.acesso.pessoa.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**O Repository é responsável pela interação com o banco de dados.
 Ele encapsula a lógica de acesso a dados **/



//@Repository ela permite voce interagir com o banco de dados
@Repository
public interface PessoaRepository extends JpaRepository<Aluno, Long> {

}
