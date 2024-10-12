package gofuture.acesso.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "alunos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String email;
    private Long id;
    private String senha;
    private String login;
    private Integer idade;
    private String curso;


    public Aluno(AlunoRequestDTO data){
        this.login = data.login();
        this.senha = data.senha();
    }
}
