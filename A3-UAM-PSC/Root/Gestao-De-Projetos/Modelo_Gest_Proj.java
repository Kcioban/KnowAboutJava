import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;
    private Perfil perfil; 
}

// O enum Perfil para os diferentes tipos de usuário
public enum Perfil {
    ADMINISTRADOR,
    GERENTE,
    COLABORADOR
}

public class Projeto {
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataTerminoPrevista;
    private StatusProjeto status; 
    private Usuario gerenteResponsavel; 
}

// O enum StatusProjeto para os diferentes status
public enum StatusProjeto {
    PLANEJADO,
    EM_ANDAMENTO,
    CONCLUIDO,
    CANCELADO
}

public class Equipe {
    private String nome;
    private String descricao;
    private List<Usuario> membros; 
    
    public Equipe() {
        this.membros = new ArrayList<>();
    }
}
