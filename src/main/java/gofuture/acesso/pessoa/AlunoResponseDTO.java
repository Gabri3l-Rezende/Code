package gofuture.acesso.pessoa;

public record AlunoResponseDTO(Long id, String login, String senha) {
    public AlunoResponseDTO(Aluno aluno){
        this(aluno.getId(), aluno.getLogin(), aluno.getSenha());
    }
}
