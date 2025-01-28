package javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);
        if (seminarios == null) return;
        System.out.println("Nome do(s) seminário ministrado pelo professor: " );
        for (int i = 0; i < seminarios.length; i++) {
            System.out.println(i+1 + "º seminário: " + seminarios[i].getTitulo());
        }
        System.out.println();
        System.out.println("####### Fim das informações de seminário #######");
        System.out.println("#################################################");

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
